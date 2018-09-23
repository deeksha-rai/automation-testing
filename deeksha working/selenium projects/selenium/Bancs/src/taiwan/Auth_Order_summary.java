
package taiwan;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Auth_Order_summary{
	public static String abc;
	public void osa (WebDriver wd  ) throws InterruptedException
	{
		Thread.sleep(5000);
		 System.out.println("Entered ordersummary");
		 Set<String> s = wd.getWindowHandles();
			for (String windowObject : s) {
				wd.switchTo().window(windowObject);
			} 
			WebDriverWait wait = new WebDriverWait(wd, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_1"))).click();
			 System.out.println("clicked ordersummary");
		wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[2]/ul/li[2]/label[3]/a")).click();
		 System.out.println("Remitence clicked");
		 System.out.println("Go to wizard for credit order master");
		 
	         wd.switchTo().defaultContent();
	
	}}




