package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Postscript {
	public void Createpostscript (WebDriver wd  ) throws InterruptedException{
		Thread.sleep(3000);
			wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        Thread.sleep(5000);
	         wd.findElement(By.xpath("//a[@title='Exception Management']")).click();
	        
			System.out.println("Exception Management is openned");
			
		
	        WebElement webobject2 ;
	        webobject2 = wd.findElement(By.xpath("//a[@title='PostScript']"));
	        JavascriptExecutor executor1 = (JavascriptExecutor)wd;
	        executor1.executeScript("arguments[0].click();", webobject2);
	       
			System.out.println("PostScript is openned");
			Thread.sleep(4000);
			wd.switchTo().frame("panel2");
			WebElement Source_sys = wd.findElement(By.id("plm_ct_PostScriptDtls_wca_TXN_POS_NUM"));
			Source_sys.sendKeys("111325");
			WebElement Source_sys1 = wd.findElement(By.id("plm_ct_PostScriptDtls_wca_SQNC_NUM"));
			Source_sys1.sendKeys("1");
			System.out.println("Payment eneterd");
			//wd.switchTo().frame("panel3");
			WebElement Source_sys2 = wd.findElement(By.id("plm_ct_Rmrks_wca_RMRKS_LNG2"));
			Source_sys2.sendKeys("Reason");
			Thread.sleep(3000);
			 wd.findElement(By.id("Save&Close5")).click();
			 System.out.println("Save Clicked");
			 wd.switchTo().alert().accept();
			 wd.close();
}}
