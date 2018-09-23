package taiwan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Btauth {
	 
	public static WebDriver wd;
	File myfile = new File("abcd.xls");
	String fname = myfile.getName();
	
 @DataProvider(name = "DP1")
    public String[][] createData1() throws Exception{
	 String[][] retObjArr=getTableArray(fname, "Sheet1");
        return(retObjArr);
    }
 
 
    @Test(dataProvider = "DP1",priority=0)
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
    
    public static 	String[][] getTableArray (String file,String sheetName) throws BiffException, IOException
	{
	     String[][] tabArray=null;
	     
	     FileInputStream fs = new FileInputStream("abcd.xls");
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			tabArray = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
				tabArray[i-1][j] = sh.getCell(j, i).getContents();
				}
			
	 }
	return tabArray;

	}
    
 @Test(priority=1)

 public void authCTBT() throws InterruptedException
 		{
	
Thread.sleep(2000);
 				  wd.findElement(By.id("tabText_0")).click();
 				
 		        System.out.println("Payments clicked");
 		       wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
 		       // wd.findElement(By.xpath("/html/body/div[9]/div/div[4]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr/td/span")).click();
 		    System.out.println("Credit Transfer Clicked");
 		   WebElement  webobject2 = wd.findElement(By.xpath("//p[@title='Order Master']"));
	        ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject2);
        
 	    //     wd.findElement(By.xpath("/html/body/div[9]/div/div[4]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/p")).click();
 			    System.out.println("Order Master Clicked");
 			    Thread.sleep(3000);
 			    wd.switchTo().frame("panel2");
 			   WebElement abc= wd.findElement(By.xpath("html/body/form/div/table/tbody/tr[5]/td[6]/div/input"));
 			   System.out.println("Text Box Clicked ");
 			   //abc .sendKeys("95118");
 			   
 			   abc.sendKeys(NewTest8.res);
 			   wd.findElement(By.xpath("html/body/form/div/div[3]/div[2]/input")).click();
 			   
 			   System.out.println("Search Clicked ");
 			  Thread.sleep(3000);
 		}
 @Test(priority=2)
    public void abc()
	{	
	  
	 wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Wizard is opened");	
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  wd.switchTo().defaultContent();
		wd.findElement(By.id("stppopup_text")).click();
		System.out.println("Wizard is selected");	
		
	}
 File myfile2 = new File("Booktransfer.xls");
	String fname2 = myfile2.getName();
	@DataProvider(name = "DP2")
	 public String[][] createData2() throws Exception{
		 String[][] retObjArr=getTableArray2(fname2, "Sheet1");
	     return(retObjArr);
	}
	public static 	String[][] getTableArray2 (String file,String sheetName) throws BiffException, IOException
	{
	     String[][] tabArray=null;
	     
	     FileInputStream fs = new FileInputStream("Booktransfer.xls");
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			tabArray = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
				tabArray[i-1][j] = sh.getCell(j, i).getContents();
				}
			
	 }
	return tabArray;

	}
 
	  @Test(dataProvider = "DP2",priority=3)
 
 public void wid(String debitaccnt,String creditaccnt,String amnt2 ) throws InterruptedException
 {
 	System.out.println("Work item window is opened");	
 	Set<String> s = wd.getWindowHandles();
 	for (String windowObject : s) {
 		wd.switchTo().window(windowObject);
 	} 
 	WebDriverWait wait = new WebDriverWait(wd, 20);
 	wait.until(ExpectedConditions.elementToBeClickable(By.id("tdtext3"))).click();
 	System.out.println("Work item window is clicked");
 	WebDriverWait wait1 = new WebDriverWait(wd, 20);
 	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td[4]/span/table/tbody/tr[2]/td[4]/a"))).click();
 System.out.println("Workitem details is selected");	
 Thread.sleep(2000);
 wd.switchTo().frame("panel3");
 	Actions oAction = new Actions(wd);
 	WebElement ab= wd.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]"));
 	oAction.moveToElement(ab);
 	oAction.contextClick(ab).build().perform();  /* this will perform right click */
 	System.out.println("right click is performed");	
 	//Thread.sleep(3000);
 	wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
 	System.out.println("Authorise is clicked");
 	wd.switchTo().defaultContent();
 	wd.switchTo().frame("panel4");
 	Thread.sleep(2000);
 	WebDriverWait wait3 = new WebDriverWait(wd, 20);
 	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div/div/div/fieldset/div[3]/input"))).sendKeys(amnt2);
 	System.out.println("value sent to text box");	
 	Thread.sleep(2000);
 	WebDriverWait wait4 = new WebDriverWait(wd, 20);
 	wait4.until(ExpectedConditions.elementToBeClickable(By.id("butName_12"))).click();
 	System.out.println("Authorise is performed");
 	Thread.sleep(2000);
 	WebDriverWait wait5 = new WebDriverWait(wd, 20);
 	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
 	 System.out.println("Save is clicked");	
 	Alert save = wd.switchTo().alert();
	save.accept();
 	
 }
 
}
