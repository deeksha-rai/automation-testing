package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Authpostcript {
	public void Authpostscriptabc (WebDriver wd  ) throws InterruptedException{
		Thread.sleep(3000);
			wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        Thread.sleep(3000);
	         wd.findElement(By.xpath("//a[@title='Exception Management']")).click();
	        
			System.out.println("Exception Management is openned");
		
	        WebElement webobject2 ;
	        webobject2 = wd.findElement(By.xpath("//a[@title='PostScript List']"));
	        JavascriptExecutor executor1 = (JavascriptExecutor)wd;
	        executor1.executeScript("arguments[0].click();", webobject2);
	       
			System.out.println("PostScript List is openned");
			Thread.sleep(4000);
			wd.switchTo().frame("panel2");
			 //wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNG_VAL-button")).click();
			// System.out.println("drop down is clicked ");
			// wd.findElement(By.xpath("/html/body/form/div[4]/li[7]")).click();
			 //System.out.println("Release is clicked ");
			 Thread.sleep(3000);
			 wd.findElement(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_RNG_VAL_From)")).sendKeys("111325");
			 System.out.println("payment id eneterd ");
			 Thread.sleep(3000);
			 wd.findElement(By.id("Search")).click();
			 System.out.println("search is clicked ");
			 WebElement tabclicks = wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[3]"));
				
			 Thread.sleep(3000);
			 //commands for right click
				Actions action = new Actions(wd).contextClick(tabclicks);
				action.build().perform();
				System.out.println("right click");
			 wd.findElement(By.id("Authorize16")).click();
			 System.out.println("Authorise is clicked ");
			 wd.switchTo().defaultContent();
			 wd.switchTo().frame("panel3");
			 wd.findElement(By.id("Authorize6")).click();
			 System.out.println("Authorise is clicked ");
			 wd.findElement(By.id("Save_dialogButton")).click();
			 //wd.findElement(By.xpath("/html/body/form/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td")).click();
			 System.out.println("Save is clicked ");
			 wd.switchTo().alert().accept();
			 wd.close();
			 
}
}