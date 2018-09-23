package taiwan;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auth_ordermaster {
	public void ctod (WebDriver wd  ) throws InterruptedException
	{
		Thread.sleep(5000);
		 System.out.println("Entered CreditOrder Master details");
		 Set<String> s = wd.getWindowHandles();
			for (String windowObject : s) {
				wd.switchTo().window(windowObject);
			} 
			WebDriverWait wait = new WebDriverWait(wd, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td/span/table/tbody/tr[2]/td[4]/a"))).click();
		System.out.println("clicked credit order master");
		 System.out.println("Go to wizard for work item details");
		 //wd.switchTo().frame("panel5");
}
}