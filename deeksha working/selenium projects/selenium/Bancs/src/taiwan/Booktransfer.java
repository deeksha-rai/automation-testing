package taiwan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Booktransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			WebDriver driver;
			System.setProperty("webdriver.ie.driver","D:/Internet Explorer/IEDriverServer_Win32_2.40.0/IEDriverServer.exe/");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("http://172.21.163.65:24000/Bancs");
			for(String winHandle: driver.getWindowHandles())
				{
					driver.switchTo().window(winHandle);
				}

		 	driver.findElement(By.xpath("//*[@id='userId']")).sendKeys("renukatm");
		 	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("verma5");
		 	Thread.sleep(1000);
		 	driver.findElement(By.xpath("//*[@id='entity']")).click();
		 	Thread.sleep(1000);
		 	driver.findElement(By.xpath("//*[@id='Login']")).click();
		 	for(String winHandle: driver.getWindowHandles())
		 		{
		 			driver.switchTo().window(winHandle);
		 		}
		 	 for(String winHandle: driver.getWindowHandles())
				{
					driver.switchTo().window(winHandle);
				}
		 	Thread.sleep(3000);
		 	driver.findElement(By.id("userMenu")).click();
		 	driver.findElement(By.xpath("//*[@id='firstLevelWrapper_scroll']/ul/li[2]/a ")).click();
		 	WebElement webobject2 = driver.findElement(By.xpath("//a[@title='Book Transfer']"));
		 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject2); 
		 	System.out.println("Clicked Book Transfer");
	   }
   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
}
	}


