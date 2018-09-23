package VietnammanualSanity;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement; 
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	  
import VietnammanualSanity.Taiwanmanual;

public class Taiwanauth {
	
	public WebDriver LogInauthunitary() throws InterruptedException

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
			driver.findElement(By.xpath("//a[@title='Remittance List']")).click();
			
			driver.switchTo().frame("panel2");
			
			 
		return driver;
			
	}
	
	
	public WebDriver LogInauthbulk() throws InterruptedException

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
			driver.findElement(By.xpath("//a[@title='Order Master List']")).click();
			
			driver.switchTo().frame("panel2");
			
			 
		return driver;
			
	}

	
public void AuthRem(WebDriver dr, String remId,int i)
	
	
	
	{
		
		try
		{	
			 Thread.sleep(2000);
			 dr.findElement(By.id("propertyMap(MCB_SearchWC_wca_REF_NUM_RNGVAL_From)")).clear();
		 dr.findElement(By.id("propertyMap(MCB_SearchWC_wca_REF_NUM_RNGVAL_From)")).sendKeys(remId);
        Thread.sleep(2000);
		//System.out.println("pos num entered");
        dr.findElement(By.id("Search")).click();
		Thread.sleep(2000);
		dr.switchTo().defaultContent();
		WebElement wizard = dr.findElement(By.id("wizard"));
		wizard.click();
		//System.out.println("Wizard button clicked");	
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(dr, 20);
    	wait1.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_4"))).click();
    System.out.println("Workitem details is selected");	 //update button on wizard
		Thread.sleep(1000);
		           		
		WebDriverWait wait3 = new WebDriverWait(dr, 20);
    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[5]/ul/li[2]/label[3]/a"))).click();
      //  wd.switchTo().frame("detailTable4");  
    	System.out.println("remittance id clicked");
        Thread.sleep(5000);
       
        dr.switchTo().defaultContent();		
        dr.switchTo().frame("panel"+(3+i));     //i is for panel switch 
		Thread.sleep(1000);
		//dr.findElement(By.linkText(remId)).click();
		
		  
       // dr.switchTo().frame("panel3");      //i is for panel switch 
		  WebElement tabclicks = dr.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[4]/table/tbody/tr/td[7]"));
			//commands for right click
			Actions action = new Actions(dr).contextClick(tabclicks);
			action.build().perform();
			System.out.println("right click");
			Thread.sleep(3000);
			//Authorise command:
			//wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
			
			 WebDriverWait wait13 = new WebDriverWait(dr, 20);
		    	wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td/input"))).click();
		   // 	Thread.sleep(2000);
		    	System.out.println("Authorise is clicked");
			Thread.sleep(5000);
			dr.switchTo().defaultContent();
			
			dr.switchTo().frame("panel"+(3+i+1)); 
			//dr.switchTo().frame("panel4");	  // switch to auth screen
		WebDriverWait wait4 = new WebDriverWait(dr, 20);
		
		//wait4.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT"))).sendKeys(Integer.toString(Create_BT.amount));
		//wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/fieldset/ul/li[12]div/input"))).sendKeys("1900");
		//System.out.println("value sent to text box");
		WebDriverWait wait5 = new WebDriverWait(dr, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
		System.out.println("Authorise is performed");	
		WebDriverWait wait6 = new WebDriverWait(dr, 20);
		//wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
		 System.out.println("Save is clicked");	
		
		 Alert save = dr.switchTo().alert();
			save.accept();
		System.out.println("AUTH DONE***************************");
		
		Set<String> s = dr.getWindowHandles();
		for (String windowObject : s) {
			dr.switchTo().window(windowObject);
		} 
		
		dr.findElement(By.xpath("html/body/div[2]/div[4]/div/ul/div/span/li[3]/span[2]")).click();
		System.out.println("close clicked");
		dr.switchTo().defaultContent();
		dr.switchTo().frame("panel2");
		Thread.sleep(3000);
		 
		 
		 
		
		
		}
		catch(Exception e)
		{
			
		}
		return;
			
		}
	
	
public void Authorder(WebDriver dr, String remId,int i)
	
	
	
	{
		
		try
		{	
			 Thread.sleep(2000);
			 dr.findElement(By.id("propertyMap(MCB_SearchWC_wca_MIRN_RNGVAL_From)")).clear();
		 dr.findElement(By.id("propertyMap(MCB_SearchWC_wca_MIRN_RNGVAL_From)")).sendKeys(remId);
        Thread.sleep(2000);
		//System.out.println("pos num entered");
        dr.findElement(By.id("Search")).click();
		Thread.sleep(2000);
		dr.switchTo().defaultContent();
		WebElement wizard = dr.findElement(By.id("wizard"));
		wizard.click();
		//System.out.println("Wizard button clicked");	
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(dr, 20);
    	wait1.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_3"))).click();
    System.out.println("Workitem details is selected");	 //update button on wizard
		Thread.sleep(1000);
		           		
		WebDriverWait wait3 = new WebDriverWait(dr, 20);
    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[4]/ul/li[2]/label[3]/a"))).click();
      //  wd.switchTo().frame("detailTable4");  
    	System.out.println("remittance id clicked");
        Thread.sleep(5000);
       
        dr.switchTo().defaultContent();		
        dr.switchTo().frame("panel"+(3+i));     //i is for panel switch 
		Thread.sleep(1000);
		//dr.findElement(By.linkText(remId)).click();
		
		  
       // dr.switchTo().frame("panel3");      //i is for panel switch 
		  WebElement tabclicks = dr.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[4]/table/tbody/tr/td[7]"));
			//commands for right click
			Actions action = new Actions(dr).contextClick(tabclicks);
			action.build().perform();
			System.out.println("right click");
			Thread.sleep(3000);
			//Authorise command:
			//wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
			
			 WebDriverWait wait13 = new WebDriverWait(dr, 20);
		    	wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td/input"))).click();
		   // 	Thread.sleep(2000);
		    	System.out.println("Authorise is clicked");
			Thread.sleep(5000);
			dr.switchTo().defaultContent();
			
			dr.switchTo().frame("panel"+(3+i+1)); 
			//dr.switchTo().frame("panel4");	  // switch to auth screen
		WebDriverWait wait4 = new WebDriverWait(dr, 20);
		
		//wait4.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT"))).sendKeys(Integer.toString(Create_BT.amount));
		//wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/fieldset/ul/li[12]div/input"))).sendKeys("1900");
		//System.out.println("value sent to text box");
		WebDriverWait wait5 = new WebDriverWait(dr, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
		System.out.println("Authorise is performed");	
		WebDriverWait wait6 = new WebDriverWait(dr, 20);
		//wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
		 System.out.println("Save is clicked");	
		
		 Alert save = dr.switchTo().alert();
			save.accept();
		System.out.println("AUTH DONE***************************");
		
		Set<String> s = dr.getWindowHandles();
		for (String windowObject : s) {
			dr.switchTo().window(windowObject);
		} 
		
		dr.findElement(By.xpath("html/body/div[2]/div[4]/div/ul/div/span/li[3]/span[2]")).click();
		System.out.println("close clicked");
		dr.switchTo().defaultContent();
		dr.switchTo().frame("panel2");
		Thread.sleep(3000);
		 
		 
		 
		
		
		}
		
		
		catch(Exception e)
		{
			
		}
		return;
			
		}
}
