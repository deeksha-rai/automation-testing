package taiwan;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Channel_Selection {
public void fileupload (WebDriver wd  ) throws InterruptedException{
	Thread.sleep(5000);
		wd.findElement(By.id("tabText_0")).click();
		wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        System.out.println("menu clicked");
        Thread.sleep(5000);
         wd.findElement(By.xpath("//span[@title='Service Integrator']")).click();
        
		System.out.println("Service integrator is openned");
	
        WebElement webobject2 ;
        webobject2 = wd.findElement(By.xpath("//p[@title='File Upload Details']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)wd;
        executor1.executeScript("arguments[0].click();", webobject2);
       
		System.out.println("File Upload is openned");
		Thread.sleep(4000);
		wd.switchTo().frame("panel2");
		System.out.println("Frame switched");
		 wd.findElement(By.xpath("/html/body/form/div/div/div/div/div/span/span[2]/img")).click();
		 wd.findElement(By.xpath("/html/body/form/div[4]/li[3]")).click();
		System.out.println("Source System is selected");
		wd.switchTo().frame("UploadFrame");
		WebElement abc= wd.findElement(By.xpath("/html/body/form/center/input"));
		String dir = "C:\\Users\\1210923\\Downloads\\";
		File f = new File(dir);
		File[] matchingFiles = f.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith("FD_") && name.endsWith("txt");
			}
		});

		File myfile = matchingFiles[0];
		String fname = myfile.getName();
		System.out.println(fname);
		abc.sendKeys("C:\\Users\\1210923\\Downloads\\" + fname);
		wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		wd.findElement(By.xpath("/html/body/form/center/input[2]")).click();
		System.out.println("upload clicked");
		 wd.switchTo().alert().accept();
		 System.out.println("File Acquired");
		 wd.switchTo().defaultContent();
		 wd.switchTo().frame("panel2");
		 wd.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr/td[2]/div/a[4]/img")).click();
		 wd.switchTo().alert().accept();
		 System.out.println("File uploaded successfully");
		 Thread.sleep(15000);
}

} 

