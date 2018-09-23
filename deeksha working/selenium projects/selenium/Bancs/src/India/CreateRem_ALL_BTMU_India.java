
package India;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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


public class CreateRem_ALL_BTMU_India {
	
	static String RemId1,RemId2,RemId3,RemId4,RemId5,RemId6,RemId7,RemId8,RemId9,RemId10,RemId11,RemId12;
	
	
	public static void Create_REM(){
	

	// TODO Auto-generated method stub
	
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
			driver.findElement(By.name("userId")).sendKeys("sunny");
			 WebElement password=driver.findElement(By.name("password"));
					 password.sendKeys("tcs123");
			//driver.findElement(By.name("entity")).click();
			//Select drpdwn = new Select(driver.findElement(By.name("entity")));
			//drpdwn.selectByValue("GBTMUINDEL");
			
			password.sendKeys(Keys.RETURN);
			driver.findElement(By.id("Login")).submit();
			System.out.println("logged in");
			
			 Thread.sleep(5000);
			
			driver.findElement(By.id("userMenu")).click();
			System.out.println("menu clicked");
			driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
			System.out.println("Clicked Credit transfer");
			WebElement webobject2 = driver.findElement(By.xpath("//a[@title='Outward Remittance']"));
		 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject2); 
			
			//driver.findElement(By.xpath("//a[@title='Outward Remittance']")).click();
			driver.switchTo().frame("panel2");
			
			
//1.)  Create REM LVP Unitary
			
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("568996");
			System.out.println("debit account entered");
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();
			System.out.println("LVP selected");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			System.out.println("Amount entered");
			driver.findElement(By.id("Save&Close55")).click();	
			System.out.println("Save and close");	
			
			Alert save1 = driver.switchTo().alert();
			save1.accept();
			
			Thread.sleep(2000);
			Alert remitance1 = driver.switchTo().alert();
			
			S=remitance1.getText();
			
			 RemId1 = S.substring(S.indexOf("-") + 2);
			System.out.println("1.) *************************LVP rem id************************ " + RemId1);
			remitance1.accept();
			
		
			
//2.)  Create REM RTGS Unitary
			
			Thread.sleep(2000);
			S = new String();
			
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500110");
			System.out.println("debit account entered");
			
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[2]")).click();
			System.out.println("RTGS selected");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
			//System.out.println("Amount entered");
			driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");		
			Alert save2 = driver.switchTo().alert();
			save2.accept();
			Thread.sleep(2000);
			Alert remitance2 = driver.switchTo().alert();
			S=remitance2.getText();
			RemId2 = S.substring(S.indexOf("-") + 2);
			System.out.println("2.) *************************RTGS rem id************************ " + RemId2);
			remitance2.accept();
		

			
//3.)  Create REM LVP FL level
			Thread.sleep(2000);
			
			S = new String();
			
			
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("568996");;
			System.out.println("debit account entered");
			driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			System.out.println("Is multiple selected");	
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("drop down for split method is clicked");	
	        Thread.sleep(2000);
			
			WebDriverWait wait4 = new WebDriverWait(driver, 20);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
			System.out.println("split method selected as File level");
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected for clearing type");
			Thread.sleep(2000);
			//driver.findElement(By.id("selectCombo_ct_ct_Payments_wca_SPLIT_MTHD_Text")).sendKeys("File Level");;
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();
			System.out.println("LVP selected");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			System.out.println("Amount entered");        //System.out.println("1st Amount entered");
			
			
	        driver.findElement(By.id("butName_41")).click();	   //Click on save button	
			Alert save3 = driver.switchTo().alert();
			save3.accept();
			Thread.sleep(3000);
			Alert remitance3 = driver.switchTo().alert();			
			remitance3.accept();					
			
			driver.findElement(By.id("butName_39")).click();		   // Click on insert button		
			//2nd paymnt		
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);      //System.out.println("2nd Amount entered");
			
			
	        driver.findElement(By.id("butName_41")).click();    //Click on save button
	        Thread.sleep(3000);
	        Alert save3a = driver.switchTo().alert();
	        save3a.accept();
			Thread.sleep(3000);
			Alert remitance3a = driver.switchTo().alert();
			S=remitance3a.getText();
			RemId3 = S.substring(S.indexOf("-") + 2);
			System.out.println("3.) ************************File level LVP order master id************************ " + RemId3);
			remitance3a.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");
			Alert rem3a = driver.switchTo().alert();
			rem3a.accept();
			
					
			
//4.)  Create REM LVP IPL level
			
			S = new String();
			
			
			
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500110");
			System.out.println("debit account entered");
			
driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			
			WebDriverWait wait5 = new WebDriverWait(driver, 20);
			wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[2]"))).click();
			System.out.println("split method selected as Individual level");
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();
			System.out.println("LVP selected");
			
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("1st Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();		
			Alert save4 = driver.switchTo().alert();
			save4.accept();
			Thread.sleep(3000);
			Alert remitance4 = driver.switchTo().alert();			
			remitance4.accept();	
			
			// Click on insert button
			driver.findElement(By.id("butName_39")).click();
			
			//2nd paymnt		
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(3000);
	        Alert save4a = driver.switchTo().alert();
	        save4a.accept();
			Thread.sleep(3000);
			Alert remitance4a = driver.switchTo().alert();
			S=remitance4a.getText();
			RemId4 = S.substring(S.indexOf("-") + 2);
			System.out.println("4.) ************************IP level LVP order master id************************ " + RemId4);
			remitance4a.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");
			Alert rem4a = driver.switchTo().alert();
			rem4a.accept();
			
			
//5.)  Create REM RTGS File level
			
			S = new String();
			
			
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500110");
			//System.out.println("debit account entered");
			driver.findElement(By.name("ct_ct_Payments_wca_REMIT_TYPE")).click();
			
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			WebDriverWait wait8 = new WebDriverWait(driver, 20);
			Thread.sleep(2000);
			wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
			System.out.println("split method selected as File level");
			

			
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[2]")).click();
			System.out.println("RTGS selected");
			
			
			//driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[2]")).click();
			Thread.sleep(1000);
			//aa.sendKeys("RTGS");
			//System.out.println("rtgs selected");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
			//System.out.println("1st Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();		
			Alert save5 = driver.switchTo().alert();
			save5.accept();
			Thread.sleep(3000);
			Alert remitance5 = driver.switchTo().alert();			
			remitance5.accept();	
			
			// Click on insert button
			driver.findElement(By.id("butName_39")).click();
			
			//2nd paymnt		
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("2345");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(3000);
	        Alert save5a = driver.switchTo().alert();
	        save5a.accept();
			Thread.sleep(3000);
			Alert remitance5a = driver.switchTo().alert();
			S=remitance5a.getText();
			
			
			RemId5 = S.substring(S.indexOf("-") + 2);
			
			System.out.println("5.) ************************File level RTGS order master id************************ " + RemId5);
			
			
			remitance5a.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	  //System.out.println("Save and close");
			
			Alert rem5a = driver.switchTo().alert();
			
			
			rem5a.accept();
			
			
			
//06.) Create and auth IP Level RTGS
			
			S = new String();
			
			
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("503225");
			//System.out.println("debit account entered");
			driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			WebDriverWait wait9 = new WebDriverWait(driver, 20);
			
			wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[2]"))).click();
			System.out.println("split method selected as Individual level");
			

			
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[2]")).click();
			System.out.println("RTGS selected");
			
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("2345");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
			//System.out.println("1st Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();		
			Alert save6 = driver.switchTo().alert();
			save6.accept();
			Thread.sleep(3000);
			Alert remitance6 = driver.switchTo().alert();			
			remitance6.accept();	
			
			// Click on insert button
			driver.findElement(By.id("butName_39")).click();
			
			//2nd paymnt		
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("6444");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(3000);
	        Alert save6a = driver.switchTo().alert();
	        save6a.accept();
			Thread.sleep(3000);
			Alert remitance6a = driver.switchTo().alert();
			S=remitance6a.getText();
			
			
			RemId6 = S.substring(S.indexOf("-") + 2);
			
			System.out.println("6.) ************************IP level RTGS order master id************************ " + RemId6);
			
			
			remitance6a.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");
			Alert rem6a = driver.switchTo().alert();
			
			
			rem6a.accept();
			
			
			
			// Now Book Transfer cases
			
	
		
			
//7.) Create and auth Book Transfer
			
			S = new String();
			
			
			
			//Thread.sleep(1000);
			//driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElement(By.id("userMenu")).click();
			
			
			driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
			driver.findElement(By.xpath("//a[@title='Book Transfer']")).click();
			
			Thread.sleep(2000);
			driver.switchTo().frame("panel3");
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500381");
			//System.out.println("debit account entered");
			Thread.sleep(1000);
			
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[2]")).click();
			System.out.println("Book transfer selected");
			
			//System.out.println("Book Transfer selected");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("500011");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("Amount entered");
			driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");		
			Alert save7a = driver.switchTo().alert();
			save7a.accept();
			Thread.sleep(3000);
			Alert remitance7 = driver.switchTo().alert();
			S=remitance7.getText();
			
			RemId7 = S.substring(S.indexOf("-") + 2);
			System.out.println("7.) ************************Book Transfer Rem id************************ " + RemId7);
			remitance7.accept();
			
			
			
		
			
			
//08.) Create and auth Book_Transfer_IB
			Thread.sleep(2000);
			S = new String();
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500381");
			//System.out.println("debit account entered");
			//driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			Thread.sleep(1000);
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();
			System.out.println("Book transfer Inter branch selected");
			System.out.println("BT-Inter Branch selected");
			
            Thread.sleep(2000);
			
			WebElement tt = driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_TYP_1-button"));
			
			tt.click();
			
			//Thread.sleep(1000);
			System.out.println("Drop down for Mumbai is clicked" );
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div[3]/fieldset/ul/li/div/div/ul/li[4]")).click();
			System.out.println(" Mumbai is clicked" );
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("533122");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("Amount entered");
			driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");		
			Alert save = driver.switchTo().alert();
			save.accept();
			Thread.sleep(3000);
			Alert remitance8 = driver.switchTo().alert();
			S=remitance8.getText();
			
			RemId8 = S.substring(S.indexOf("-") + 2);
			System.out.println("8.) ************************Book Transfer Inter Branch Rem id************************ " + RemId8);
			remitance8.accept();
			
			
			
//9.) Create and auth File Level Book_Transfer_IB
			
			S = new String();
			Thread.sleep(2000);
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500381");
			System.out.println("debit account entered");
			driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			WebDriverWait wait11 = new WebDriverWait(driver, 20);
			
			wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
			System.out.println("split method selected as File level");
			Thread.sleep(1000);
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();

			System.out.println("BT-Inter Branch selected");
			Thread.sleep(2000);
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_TYP_1-button")).click();
			
			System.out.println("Drop down for Mumbai is clicked" );
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div[3]/fieldset/ul/li/div/div/ul/li[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("533122");
			Thread.sleep(1000);
			
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("Amount entered");
			Thread.sleep(2000);		
			
	        driver.findElement(By.id("butName_41")).click();	//Click on save button	
			Alert save9 = driver.switchTo().alert();
			save9.accept();
			Thread.sleep(2000);
			Alert remitance9 = driver.switchTo().alert();			
			remitance9.accept();	
			
			//2nd payment
			driver.findElement(By.id("butName_39")).click();
driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_TYP_1-button")).click();
			Thread.sleep(1000);
			System.out.println("Drop down for Mumbai is clicked" );
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div[3]/fieldset/ul/li/div/div/ul/li[4]")).click();
			// Click on insert button
			
			Thread.sleep(1000);
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("533157");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(2000);
	        Alert save9a = driver.switchTo().alert();
			save9a.accept();
			Thread.sleep(2000);
			Alert remitance9a = driver.switchTo().alert();
			S=remitance9a.getText();
			
			
			
			RemId9 = S.substring(S.indexOf("-") + 2);
			
			System.out.println("9.) ************************Book Transfer- Inter Branch File Level Order id************************ " + RemId9);
			
			remitance9a.accept();
			Thread.sleep(2000);
	        driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");
			Alert rem9a = driver.switchTo().alert();
			rem9a.accept();
			
			
			
//10.) Create and auth IP Level Book_Transfer_IB
			Thread.sleep(2000);
			
S = new String();
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("503549");
			driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			WebDriverWait wait15 = new WebDriverWait(driver, 20);
			Thread.sleep(2000);
			wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[2]"))).click();
			System.out.println("split method selected as Individual level");
			Thread.sleep(1000);
			
			driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
			System.out.println("drop down selected");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[3]")).click();
			System.out.println("Book transfer Inter branch selected");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_TYP_1-button")).click();
			System.out.println("Drop down for Mumbai is clicked" );
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div[3]/fieldset/ul/li/div/div/ul/li[4]")).click();
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("533157");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			System.out.println("Amount entered");
			Thread.sleep(2000);		
			
	        driver.findElement(By.id("butName_41")).click();	//Click on save button	
			Alert t = driver.switchTo().alert();
			t.accept();
			Thread.sleep(2000);
			Alert remitancet = driver.switchTo().alert();			
			remitancet.accept();	
			
			//2nd payment
			driver.findElement(By.id("butName_39")).click();
driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_IDNTFR_TYP_1-button")).click();
			System.out.println("Drop down for Mumbai is clicked" );

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div[3]/fieldset/ul/li/div/div/ul/li[4]")).click();
			
			
			Thread.sleep(1000);
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("533173");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(2000);
	        Alert save10a = driver.switchTo().alert();
			save10a.accept();
			Thread.sleep(2000);
			Alert remitance11 = driver.switchTo().alert();
			S=remitance11.getText();
			
			
			
			
			
			
			
			RemId10 = S.substring(S.indexOf("-") + 2);
			
			System.out.println("10.) ************************Book Transfer- Inter Branch IP Level Order id************************ " + RemId10);
			
			remitance11.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	
			System.out.println("Save and close");
			Alert rem10a = driver.switchTo().alert();
			rem10a.accept();
			
			
//11.) Create and auth File level BT
			Thread.sleep(2000);
S = new String();
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500381");
			driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			WebDriverWait wait16 = new WebDriverWait(driver, 20);
			Thread.sleep(2000);
			wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
			System.out.println("split method selected as File level");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("504802");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("Amount entered");
			Thread.sleep(2000);		
			
	        driver.findElement(By.id("butName_41")).click();	//Click on save button	
			Alert v = driver.switchTo().alert();
			v.accept();
			Thread.sleep(2000);
			Alert remitanceta = driver.switchTo().alert();			
			remitanceta.accept();	
			
			//2nd payment
			driver.findElement(By.id("butName_39")).click();
Thread.sleep(1000);
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("505227");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(2000);
	        Alert save10b = driver.switchTo().alert();
			save10b.accept();
			Thread.sleep(2000);
			Alert remitance19 = driver.switchTo().alert();
			S=remitance19.getText();
			RemId11 = S.substring(S.indexOf("-") + 2);
			
			System.out.println("11.) ************************Book Transfer File Level Order id************************ " + RemId11);
			
			remitance11.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	
			System.out.println("Save and close");
			Alert rem20 = driver.switchTo().alert();
			rem20.accept();
			
			
			
			
			

			
			
			
//12.) Create and auth IP Level BT
			Thread.sleep(2000);
S = new String();
			
			driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("500381");
			//System.out.println("debit account entered");
		//	driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			
			driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
			WebDriverWait wait22 = new WebDriverWait(driver, 20);
			Thread.sleep(2000);
			wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[2]"))).click();
			System.out.println("split method selected as Individual level");
			
			Thread.sleep(1000);
			driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("506577");
			driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("Amount entered");
			Thread.sleep(2000);		
			
	        driver.findElement(By.id("butName_41")).click();	//Click on save button	
			Alert m = driver.switchTo().alert();
			m.accept();
			Thread.sleep(2000);
			Alert remitancets = driver.switchTo().alert();			
			remitancets.accept();	
			
			//2nd payment
			driver.findElement(By.id("butName_39")).click();

			Thread.sleep(1000);
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("506785");
	        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(amount);
			//System.out.println("2nd Amount entered");
			//Click on save button
	        driver.findElement(By.id("butName_41")).click();
	        Thread.sleep(2000);
	        Alert save10c = driver.switchTo().alert();
			save10c.accept();
			Thread.sleep(2000);
			Alert remitance29 = driver.switchTo().alert();
			S=remitance29.getText();
			
			RemId12 = S.substring(S.indexOf("-") + 2);
			
			System.out.println("12.) ************************Book Transfer IP Level Order id************************ " + RemId12);
			
			remitance11.accept();
			Thread.sleep(3000);
	        driver.findElement(By.id("Save&Close55")).click();	
			//System.out.println("Save and close");
			Alert rem123 = driver.switchTo().alert();
			rem123.accept();
							

			}
			catch(Exception e)
			{}
			
	}
	
	
	
	
	
	}


}
