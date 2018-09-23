package TicketBooking;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingSite {
	public static WebDriver driver;
	public static void  openSite()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	public static void main(String args[])
	{
		InvokingSite.openSite();
		try {
			Register.newUser();
			Thread.sleep(3000);
		
		SignUp.signinlink();
		SignUp.enterdetail();
     FlightBooking.bookflight();
     FlightBooking.selectflight();     
     MakePayment.providePassangerInfo();
     MakePayment.provideCardInfo();
     MakePayment.provideBillingInfo();
     MakePayment.provideDeliveryInfo();   
     Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		}
     catch (Exception e) {
			e.printStackTrace();
		}
     
	}
}
