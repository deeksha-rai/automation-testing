package FacebookAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginToFB {

	public static void login()throws Exception
	{
		WebElement email=InvokeBrowser.driver.findElement(By.name("email"));
		email.sendKeys("glimpse.boon@gmail.com");
		WebElement password=InvokeBrowser.driver.findElement(By.id("pass"));
		password.sendKeys("Imfhry@de80");
		WebElement LogIn=InvokeBrowser.driver.findElement(By.id("u_0_2"));
		LogIn.click();
		Thread.sleep(7000);
		Alert alert=InvokeBrowser.driver.switchTo().alert();
		alert.accept();
	}
}
