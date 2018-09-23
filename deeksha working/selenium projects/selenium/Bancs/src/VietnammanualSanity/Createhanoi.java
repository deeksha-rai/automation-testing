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
public class Createhanoi {

	
	static String RemId1,RemId2,RemId3;
	
	
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
				driver.findElement(By.name("userId")).sendKeys("vikasm");
				 WebElement password=driver.findElement(By.name("password"));
						 password.sendKeys("tcs123@");
				
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
	
	//1.)  Create VACP E2E Unitary
					Thread.sleep(2000);
					S = new String();
					driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("3639VNDDTC774774");
					System.out.println("debit account entered");
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_TYP_1-button")).click();
					System.out.println("drop down selected");
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div[3]/fieldset/ul/li/div/div/ul/li[3]")).click();
					System.out.println("VACP selected");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_ID_1")).sendKeys("888486");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("8"+amount);
					//System.out.println("Amount entered");
					driver.findElement(By.id("Save&Close55")).click();	
					//System.out.println("Save and close");		
					Alert save2 = driver.switchTo().alert();
					save2.accept();
					Thread.sleep(2000);
					Alert remitance2 = driver.switchTo().alert();
					S=remitance2.getText();
					RemId1 = S.substring(S.indexOf("-") + 2);
					System.out.println("1.) *******VACP E2E Unitary: " + RemId1);
					remitance2.accept();
					
					
//2.)  Create Inward Vietin with Customer A/C type = DICA/ DIRECT CAP/ INDIRECT CAP
	
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
	                driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("3639VNDORD090654");
					System.out.println("debit account entered");
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("3639VNDORD040002");
					
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
					//System.out.println("Amount entered");
					driver.findElement(By.id("Save&Close55")).click();	
					System.out.println("Save and close");	
					Thread.sleep(2000);
					
					driver.findElement(By.id("Continue_dialogButton")).click();
					Thread.sleep(2000);
					Alert save22 = driver.switchTo().alert();
					save22.accept();
					Thread.sleep(2000);
					Alert remitance22 = driver.switchTo().alert();
					S=remitance22.getText();
					RemId2 = S.substring(S.indexOf("-") + 2);
					System.out.println("2.) ********Inward Vietin with Customer A/C type = DICA/ DIRECT CAP/ INDIRECT CAP: " + RemId2);
					remitance22.accept();
					
					driver.switchTo().defaultContent();
//3.)  Create E2E SO execution with date calculation as 'Backward'
					

					driver.findElement(By.id("userMenu")).click();
					System.out.println("menu clicked");
					driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
					System.out.println("Clicked Credit transfer");
					WebElement webobject25 = driver.findElement(By.xpath("//a[@title='Standing Order']"));
				 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject25); 
					
					
					driver.switchTo().frame("panel3");
					
					
					
					
					Thread.sleep(2000);
					
		            driver.findElement(By.id("ct_ct_DebitControlSO_wca_DR_ACNT_IDNTFR")).sendKeys("3639VNDORD040002");
					System.out.println("debit account entered");
					
					driver.findElement(By.id("ct_ct_DebitControlSO_wca_AMT")).sendKeys("35"+amount);
					
					System.out.println("Amount enetered");
					Thread.sleep(2000);
					
					
			
					WebElement abcd= driver.findElement(By.id("ct_ct_DebitControlSO_wca_ACTV_ON_DT"));
					abcd.click();
					Thread.sleep(2000);
					abcd.sendKeys("08.02.2019");
					System.out.println("Active date eneterd");
					
					Thread.sleep(2000);
					
					
					driver.findElement(By.id("ct_ct_BenificaryDetailsSO_wca_CR_ACNT_IDNTFR")).sendKeys("3639VNDORD040096");
					driver.findElement(By.id("ct_ct_BenificaryDetailsSO_wca_CR_PRTY_NM")).sendKeys("HHHHH HHHHHHH HHHHHHH HHHHHHH");
					driver.findElement(By.id("ct_ct_BenificaryBankDetailsSO_wca_BEN_BNK_IDNTFR_ID_1")).sendKeys("6202001");
					
					
					//System.out.println("Amount entered");
					driver.findElement(By.id("Save&Close51")).click();	
					//System.out.println("Save and close");		
					Alert save217 = driver.switchTo().alert();
					save217.accept();
					Thread.sleep(2000);
					Alert remitance217 = driver.switchTo().alert();
					S=remitance217.getText();
					RemId3 = S.substring(S.indexOf("-") + 2);
					System.out.println("3.) E2E SO execution with date calculation as 'Backward': " + RemId3);
					remitance217.accept();
				
					
					
			}
			catch(Exception e)
			{}
			
	}
	
	
	
	
	
	

	}

}
