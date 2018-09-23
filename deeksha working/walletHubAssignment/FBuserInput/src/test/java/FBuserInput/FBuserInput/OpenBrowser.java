package FBuserInput.FBuserInput;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenBrowser {
	static WebDriver driver;
	public static void login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide username and password that you will enter");
		String username=sc.nextLine();
		String Pass=sc.nextLine();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver2.37\\chromedriver.exe");
		driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(Pass);
		driver.findElement(By.id("loginbutton")).click();
        sc.close();
	}
	
	public static void postStatus() throws InterruptedException
	{
	   WebDriverWait wait = new WebDriverWait(driver, 500);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[contains(@title,'Write something here...')]")));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@title,'Write something here...')]")));
       driver.findElement(By.xpath("//textarea[contains(@title,'Write something here...')]")).click();
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@contenteditable='true']")));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
       driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys("Hello World");
       WebDriverWait wt = new WebDriverWait(driver,30);
       wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Share']"))).click();
   }
	public static void main(String args[]) 
	{
		try {
			OpenBrowser.login();
		    OpenBrowser.postStatus();
		    driver.close();
		    } 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
}
	}

