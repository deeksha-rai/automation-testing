package commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverScript.Script;
import utilities.ConstantValues;
import utilities.Evidences;
import utilities.excelReadwrite;
import utilities.locatorread;

public class Commonmeths {
	
	 public static WebDriver driver;
	  
	  public static WebDriver selectBrowser(String brsName) {
		
			  System.setProperty("webdriver.chrome.driver", ConstantValues.chromedriverexe);
			 driver = new ChromeDriver();
		return driver;
	  }
	  
	  public static void openURL(String ipName) {
		  try {
			  driver.get(ipName);		
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;			
		}

	  }
	  
	  public static void handlingmousehoveringwithoutClick(String propertyAttribute) throws Exception {
		  try {
			  	WebElement membershiplink = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				Actions act = new Actions(driver);
				act.moveToElement(membershiplink).build().perform();			
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}
  		
	  }
	  
	  public static void handlingmousehoveringwithClick(String propertyAttribute) throws Exception {
		  try {
			  WebElement joinLink = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				Actions act = new Actions(driver);
				act.moveToElement(joinLink).click().build().perform();			
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}

	  }
	  
	  public static void scrolling() {
		  try {
		  		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  		jse.executeScript("scroll(0,400)");
		} catch (Exception e) {
			Script.bValue = false;	
			e.printStackTrace();
		}

	  }
	  
	  public static void handlingClicks(String propertyAttribute) throws Exception {
		  try {
				WebElement joinNowButton = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				joinNowButton.click();		
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}

	  }
	  
	  public static void fetchValue(String propertyAttribute) throws Exception {
		  try {
				WebDriverWait wait = new WebDriverWait(driver, 20);
				String cartValue = wait.until(ExpectedConditions.visibilityOf(driver.findElement(locatorread.readingPropertyValues(propertyAttribute)))).getText();
				excelReadwrite.writeToExcel("TestData", 3, 6, cartValue);
				System.out.println(cartValue);		
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}

	  }
	  
	  public static void handlingtextboxes(String propertyAttribute, String ipName) throws Exception {
		  try {
				WebElement enterfirstName = driver.findElement(locatorread.readingPropertyValues(propertyAttribute));
				enterfirstName.sendKeys(ipName);				
		} catch (Exception e) {
			e.printStackTrace();
			Script.bValue = false;	
			Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
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
			Evidences.getScreenshot((TakesScreenshot) driver, propertyAttribute);
		}
  		
	  	}
}
