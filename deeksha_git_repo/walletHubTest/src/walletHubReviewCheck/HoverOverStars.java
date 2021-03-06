package walletHubReviewCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOverStars {
	public static WebDriver driver=BrowserSelection.driver;
	
	public static void hoveronstars() throws Exception
	{
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		WebElement stars=driver.findElement(By.xpath("//*[@id=\"wh-body-inner\"]/div[2]/div[3]/span"));
		System.out.println(5);
		act.moveToElement(stars).build().perform();
		
		String three="//div[@class='wh-rating-choices-holder']/a[contains(@href,'#')][3]";
		System.out.println("Stars getting lit up");
		String five="//div[@class='wh-rating-choices-holder']/a[contains(@href,'#')][5]";
		act.moveToElement(driver.findElement(By.xpath(three))).build().perform();
		Thread.sleep(6000);
		act.moveToElement(driver.findElement(By.xpath(five))).click().build().perform();
		
		
	}
}
