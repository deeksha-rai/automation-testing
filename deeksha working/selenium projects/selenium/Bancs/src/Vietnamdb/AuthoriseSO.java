package Vietnamdb;



import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Vietnamdb.Create;

public class AuthoriseSO {

public WebDriver LogIn() throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:/Vikas kapoor selenium notes/chromedriver.exe");
        WebDriver driver = new   ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://172.21.163.65:24000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null&status=null");
		driver.manage().window().maximize();
		driver.findElement(By.name("userId")).sendKeys("pat8");
		
		WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys("tcs123");
		 
			password.sendKeys(Keys.RETURN);
		
			driver.findElement(By.id("Login")).submit();
			System.out.println("logged in");
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("userMenu")).click();
			System.out.println("menu clicked");
			driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
			
			WebElement webobject1 = driver.findElement(By.xpath("//a[@title='Standing Orders List']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject1);
		    System.out.println("Standing Orders List opened clicked");
		    

			
			driver.switchTo().frame("panel2");
			
			 
		return driver;
			
		
	}
public void AuthRem(WebDriver dr)



{
	
	try
	{	
		 Thread.sleep(2000);
		 dr.findElement(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_CASL_From)")).clear();
	 dr.findElement(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_CASL_From)")).sendKeys("1617");
    Thread.sleep(2000);
	System.out.println("pos num entered");
    dr.findElement(By.id("Search")).click();
	Thread.sleep(2000);
	WebElement tabclicks = dr.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[7]"));
		//commands for right click
		Actions action = new Actions(dr).contextClick(tabclicks);
		action.build().perform();
		System.out.println("right click");
		Thread.sleep(3000);
		 WebDriverWait wait13 = new WebDriverWait(dr, 20);
	    	wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/form/div/div/ul/li[4]/input"))).click();
	   // 	Thread.sleep(2000);
	    	System.out.println("Authorise is clicked");
		Thread.sleep(5000);
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame("panel3");
		
		 WebDriverWait wait14 = new WebDriverWait(dr, 20);
	    	wait14.until(ExpectedConditions.elementToBeClickable(By.id("Authorise52"))).click();
		
		
	WebDriverWait wait6 = new WebDriverWait(dr, 20);
	//wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
	wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
	 System.out.println("Save is clicked");	
	
	 Alert save = dr.switchTo().alert();
		save.accept();
	System.out.println("AUTH DONE***************************");
	
	
	 
	 
	 
	
	
	}
	catch(Exception e)
	{
		
	}
	return;
		
	}


}


