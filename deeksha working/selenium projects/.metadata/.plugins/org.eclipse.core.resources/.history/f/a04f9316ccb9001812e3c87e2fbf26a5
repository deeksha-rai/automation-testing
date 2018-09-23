package walletHubReviewCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyReview {

	public static WebDriver driver=BrowserSelection.driver;
	public static void goToProfile()throws Exception
	{
		Actions act=new Actions(driver);
		WebElement profile=driver.findElement(By.xpath("//*[@id=\"viewport\"]/header/div/nav[3]/div[1]/a[9]"));
		act.moveToElement(profile).build().perform();
		driver.findElement(By.xpath("//*[@id=\"m-user\"]/ul/li[1]/a")).click();
		
	}
	public static void compareReviews(String str)throws Exception
	{
		str=str.concat("nbvhjvrjjrhgihgiowejbgajbvkgsabvohbefpiubWPIEFUBPwiebfvpiHBSD VB IHASBdavioGrpigbvpiHRR VGIrbg v;ijtfbfhew fhw dvh hv hw vhwfhwvefhvwh vhf v fdbbvbdfjjjjjjjjbbbbbbbbbbbvadfvbeioubfpoiwehvpsbpijafbpiaffjbvpisaubvpisajbiasbinbvhjvrjjrhgihgiowejbgajbvkgsabvohbefpiubWPIEFUBPwiebfvpiHBSD VB IHASBdavioGrpigbvpiHRR VGIrbg v;ijtfbfhew fhw dvh hv hw vhwfhwvefhvwh vhf v fdbbvbdfjjjjjjjjbbbbbbbbbbbvadfvbeioubfpoiwehvpsbpijafbpiaffjbvpisaubvpisajbiasbinbvhjvrjjrhgihgiowejbgajbvkgsabvohbefpiubWPIEFUBPwiebfvpiHBSD VB IHASBdavioGrpigbvpiHRR VGIrbg v;ijtfbfhew fhw dvh hv hw vhwfhwvefhvwh vhf v fdbbvbdfjjjjjjjjbbbbbbbbbbbvadfvbeioubfpoiwehvpsbpijafbpiaffjbvpisaubvpisajbiasbinbvhjvrjjrhgihgiowejbgajbvkgsabvohbefpiubWPIEFUBPwiebfvpiHBSD VB IHASBdavioGrpigbvpiHRR VGIrbg v;ijtfbfhew fhw dvh hv hw vhwfhwvefhvwh vhf v fdbbvbdfjjjjjjjjbbbbbbbbbbbvadfvbeioubfpoiwehvpsbpijafbpiaffjbvpisaubvpisajbiasbi");
		
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id=\"activity-content-12013666\"]/div[2]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String opinion=driver.findElement(By.xpath("//*[@id=\"reviews\"]/div[3]/div[1]/div[1]/div[5]")).getText();
		if(str.equalsIgnoreCase(opinion))
			System.out.println("review done sucessfully");
		else
			System.out.println("not done");
	}
}
