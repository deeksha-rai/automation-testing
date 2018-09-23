package supportProviderUtilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class locatorread {
	static Properties prop;
	
public static By readingPropertyValues(String propertyAttribute) throws Exception {
		
		FileInputStream fis = new FileInputStream(ConstantsDeclared.propertiesfile);
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
			return By.xpath(locatorValue);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			return By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			return By.partialLinkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("cssselector")) {
			return By.cssSelector(locatorValue);
		}
		return null; 
		}
	

}
