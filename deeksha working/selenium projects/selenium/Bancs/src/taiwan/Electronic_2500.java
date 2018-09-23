package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Electronic_2500 {
	public  void createIBRS (WebDriver wd)
	{
		wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/div[2]/table[2]/tbody/tr[8]/td[3]/a")).click();
		wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        System.out.println("SISimulator MESSAGE is clicked");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td/div/div/div[5]/a[2]")).click();
		wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	     System.out.println("Build Now is Clicked");
	     wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	   wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr/td[3]/div/select")).sendKeys("UploadFile");
	   System.out.println("Operation is selected");
	     wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			
	     wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody[2]/tr/td[3]/div/input[2]")).sendKeys("D:\\File upload\\File.zip");
		   System.out.println("2100 message from TCMS is upload");
		     wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody[3]/tr/td[3]/div/select")).sendKeys("BTMUIAT");
			   System.out.println("Operation is selected");
			     wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody[4]/tr/td[3]/div/input[2]")).sendKeys("TCMSSEXTI");
		 System.out.println("TCMSEXTI is entered");
	     wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     wd.findElement(By.id("yui-gen1-button")).click();
	     System.out.println("2500 message  is injected successfully");
	     wd.close();
	     
}
}