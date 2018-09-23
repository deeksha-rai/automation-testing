package walletHubReviewCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserSelection {

	public static WebDriver driver;
	public void OpenBrowser(String browserName) throws Exception
	{
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver2.37\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		
		 driver=new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}
	
}
	
	public void openUrl(String url)
	{
		driver.get(url);
	}
	
	
}