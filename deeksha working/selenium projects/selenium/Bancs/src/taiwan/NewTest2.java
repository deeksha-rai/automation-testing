package taiwan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class NewTest2  {
	public static WebDriver wd;
	 @BeforeTest(alwaysRun=true)
	 @Parameters({"user","pwd"})
    public void login_screen(String user,String pwd)
		{
			File file = new File("C:/Program Files/Internet Explorer/iexplore.exe");
			System.setProperty("Webwd.ie.wd", file.getAbsolutePath());
		    wd = new InternetExplorerDriver();
			wd.get("http://172.21.157.107:18000/Bancs/common/dologin.jsp?method=authMode");
			wd.navigate().refresh();
			wd.manage().window().maximize();
		 
		   
		   try{
			   WebElement username = wd.findElement(By.id("userId"));
			   username.sendKeys(user);
			   WebElement password = wd.findElement(By.id("password"));
			   password.sendKeys(pwd);
		 	   Thread.sleep(100L);
		 	   WebElement oupca =  wd.findElement(By.id("entity"));
		 	   oupca.click();
		 	   Select select = new Select(oupca);
		 	   select.selectByValue("GBTMUTWTWN");
		 	   
		 	   WebElement login = wd.findElement(By.id("Login"));
		 	   login.click();
		 	   wd.manage().window().maximize();
		 	   System.out.println("logged in");
		 	   Thread.sleep(3000);
		 	   wd.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		   }
		      catch (InterruptedException e) {
					e.printStackTrace();
				}
		   
			   catch(Exception e)
			   {
				   e.printStackTrace();
			   }
		
		  
		}
    
   
@AfterMethod(groups = { "PostFileAuthorisation" })
	
	public void Wizard()
	{	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Wizard is opened");	
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  wd.switchTo().defaultContent();
		wd.findElement(By.id("stppopup_text")).click();
		System.out.println("Wizard is selected");	
		
	}
	@Test (groups = { "PostFileAuthorisation" },priority=3)
	public void Workitem( )
	{
		System.out.println("Work item window is opened");	
		Set<String> s = wd.getWindowHandles();
		for (String windowObject : s) {
			wd.switchTo().window(windowObject);
		} 
		WebDriverWait wait = new WebDriverWait(wd, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td/table/tbody/tr[4]/td[4]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("tdtext3"))).click();
		System.out.println("Work item window is clicked");
		WebDriverWait wait1 = new WebDriverWait(wd, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td[4]/span/table/tbody/tr[2]/td[4]/a"))).click();

		System.out.println("Workitem details is selected");	
		wd.switchTo().frame("panel6");
		Actions oAction = new Actions(wd);
		WebElement ab= wd.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]"));
		oAction.moveToElement(ab);
		oAction.contextClick(ab).build().perform();  /* this will perform right click */
		System.out.println("right click is performed");	
		wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
		System.out.println("repair is performed");
		 wd.switchTo().defaultContent();
		wd.switchTo().frame("panel7");
		WebDriverWait wait3 = new WebDriverWait(wd, 20);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("butName_11"))).click();
	System.out.println("released is performed");	
	}
	@Test (groups = { "PostFileAuthorisation" },priority=1)
			public void Ordersummary ( )
			{
				 System.out.println("Entered ordersummary");
				 Set<String> s = wd.getWindowHandles();
					for (String windowObject : s) {
						wd.switchTo().window(windowObject);
					} 
					WebDriverWait wait = new WebDriverWait(wd, 20);
					wait.until(ExpectedConditions.elementToBeClickable(By.id("tdtext1"))).click();
					 System.out.println("clicked ordersummary");
				wd.findElement(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table/tbody/tr/td[3]/table/tbody/tr/td[2]/span/table/tbody/tr[2]/td[4]/a")).click();
				 System.out.println("Remitence clicked");
				 System.out.println("Go to wizard for credit order master");
			}
		

@Test (groups = { "PostFileAuthorisation" },priority=0)
		public void Filerelease (  ){
				  System.out.println("Entered file release");
			      wd.switchTo().defaultContent();
				wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				wd.findElement(By.xpath("//span[@id='tabText_0']")).click();
		        System.out.println("menu clicked");
		        System.out.println("Navigate to Service Integrator");
			    wd.findElement(By.xpath("//span[@title='Service Integrator']")).click();
			    WebElement webobject2 = wd.findElement(By.xpath("//p[@title='Message List']"));
			    webobject2.click();
				System.out.println("Message List is opened");
				wd.switchTo().frame("panel2");
				System.out.println("frame switch");
				WebElement Source_sys = wd.findElement(By.xpath("/html/body/form/div/table/tbody/tr/td[2]/div/span/span/input"));
				Source_sys.click();
				System.out.println("Element found");
				Source_sys = wd.findElement(By.xpath("/html/body/form/div[4]/li[2]"));
			    Source_sys.click();
				System.out.println("files is selected");
				wd.findElement(By.xpath("/html/body/form/div/table/tbody/tr/td[6]/div/span/span/input")).sendKeys("Uploaded");
				System.out.println("status textbox is selected");
				System.out.println("uploaded is selected");
		Source_sys = wd.findElement(By.xpath("/html/body/form/div/div[3]/div[2]/input"));
			    Source_sys.click();
				System.out.println("Search is clicked");
				wd.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
				System.out.println("now to click wizard for order summary");
				wd.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
				  wd.switchTo().defaultContent();
				}
		@Test (groups = { "PostFileAuthorisation" },priority=4)
	public void Auth_workitem( )
			{
				System.out.println("Work item window is opened");	
				Set<String> s = wd.getWindowHandles();
				for (String windowObject : s) {
					wd.switchTo().window(windowObject);
				} 
				WebDriverWait wait = new WebDriverWait(wd, 20);
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td/table/tbody/tr[4]/td[4]"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.id("tdtext3"))).click();
				System.out.println("Work item window is clicked");
				WebDriverWait wait1 = new WebDriverWait(wd, 20);
				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td[4]/span/table/tbody/tr[2]/td[4]/a"))).click();
			    System.out.println("Workitem details is selected");
			    wd.switchTo().frame("panel6");
				Actions oAction = new Actions(wd);
				WebElement ab= wd.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]"));
				oAction.moveToElement(ab);
				oAction.contextClick(ab).build().perform();  /* this will perform right click */
				System.out.println("right click is performed");	
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td"))).click();
				System.out.println("authorise found and clicked");
				wd.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
			wd.switchTo().defaultContent();
				 wd.switchTo().frame("panel7");
				WebElement abc= wd.findElement(By.xpath("//input[@id='ct_ct_Payments_dup_wca_ORGNL_INSTRCTD_AMT']"));
				System.out.println("element clicked");	
				 String txt=abc.getText();
				System.out.println("Value is fetched in string");	
				WebDriverWait wait3 = new WebDriverWait(wd, 20);
				wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ct_ct_Payments_dup_wca_AMT']"))).sendKeys(txt);
				System.out.println("value sent to text box");	
				WebDriverWait wait4 = new WebDriverWait(wd, 20);
				wait4.until(ExpectedConditions.elementToBeClickable(By.id("butName_12"))).click();
				System.out.println("Authorise is performed");	
				WebDriverWait wait5 = new WebDriverWait(wd, 20);
				wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
				 System.out.println("Save is clicked");	
			}
			
@Test (groups = { "PostFileAuthorisation" },priority=2)
	public void Creditorder ()  
	{
		 System.out.println("Entered CreditOrder Master details");
		 Set<String> s = wd.getWindowHandles();
			for (String windowObject : s) {
				wd.switchTo().window(windowObject);
			} 
			WebDriverWait wait = new WebDriverWait(wd, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td/span/table/tbody/tr[2]/td[4]/a"))).click();
		System.out.println("clicked credit order master");
		 System.out.println("Go to wizard for work item details");
		 wd.switchTo().frame("panel5");
	}

 

}
