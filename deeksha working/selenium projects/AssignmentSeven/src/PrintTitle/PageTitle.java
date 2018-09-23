package PrintTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
 
	static WebDriver driver;
	public static String invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.dropbox.com/");
        String Title=driver.getTitle();
        driver.close();
        return Title;
        
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			String TitleOfPage=PageTitle.invokeBrowser();
			System.out.println("Title of Page  :" + " " + TitleOfPage);
		}

	}

}
