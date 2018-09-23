package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;


public class locatorread {
	static Properties prop;
	
	public static By readingPropertyValues(String propertyAttribute) throws Exception {
		
		FileInputStream fis = new FileInputStream(ConstantValues.propertiesfile);
		prop = new Properties();
		prop.load(fis);
		fis.close();
		String propertyvalues = prop.getProperty(propertyAttribute);
		String locatorType = propertyvalues.split(":")[0];
		String locatorValue = propertyvalues.split(":")[1];
		
		if (locatorType.equalsIgnoreCase("Name")) {
			return By.name(locatorValue);
		} else if (locatorType.equalsIgnoreCase("id")) {
			return By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			System.out.println(locatorValue);
			return By.xpath(locatorValue);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			return By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			return By.partialLinkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("css"))
		{ System.out.println(locatorValue);
			return By.cssSelector(locatorValue);
		}
		else if (locatorType.equalsIgnoreCase("classname"))
		{ System.out.println(locatorValue);
			return By.className(locatorValue);
		}
		else
			
		return null; 
		}
	}

