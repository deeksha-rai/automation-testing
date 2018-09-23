package commonMethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.ConstantValues;
import Utilities.locatorread;
import driverScript.Script;

public class Commonmeths {

	static WebDriver driver;
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", ConstantValues.chromedriverexe);
		driver=new ChromeDriver();
	}
	public static void openWebsite(String sitename)
	{
		System.out.println(ConstantValues.websiteURL+ "Common methods");
		driver.get(sitename);
	}
	 public static void handlingtextboxes(String propertyAttribute, String ipName) throws Exception  {
		  
				WebElement Username = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				Username.sendKeys(ipName);				
		} 
	 public static void handlingIntegertextboxes(String propertyAttribute, int ipName) throws Exception  {
		  
			WebElement Phone = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
			String phone=Integer.toString(ipName);
			Phone.sendKeys(phone);				
	} 

	 public static String handlingtext(String propertyAttribute) throws Exception  {
		  
				WebElement Primary = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				String primary=Primary.getText();
				return primary;
		} 
	 public static void handlingClicks(String propertyAttribute) throws Exception {
			  try {
					WebElement submitButton = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
					submitButton.click();		
			} catch (Exception e) {
				e.printStackTrace();
				Script.bValue = false;	
				//Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
			}

		  }
	 public static void handlingdropdowns(String propertyAttribute, String ipName) throws Exception {
		  try {
				WebElement enterCountry = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				Select selcountry = new Select(enterCountry);
				selcountry.selectByVisibleText(ipName);				
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			//Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}
 		
	  	}
	 public static void handlingIntdropdowns(String propertyAttribute, int ipName) throws Exception {
		  try {
				WebElement departDate = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				Select d = new Select(departDate);
				String date=Integer.toString(ipName);
				d.selectByVisibleText(date);			
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			//Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}
		
	  	}
}
