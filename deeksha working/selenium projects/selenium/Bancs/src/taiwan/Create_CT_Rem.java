package taiwan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_CT_Rem {
	
		public static String RemId;
		static DateFormat dateFormat = new SimpleDateFormat("mmss");
	    static Date date = new Date();
		public static final int amount = Integer.parseInt((dateFormat.format(date)));
		public String createCTRem (WebDriver wd)
		{
			try{
				wd.findElement(By.id("userMenu")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        
		        wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li/div/div/ul/li[2]/a")).click();
		        
				 WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Outward Remittance']"));
			       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to remittance window");
				wd.switchTo().frame("panel2");
				//WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
				//Source_sys.sendKeys("Manual Entries-Fax");
				//System.out.println("Source System is selected");
				Thread.sleep(5000);
				wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("512004472");
				System.out.println("debit account entered");
				Thread.sleep(2000);
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(Integer.toString(amount));
				Thread.sleep(5000);
				System.out.println("Amount entered");
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("123456");
				System.out.println("credit account entered");
				wd.findElement(By.id("Save&Close55")).click();
				System.out.println("Save and close");
				Alert save = wd.switchTo().alert();
				save.accept();
				Alert remitance = wd.switchTo().alert();
				String S=remitance.getText();
				System.out.println(S);
				RemId = S.substring(S.indexOf("-") + 2);
				//System.out.println(RemId);
				remitance.accept();
				wd.close();
				
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
		
	}


