package taiwan;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Ordersummary {
	public static  String abc;
	public void os (WebDriver wd) throws InterruptedException
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
		 
		 Thread.sleep(3000);
		 wd.switchTo().defaultContent();
		wd.switchTo().frame("panel4");
			WebElement webobject2 = (WebElement)wd.findElement(By.xpath("/html/body/form/span/fieldset/div[2]/table/tbody/tr/td[4]"));   
			System.out.println("Amount elelment found");
			System.out.println(webobject2.getClass());
		abc=webobject2.getText();
			//abc=webobject2.getTagName();
			System.out.println("Start"+webobject2.getAttribute("svrval")+"End");
	        System.out.println("amount is: "+abc);
	         wd.switchTo().defaultContent();
	
	}}




