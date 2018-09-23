import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser {
		static WebDriver driver;
		public static void main(String args[]) throws InterruptedException
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Provide username and password that you will enter");
			String username=sc.nextLine();
			String Pass=sc.nextLine();
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver2.37\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement user=driver.findElement(By.id("email"));
			user.click();
			String email=user.getAttribute("value");
			String password=driver.findElement(By.id("pass")).getAttribute("value");
			while((email.isEmpty())&&(password.isEmpty()))
			{
				WebDriverWait wt=new WebDriverWait(driver, 30);
				wt.until(ExpectedConditions.textToBePresentInElement(user, username));
				wt.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("pass")), Pass));
				
				email=driver.findElement(By.id("email")).getAttribute("value");
				password=driver.findElement(By.id("pass")).getAttribute("value");	
				
				
				
			}
			
			driver.findElement(By.id("u_0_2")).click();
			driver.close();
			sc.close();
	}

}
