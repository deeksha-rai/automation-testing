package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Futuredated {

	public static String RemId;
	public String createCTRem (WebDriver wd)
	{
		try{
			wd.findElement(By.id("tabText_0")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
	        
			 WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Outward Remittance']"));
		       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
			System.out.println("Navigating to remittance window");
			wd.switchTo().frame("panel2");
			WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
			Source_sys.sendKeys("Manual Entries-Fax");
			System.out.println("Source System is selected");
			Thread.sleep(5000);
			wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("201610191");
			System.out.println("debit account entered");
			Thread.sleep(2000);
			wd.findElement(By.xpath("html/body/form/div/div[2]/fieldset/div[2]/input")).sendKeys("21.04.2017");
			wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("135200");
			Thread.sleep(5000);
			System.out.println("Amount entered");
			wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("789456123");
			System.out.println("credit account entered");
			wd.findElement(By.id("Save&Close50")).click();
			System.out.println("Save and close");
			wd.findElement(By.id("continue")).click();
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



