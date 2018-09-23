package TicketBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingSite {
	public static WebDriver driver;
	public static void  openSite()
	{
		System.setProperty("webdriver.cjhrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

}
