package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FileRelease {
public void fr (WebDriver wd  ) throws InterruptedException{
	//Thread.sleep(8000);	  
	System.out.println("Entered file release");
		  
	      wd.switchTo().defaultContent();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.findElement(By.id("userMenu")).click();
        System.out.println("menu clicked");
        System.out.println("Navigate to Service Integrator");
	    wd.findElement(By.xpath("//a[@title='Service Integrator']")).click();
	    Thread.sleep(3000);
	    WebElement webobject2 = wd.findElement(By.xpath("//a[@title='Message List ']"));
	    webobject2.click();
		System.out.println("Message List is opened");
		Thread.sleep(5000);
	//	wd.switchTo().defaultContent();
		wd.switchTo().frame("panel3");
		System.out.println("frame switch");
		//MCB_SearchWC_wca_PROCESSINGTYPE-button
		wd.findElement(By.id("MCB_SearchWC_wca_PROCESSINGTYPE-button")).click();
		//WebElement Source_sys = wd.findElement(By.xpath("/html/body/form/div[2]/ul/li/ul/li/div/div/div/ul"));
		//Source_sys.click();
		System.out.println("Element found");
		Thread.sleep(2000);
		 wd.findElement(By.xpath("/html/body/form/div[2]/ul/li/ul/li/div/div/div/ul/li[2]")).click();
	   
		System.out.println("files is selected");
		Thread.sleep(2000);
		 wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[3]/ul/li/div/div/a/span")).click();
		System.out.println("Drop down clicked");
		wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[3]/ul/li/div/div/div/ul/li[73]")).click();
		//webobject3.sendKeys("Uploaded");
		System.out.println("uploaded is selected");
		wd.findElement(By.id("Search")).click();
		System.out.println("Search is clicked");
		wd.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		System.out.println("now to click wizard for order summary");
		wd.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		  wd.switchTo().defaultContent();
		}
}

