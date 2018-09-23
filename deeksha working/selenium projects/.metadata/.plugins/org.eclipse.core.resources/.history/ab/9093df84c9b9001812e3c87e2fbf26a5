package walletHubReviewCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginToSite {

	public static WebDriver driver=BrowserSelection.driver;
	
	
	public static void clickOnLogin() throws Exception
	{
		System.out.println(1);
		driver.findElement(By.xpath("//*[@id=\"viewport\"]/header/div/nav[3]/div[2]/a[1]")).click();
		System.out.println(1);
	}
	
	public static void enterDetails(String username, String password) throws Exception
	{ System.out.println(1);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"join-login\"]/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"join-login\"]/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"join-login\"]/form/div[4]/button[2]")).click();
	}
}
