package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Wizard {
	public void abc(WebDriver wd) throws InterruptedException
	{	
		Thread.sleep(5000);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Wizard is opened");	
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  wd.switchTo().defaultContent();
		wd.findElement(By.id("wizard")).click();
		System.out.println("Wizard is selected");	
		
	}


		
}



