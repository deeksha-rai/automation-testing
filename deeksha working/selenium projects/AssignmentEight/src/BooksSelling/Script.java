
package BooksSelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	static WebDriver driver;
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.barnesandnoble.com");
	}
	
	public static void main(String args[])
	{
		//Calling Browser To Open
		Script.openBrowser();
		
		//Close The PopUp that appears when site opens up.
		LandingPage.closePopUpBox();
		
		
		//Click on Create new Account link
		try {
			LandingPage.MyAccountLink();
			LandingPage.CreateAnAccountLink();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Provide Info for new user
		LandingPage.FirstName();
		LandingPage.LastName();
		LandingPage.Email();
		LandingPage.ConfirmEmail();
		LandingPage.Password();
	LandingPage.ConfirmPassword();
	LandingPage.SecuirtyQuestion();
		LandingPage.SecurityAnswer();
		LandingPage.CreateAcntlnk();
	
//	Bestseller.Biography();
//	MatchBestSeller.checkBestsellerAndBiograph();
	
	}
	
	

}
