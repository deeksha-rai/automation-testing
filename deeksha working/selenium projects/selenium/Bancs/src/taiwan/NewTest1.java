package taiwan;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
public class NewTest1  {
	public static  WebDriver wd;

	
 @BeforeTest(alwaysRun=true)
 @Parameters({"user","pwd"})
    public WebDriver login_screen(String user,String pwd)
		{
			File file = new File("C:/Program Files/Internet Explorer/iexplore.exe");
			System.setProperty("Webwd.ie.wd", file.getAbsolutePath());
		    wd = new InternetExplorerDriver();
			wd.get("http://172.21.157.107:18000/Bancs/common/dologin.jsp?method=authMode");
			//wd.navigate().refresh();
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
		return wd;
		  
		}

 @BeforeGroups(groups = "PostFileUpload")
  
  public void fileupload() throws InterruptedException{
	Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(wd, 20);
	 // wait.until(ExpectedConditions.elementToBeClickable(By.id("tabText_0"))).click();
		
	wd.findElement(By.id("tabText_0")).click();
	        System.out.println("menu clicked");
	        Thread.sleep(2000);
	       // WebElement webobject3 ;
	      //  webobject3 = wd.findElement(By.xpath("//span[@title='Service Integrator']"));
	       // ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject3);
	        wd.findElement(By.xpath("//span[@title='Service Integrator']")).click();
	        WebElement  webobject2 = wd.findElement(By.xpath("//p[@title='File Upload Details']"));
	        ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject2);
	      //  Thread.sleep(2000);
	      
	        
		    
			System.out.println("File Upload is openned");
			wd.switchTo().frame("panel2");
			 wd.findElement(By.xpath("/html/body/form/div/div/div/div/div/span/span[2]/img")).click();
			 wd.findElement(By.xpath("/html/body/form/div[4]/li[3]")).click();
			System.out.println("Source System is selected");
			wd.switchTo().frame("UploadFrame");
			WebElement abc= wd.findElement(By.xpath("/html/body/form/center/input"));
			String dir = "C:\\Users\\1210923\\Downloads\\Files\\";
			File f = new File(dir);
			File[] matchingFiles = f.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.startsWith("FD_") && name.endsWith("txt");
				}
			});

			File myfile = matchingFiles[0];
			String fname = myfile.getName();
			System.out.println(fname);
			abc.sendKeys("C:\\Users\\1210923\\Downloads\\Files" + fname);
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			wd.findElement(By.xpath("/html/body/form/center/input[2]")).click();
			System.out.println("upload clicked");
			 wd.switchTo().alert().accept();
			 System.out.println("File Acquired");
			 wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 wd.switchTo().defaultContent();
			 wd.switchTo().frame("panel2");
			 wd.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr/td[2]/div/a[4]/img")).click();
			 wd.switchTo().alert().accept();
			 System.out.println("File uploaded successfully");
			 Thread.sleep(12000);
			
	}
	@AfterMethod(groups = { "PostFileUpload" })
	@Test
	public void Wizard()
	{	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Wizard is opened");	
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  wd.switchTo().defaultContent();
		wd.findElement(By.id("stppopup_text")).click();
		System.out.println("Wizard is selected");	
		
	}
	@Test (groups = { "PostFileUpload" },priority=0)
	
	public void Release ( ) throws InterruptedException{
		  System.out.println("Entered file release");
		  Thread.sleep(5000);
	    wd.switchTo().defaultContent();
	    WebDriverWait wait = new WebDriverWait(wd, 20);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='tabText_0']"))).click();
		System.out.println("menu clicked");
	  System.out.println("Navigate to Service Integrator");
	  Thread.sleep(5000);
	  wd.findElement(By.xpath("//span[@title='Service Integrator']")).click();
	  Thread.sleep(5000);
	  WebElement webobject2 = wd.findElement(By.xpath("//p[@title='Message List']"));
	  webobject2.click();
		
		System.out.println("Message List is opened");
		
		wd.switchTo().frame("panel3");
		System.out.println("frame switch");
		WebDriverWait wait1 = new WebDriverWait(wd, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/table/tbody/tr/td[2]/div/span/span/input"))).click();
		System.out.println("Element found");
		WebElement Source_sys = wd.findElement(By.xpath("/html/body/form/div[4]/li[2]"));
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
  
  
  @Test (groups = { "PostFileUpload" },priority=2)
	
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

  
  @Test (groups = { "PostFileUpload"},priority=3)
	
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
		oAction.contextClick(ab).build().perform();  
		System.out.println("right click is performed");	
		wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
		System.out.println("repair is performed");
		 wd.switchTo().defaultContent();
		wd.switchTo().frame("panel7");
		WebDriverWait wait3 = new WebDriverWait(wd, 20);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("butName_11"))).click();
	System.out.println("released is performed");	
	}
	@Test (groups = { "PostFileUpload"},priority=1)
	
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
	

	
		}

		
	
