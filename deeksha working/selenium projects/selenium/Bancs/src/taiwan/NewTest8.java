package taiwan;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class NewTest8 {
	public static  WebDriver wd;
	public  String RemId;
	File myfile1 = new File("abcde.xls");
	String fname1 = myfile1.getName();
	File myfile2 = new File("Booktransfer.xls");
	String fname2 = myfile2.getName();
 @DataProvider(name = "DP1")
    public String[][] createData1() throws Exception{
	 String[][] retObjArr=getTableArray1(fname1, "Sheet1");
        return(retObjArr);
    }
 @DataProvider(name = "DP2")
 public String[][] createData2() throws Exception{
	 String[][] retObjArr=getTableArray2(fname2, "Sheet1");
     return(retObjArr);
 }
 
    @Test(dataProvider = "DP1",priority=0)
   
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
    public static String res = "";
    
    @Test(dataProvider = "DP2",priority=1)
    public String createBT (String debitaccnt,String creditaccnt,String amnt2)
	{
		try{
			   Thread.sleep(5000);
			wd.findElement(By.id("tabText_0")).click();
	        System.out.println("Payments clicked");
	        Thread.sleep(5000);
	      wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
	        //((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
	        // wd.findElement(By.xpath("/html/body/div[9]/div/div[4]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr/td/span")).click();
	         System.out.println("Credit transfer clicked");
	         WebElement  webobject2 = wd.findElement(By.xpath("//p[@title='Book Transfer']"));
		        ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject2);
	         
	        // wd.findElement(By.xpath("/html/body/div[9]/div/div[4]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/p")).click();
		       System.out.println("clicked Book transfer");
			wd.switchTo().frame("panel2");
			WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
			Source_sys.sendKeys("Manual Entries-Fax");
			System.out.println("Source System is selected");
			Thread.sleep(5000);
			wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys(debitaccnt);
			System.out.println("debit account entered");
			Thread.sleep(2000);
			wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys(creditaccnt);
			System.out.println("credit account entered");
			Thread.sleep(5000);
            wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys(amnt2);
			System.out.println("credit amount entered");
			Thread.sleep(5000);
           	wd.findElement(By.id("Save&Close50")).click();
			System.out.println("Save and close");
			Alert save = wd.switchTo().alert();
			save.accept();
			Alert remitance = wd.switchTo().alert();
			String S=remitance.getText();
			System.out.println(S);
			RemId = S.substring(S.indexOf("-") + 2);
			res=RemId;
		remitance.accept();
			wd.quit();

		}	

	      catch (InterruptedException e) {

				e.printStackTrace();
			}
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }

		return RemId;
 
	}
    
    
    
	public static 	String[][] getTableArray1 (String file,String sheetName) throws BiffException, IOException
	{
	     String[][] tabArray=null;
	     
	     FileInputStream fs = new FileInputStream("abcde.xls");
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
 
 
 }

