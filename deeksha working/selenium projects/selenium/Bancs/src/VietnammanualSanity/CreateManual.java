package VietnammanualSanity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CreateManual {

	static String RemId1,RemId2,RemId3,RemId4,RemId5,RemId6,RemId7,RemId8;
	
	public static void Create_REM(){
	DateFormat dateFormat = new SimpleDateFormat("mmss");
    Date date = new Date();
	String amount = (dateFormat.format(date));
	
	
	String S = new String();
	
	{
		
		try{
			
		
			
			System.setProperty("webdriver.chrome.driver", "D:/Vikas kapoor selenium notes/chromedriver.exe");
	        WebDriver driver = new   ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://172.21.163.65:24000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null&status=null");
			driver.manage().window().maximize();
			driver.findElement(By.name("userId")).sendKeys("pat3");
			 WebElement password=driver.findElement(By.name("password"));
					 password.sendKeys("tcs123");
			
			password.sendKeys(Keys.RETURN);
			driver.findElement(By.id("Login")).submit();
			System.out.println("logged in");
			
			 Thread.sleep(5000);
			 
			 driver.findElement(By.id("userMenu")).click();
				System.out.println("menu clicked");
				driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
				System.out.println("Clicked Credit transfer");
				WebElement webobject2 = driver.findElement(By.xpath("//a[@title='Book Transfer']"));
			 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject2); 
			 
			 	Thread.sleep(2000);
				driver.switchTo().frame("panel2");
			 
//1.)  BICT Manual Capture with Source Ebank Unitary
				Thread.sleep(3000);
				driver.findElement(By.id("ct_ct_Payments_wca_INSTRMNT_ID-button")).click();
				System.out.println("drop down selected");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[5]")).click();
				System.out.println("BICT selected");
				
				
				driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("3640VNDDTC900168");
				System.out.println("debit account entered");
				
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("3640VNDDMA000019");
				
				
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
				System.out.println("Amount entered");
				driver.findElement(By.id("Save&Close55")).click();	
				System.out.println("Save and close");	
				
				Alert save1 = driver.switchTo().alert();
				save1.accept();
				
				Thread.sleep(2000);
				Alert remitance1 = driver.switchTo().alert();
				
				S=remitance1.getText();
				
				 RemId1 = S.substring(S.indexOf("-") + 2);
				System.out.println("1.) BICT Manual Capture with Source Ebank rem id:" + RemId1);
				remitance1.accept();
				
			
				

			
//2.)  Create BICT Manual Capture with Source Vietin Bank  and Forex applicable
				
				Thread.sleep(2000);
				S = new String();
				
				Thread.sleep(5000);
				driver.findElement(By.id("ct_ct_Payments_wca_INSTRMNT_ID-button")).click();
				System.out.println("drop down selected");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[5]")).click();
				System.out.println("BICT selected");
				driver.findElement(By.id("ct_ct_Payments_wca_SRC_SYSTEM-button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[6]/div/div/ul/li[3]")).click();
				System.out.println("Vietin selected");
                driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("3640VNDDTC900168");
				System.out.println("debit account entered");
				
				driver.findElement(By.id("ct_ct_Payments_wca_forex_typ-button")).click();
				
				System.out.println("drop down for forex type clicked");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[13]/div/div/ul/li[3]")).click();
				System.out.println("Normal clicked");
				
				driver.findElement(By.id("ct_ct_Payments_wca_CRNCY-button")).click();
				System.out.println("drop down for currency button clicked");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[11]/div/div/ul/li[2]")).click();
	System.out.println("VND clicked");
				
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("3640USDDMA000019");
				
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
				//System.out.println("Amount entered");
				driver.findElement(By.id("Save&Close55")).click();	
				//System.out.println("Save and close");		
				Alert save21 = driver.switchTo().alert();
				save21.accept();
				Thread.sleep(2000);
				Alert remitance21 = driver.switchTo().alert();
				S=remitance21.getText();
				RemId2 = S.substring(S.indexOf("-") + 2);
				System.out.println("2.) **BICT Manual Capture with Source Vietin Bank  and Forex applicable: " + RemId2);
				remitance21.accept();
				

				
//3.)  Create REM Book transfer Unitary Forex 
				
				S = new String();
				//driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("3640VNDDTC900168");
				System.out.println("debit account entered");
				
				Thread.sleep(2000);
			driver.findElement(By.id("ct_ct_Payments_wca_forex_typ-button")).click();
			Thread.sleep(2000);
			System.out.println("drop down for forex type clicked");
	driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[13]/div/div/ul/li[3]")).click();
					System.out.println("Normal clicked");
					driver.findElement(By.id("ct_ct_Payments_wca_CRNCY-button")).click();
					
					System.out.println("drop down for currency button clicked");
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[11]/div/div/ul/li[3]")).click();
					System.out.println("USD clicked");
				driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("3640USDDTC074322");
				
				
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
				System.out.println("Amount entered");
				driver.findElement(By.id("Save&Close55")).click();	
				System.out.println("Save and close");	
				
				Alert save101 = driver.switchTo().alert();
				save101.accept();
				
				Thread.sleep(2000);
				Alert remitance101 = driver.switchTo().alert();
				
				S=remitance101.getText();
				
				 RemId3 = S.substring(S.indexOf("-") + 2);
				System.out.println("3.) **REM LVP Unitary Forex Ben: " + RemId3);
				
				remitance101.accept();
				Set<String> s = driver.getWindowHandles();
				for (String windowObject : s) {
					driver.switchTo().window(windowObject);
				} 
				
				driver.findElement(By.xpath("html/body/div[2]/div[4]/div/ul/div/span/li[2]/span[2]")).click();
				System.out.println("close clicked");
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				
				
//4.)  Create REM LVP Unitary with Booking fail
driver.findElement(By.id("userMenu")).click();
				
				
				driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
				WebElement webobject3 = driver.findElement(By.xpath("//a[@title='Outward Remittance']"));
			 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject3); 
				
				Thread.sleep(2000);
				driver.switchTo().frame("panel3");
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("3640VNDDTC900168");
				System.out.println("debit account entered");
				//driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
				//System.out.println("drop down selected");
				
				Thread.sleep(2000);
				//driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();
				//System.out.println("LVP selected");
				driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
				System.out.println("Amount entered");
				driver.findElement(By.id("Save&Close55")).click();	
				System.out.println("Save and close");	
				
				Alert save133 = driver.switchTo().alert();
				save133.accept();
				
				Thread.sleep(2000);
				Alert remitance133 = driver.switchTo().alert();
				
				S=remitance133.getText();
				
				 RemId4 = S.substring(S.indexOf("-") + 2);
				System.out.println("4.)***REM LVP Unitary****" + RemId4);
				remitance133.accept();
						
				Set<String> sa = driver.getWindowHandles();
				for (String windowObject : sa) {
					driver.switchTo().window(windowObject);
				} 
				
				driver.findElement(By.xpath("html/body/div[2]/div[4]/div/ul/div/span/li[2]/span[2]")).click();
				System.out.println("close clicked");
				driver.switchTo().defaultContent();
				
			
//5.)  Create E2E SO execution with date calculation as 'Forward'
			
			
				
				
				driver.findElement(By.id("userMenu")).click();
			System.out.println("menu clicked");
			driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
			System.out.println("Clicked Credit transfer");
			WebElement webobject24 = driver.findElement(By.xpath("//a[@title='Standing Order']"));
		 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject24); 
			
			
			driver.switchTo().frame("panel4");
			
			

			
			Thread.sleep(2000);
			S = new String();
			
			Thread.sleep(5000);
			
            driver.findElement(By.id("ct_ct_DebitControlSO_wca_DR_ACNT_IDNTFR")).sendKeys("3640VNDDFB860034");
			System.out.println("debit account entered");
			
			driver.findElement(By.id("ct_ct_DebitControlSO_wca_AMT")).sendKeys("35"+amount);
			
			System.out.println("Amount enetered");
			Thread.sleep(2000);
			driver.findElement(By.id("ct_ct_DebitControlSO_wca_DATE_CAL_TYP-button")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/form/ul[2]/li/ul[2]/li/fieldset/ul/li[32]/div/div/ul/li[2]")).click();
			System.out.println("Forward  enetered");
			WebElement abc= driver.findElement(By.id("ct_ct_DebitControlSO_wca_ACTV_ON_DT"));
			abc.click();
			
			abc.sendKeys("12.02.2019");
			System.out.println("Active date eneterd");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("ct_ct_BenificaryDetailsSO_wca_CR_ACNT_IDNTFR")).sendKeys("3640VNDDTC900168");
			driver.findElement(By.id("ct_ct_BenificaryDetailsSO_wca_CR_PRTY_NM")).sendKeys("KKKKKKK KKKK KKK KKKKK");
			driver.findElement(By.id("ct_ct_BenificaryBankDetailsSO_wca_BEN_BNK_IDNTFR_ID_1")).sendKeys("6202001");
			
			
			//System.out.println("Amount entered");
			driver.findElement(By.id("Save&Close51")).click();	
			//System.out.println("Save and close");		
			Alert save212 = driver.switchTo().alert();
			save212.accept();
			Thread.sleep(2000);
			Alert remitance212 = driver.switchTo().alert();
			S=remitance212.getText();
			RemId5 = S.substring(S.indexOf("-") + 2);
			System.out.println("5.E2E SO execution with date calculation as 'Forward') : " + RemId5);
			remitance212.accept();
			

		}
			catch(Exception e)
			{}
			
	}
	
	
	
	
	
	

	}
}
		
		
	
	
	
	
	
	
	
