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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Taiwanmanual {
	
static String RemId1,RemId2,RemId3,RemId4,RemId5,RemId6,RemId7,RemId8;
	
	public static void Create_REM(){
	DateFormat dateFormat = new SimpleDateFormat("mmss");
    Date date = new Date();
	String amount = (dateFormat.format(date));
	
	
	String S = new String();
	

		
		try{
			
		
			
			System.setProperty("webdriver.chrome.driver", "D:/Vikas kapoor selenium notes/chromedriver.exe");
	        WebDriver driver = new   ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://172.21.163.65:24000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null&status=null");
			driver.manage().window().maximize();
			driver.findElement(By.name("userId")).sendKeys("archana");
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
			 
//1.)  Book transfer Manual Unitary
				
				
				Thread.sleep(3000);
				
				
				driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("201610191");
				System.out.println("debit account entered");
				
				
				driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("502223457");
				
				
				
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
				System.out.println("1.) Book transfer Manual Unitary rem id:" + RemId1);
				remitance1.accept();
				
			
				

			
//2.)  Book transfer Manual Bulk MDMC:
				
				
					Thread.sleep(2000);
					
					S = new String();
					
					
					
					driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("502223457");;
					System.out.println("debit account entered");
					driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
					System.out.println("Is multiple selected");	
					driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
					driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			        System.out.println("drop down for split method is clicked");	
			        Thread.sleep(2000);
					
			        WebDriverWait wait5 = new WebDriverWait(driver, 20);
					wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[2]"))).click();
					System.out.println("split method selected as Individual level");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("314777099");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("68"+amount);
					System.out.println("Amount entered");        //System.out.println("1st Amount entered");
					
					
			        driver.findElement(By.id("butName_41")).click();	   //Click on save button	
					Alert save3 = driver.switchTo().alert();
					save3.accept();
					Thread.sleep(3000);
					Alert remitance3 = driver.switchTo().alert();			
					remitance3.accept();					
					
					driver.findElement(By.id("butName_39")).click();		   // Click on insert button		
					//2nd paymnt		
					
					
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("314777099");
			        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("68"+amount);      //System.out.println("2nd Amount entered");
					
					
			        driver.findElement(By.id("butName_41")).click();    //Click on save button
			        Thread.sleep(3000);
			        Alert save3a = driver.switchTo().alert();
			        save3a.accept();
					Thread.sleep(3000);
					Alert remitance3a = driver.switchTo().alert();
					S=remitance3a.getText();
					RemId2 = S.substring(S.indexOf("-") + 2);
					System.out.println("2 Book transfer  MDMC level:************************ " + RemId2);
					remitance3a.accept();
					Thread.sleep(3000);
			        driver.findElement(By.id("Save&Close55")).click();	
					//System.out.println("Save and close");
					Alert rem3a = driver.switchTo().alert();
					rem3a.accept();

					
					
//3.)  Book transfer Manual Bulk SDMC:		
					
					
					Thread.sleep(2000);
			S = new String();
					
					driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("314777099");
					driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
					
					driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
					WebDriverWait wait16 = new WebDriverWait(driver, 20);
					Thread.sleep(2000);
					wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
					System.out.println("split method selected as File level");
					
					Thread.sleep(1000);
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("511000221");
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
			        driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("511000469");
			        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("68"+amount);
					//System.out.println("2nd Amount entered");
					//Click on save button
			        driver.findElement(By.id("butName_41")).click();
			        Thread.sleep(2000);
			        Alert save10b = driver.switchTo().alert();
					save10b.accept();
					Thread.sleep(2000);
					Alert remitance19 = driver.switchTo().alert();
					S=remitance19.getText();
					RemId3 = S.substring(S.indexOf("-") + 2);
					
					System.out.println("7.) ************************Book Transfer File Level Order id************************ " + RemId3);
					remitance3a.accept();
					Thread.sleep(3000);
			        driver.findElement(By.id("Save&Close55")).click();	
					System.out.println("Save and close");
					Alert rem20 = driver.switchTo().alert();
					rem20.accept();
				
					
//4.)  Create REM LVP Unitary
					
					S = new String();
					
					Thread.sleep(1000);
					//driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).click();
					Thread.sleep(2000);
					driver.switchTo().defaultContent();
					driver.findElement(By.id("userMenu")).click();
					
					
					driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
					WebElement webobject21 = driver.findElement(By.xpath("//a[@title='Outward Remittance']"));
				 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject21); 
					Thread.sleep(2000);
					driver.switchTo().frame("panel3");
					
					driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("511000469");
					System.out.println("debit account entered");
					
					Thread.sleep(2000);
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("35"+amount);
					System.out.println("Amount entered");
					driver.findElement(By.id("Save&Close55")).click();	
					System.out.println("Save and close");	
					
					Alert save11 = driver.switchTo().alert();
					save11.accept();
					
					Thread.sleep(2000);
					Alert remitance11 = driver.switchTo().alert();
					
					S=remitance11.getText();
					
					 RemId4 = S.substring(S.indexOf("-") + 2);
					System.out.println("1.) *************************REM LVP Unitary************************ " + RemId4);
					remitance1.accept();
					
					
					
					
//5.Create REM LVP SDMC
					
					
					Thread.sleep(2000);
					
					S = new String();
					
					
					
					driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("511000469");;
					System.out.println("debit account entered");
					driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
					System.out.println("Is multiple selected");	
					driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
					driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			        System.out.println("drop down for split method is clicked");	
			        Thread.sleep(2000);
					
			        WebDriverWait wait51 = new WebDriverWait(driver, 20);
					wait51.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
					System.out.println("split method selected as File level");
					
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("6"+amount);
					System.out.println("Amount entered");        //System.out.println("1st Amount entered");
					
					
			        driver.findElement(By.id("butName_41")).click();	   //Click on save button	
					Alert save31 = driver.switchTo().alert();
					save31.accept();
					Thread.sleep(3000);
					Alert remitance31 = driver.switchTo().alert();			
					remitance31.accept();					
					
					driver.findElement(By.id("butName_39")).click();		   // Click on insert button		
					//2nd paymnt		
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123");
			        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("68"+amount);      //System.out.println("2nd Amount entered");
					
					
			        driver.findElement(By.id("butName_41")).click();    //Click on save button
			        Thread.sleep(3000);
			        Alert save39 = driver.switchTo().alert();
			        save39.accept();
					Thread.sleep(3000);
					Alert remitance39 = driver.switchTo().alert();
					S=remitance39.getText();
					RemId5 = S.substring(S.indexOf("-") + 2);
					System.out.println("4.) ************************REM HVP MDMC level:************************ " + RemId5);
					remitance3a.accept();
					Thread.sleep(3000);
			        driver.findElement(By.id("Save&Close55")).click();	
					//System.out.println("Save and close");
					Alert rem39 = driver.switchTo().alert();
					rem39.accept();
					
							
					
	//6.Create REM LVP MDMC
					
					
					Thread.sleep(2000);
					
					S = new String();
					
					
					
					driver.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("511000183");;
					System.out.println("debit account entered");
					driver.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
					System.out.println("Is multiple selected");	
					driver.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
					driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			        System.out.println("drop down for split method is clicked");	
			        Thread.sleep(2000);
					
			        WebDriverWait wait521 = new WebDriverWait(driver, 20);
					wait521.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[2]"))).click();
					System.out.println("split method selected as Individual level");
					
					
					
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("68"+amount);
					System.out.println("Amount entered");        //System.out.println("1st Amount entered");
					
					
			        driver.findElement(By.id("butName_41")).click();	   //Click on save button	
					Alert save21 = driver.switchTo().alert();
					save21.accept();
					Thread.sleep(3000);
					Alert remitance21 = driver.switchTo().alert();			
					remitance21.accept();					
					
					driver.findElement(By.id("butName_39")).click();		   // Click on insert button		
					//2nd paymnt		
					
					
					driver.findElement(By.id("ct_ct_BeneficiaryDiscription_wca_CLR_TYP-button")).click();
					System.out.println("drop down selected for clearing type");
					Thread.sleep(2000);
					//driver.findElement(By.id("selectCombo_ct_ct_Payments_wca_SPLIT_MTHD_Text")).sendKeys("File Level");;
					driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul[3]/li/div/div/fieldset/ul/li/div/div/ul/li[2]")).click();
					System.out.println("LVP selected");
					driver.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("12345");
			        driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("68"+amount);      //System.out.println("2nd Amount entered");
					
					
			        driver.findElement(By.id("butName_41")).click();    //Click on save button
			        Thread.sleep(3000);
			        Alert save32 = driver.switchTo().alert();
			        save32.accept();
					Thread.sleep(3000);
					Alert remitance32 = driver.switchTo().alert();
					S=remitance32.getText();
					RemId6 = S.substring(S.indexOf("-") + 2);
					System.out.println("4.) ************************REM HVP MDMC level:************************ " + RemId6);
					remitance3a.accept();
					Thread.sleep(3000);
			        driver.findElement(By.id("Save&Close55")).click();	
					//System.out.println("Save and close");
					Alert rem32 = driver.switchTo().alert();
					rem32.accept();
					
					
					
//7:Create using Template
					
					
					
                  S = new String();
					
                  Thread.sleep(3000);
                  driver.switchTo().defaultContent();

                   driver.findElement(By.id("userMenu")).click();
                   System.out.println("menu clicked");


                   driver.findElement(By.xpath("//a[@title='Credit Transfer']")).click();

                   WebElement webobject1 = driver.findElement(By.xpath("//a[@title='Template List']"));
                 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject1);
                 System.out.println("Navigating to Template window");
                 Thread.sleep(5000);
                  driver.switchTo().frame("panel4");
//wd.switchTo().frame("panel3");
                      System.out.println("Frame switched");

               Thread.sleep(2000);

             driver.findElement(By.id("Search")).click();
             System.out.println("Search is clicked");

             Thread.sleep(2000);


                WebElement tabclicks = driver.findElement(By.xpath("/html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
//commands for right click
             Actions action = new Actions(driver).contextClick(tabclicks);
            action.build().perform();
                 System.out.println("right click");
                    Thread.sleep(1000);
//wd.findElement(By.id("ct_w_RemTmpltLst_CASL_Table_m_1_5")).click();
                 driver.findElement(By.xpath("html/body/form/div/div/ul/li[5]/input")).click();
             Thread.sleep(2000);
                 System.out.println("Create Remittance is clicked");
                 Thread.sleep(1000);

               Alert save41 = driver.switchTo().alert();
                save41.accept();
                     Thread.sleep(5000);
                   driver.switchTo().defaultContent();

                 driver.switchTo().frame("panel5");
  
  
                System.out.println("Frame switched again");


               driver.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("100");

             System.out.println("credit amount entered");




                driver.findElement(By.id("Save&Close55")).click();
              System.out.println("Save and close");
               Alert save51 = driver.switchTo().alert();
             save51.accept();
             Alert remitance52 = driver.switchTo().alert();
				S=remitance52.getText();
				RemId7 = S.substring(S.indexOf("-") + 2);
				System.out.println("7.)BOBT through template " + RemId7);
				remitance3a.accept();
				Thread.sleep(3000);
		        driver.findElement(By.id("Save&Close55")).click();	
				//System.out.println("Save and close");
				Alert rem37 = driver.switchTo().alert();
				rem37.accept();
		
		}
		
		
		catch(Exception e)
		{}
		
}
}

					
							
					

