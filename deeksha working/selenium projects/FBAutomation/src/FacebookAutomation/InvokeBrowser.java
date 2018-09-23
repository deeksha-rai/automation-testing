package FacebookAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	static WebDriver driver;
	public static void callBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	public static void main(String args[])
	{
		try
		{
		InvokeBrowser.callBrowser();
//		CreateAccountInFB.enterdetails();
		LoginToFB.login();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
