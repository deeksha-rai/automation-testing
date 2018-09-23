package VietnammanualSanity;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FilenameFilter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Taiwanfileupload {
	
public  WebDriver fileuploadlogin() throws InterruptedException
	
	
	{

	System.setProperty("webdriver.chrome.driver", "D:/Vikas kapoor selenium notes/chromedriver.exe");
    WebDriver driver = new   ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("http://172.21.163.65:24000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null&status=null");
	driver.manage().window().maximize();
	driver.findElement(By.name("userId")).sendKeys("pat3");
	
	WebElement password=driver.findElement(By.name("password"));
	 password.sendKeys("tcs123");
	 
		password.sendKeys(Keys.RETURN);
	
		driver.findElement(By.id("Login")).submit();
		System.out.println("logged in");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("userMenu")).click();
		System.out.println("menu clicked");
		driver.findElement(By.xpath("//a[@title='Service Integrator']")).click();
		WebElement webobject2 ;
        webobject2 = driver.findElement(By.xpath("//a[@title='File Upload Details']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", webobject2);
        return driver;
	
	}



public void Gcmsfileupload(WebDriver driver) throws InterruptedException

{
	
	Thread.sleep(4000);
	driver.switchTo().frame("panel2");
	System.out.println("Frame switched");
	driver.findElement(By.id("pts_ct_FlUpldDtls_wca_SOURCE_SYS-button")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/div/ul/li[2]/div/div/ul/li[2]")).click();
	 
	 
	 
	System.out.println("Source System as GCMS upload selected");
	driver.switchTo().frame("UploadFrame");
	WebElement abc= driver.findElement(By.xpath("/html/body/form/center/input"));
	String dir = "C:\\Users\\1210923\\Downloads\\";
	File f = new File(dir);
	File[] matchingFiles = f.listFiles(new FilenameFilter() {
		public boolean accept(File dir, String name) {
			return name.startsWith("GCMS") && name.endsWith("txt");
		}
	});

	File myfile = matchingFiles[0];
	String fname = myfile.getName();
	System.out.println(fname);
	abc.sendKeys("C:\\Users\\1210923\\Downloads\\" + fname);
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("/html/body/form/center/input[2]")).click();
	System.out.println("upload clicked");
	driver.switchTo().alert().accept();
	 System.out.println("File Acquired");
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("panel2");
	 driver.findElement(By.id("Save&Close6")).click();
	 driver.switchTo().alert().accept();
	 System.out.println("File uploaded successfully");
	 Thread.sleep(2000);
}


public void Fdfileupload(WebDriver driver) throws InterruptedException

{
	
	Thread.sleep(4000);
	driver.switchTo().frame("panel2");
	System.out.println("Frame switched");
	driver.findElement(By.id("pts_ct_FlUpldDtls_wca_SOURCE_SYS-button")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/div/ul/li[2]/div/div/ul/li[3]")).click();
	 
	 
	 
	System.out.println("Source System as FD upload selected");
	driver.switchTo().frame("UploadFrame");
	WebElement abc= driver.findElement(By.xpath("/html/body/form/center/input"));
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
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("/html/body/form/center/input[2]")).click();
	System.out.println("upload clicked");
	driver.switchTo().alert().accept();
	 System.out.println("File Acquired");
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("panel2");
	 driver.findElement(By.id("Save&Close6")).click();
	 driver.switchTo().alert().accept();
	 System.out.println("File uploaded successfully");
	 Thread.sleep(2000);
}



public void Fixtie(WebDriver driver) throws InterruptedException
{

	Thread.sleep(4000);
	driver.switchTo().frame("panel2");
	System.out.println("Frame switched");
	driver.findElement(By.id("pts_ct_FlUpldDtls_wca_SOURCE_SYS-button")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/div/ul/li[2]/div/div/ul/li[5]")).click();
	 
	 
	 
	System.out.println("Source System as Fix tie upload selected");
	driver.switchTo().frame("UploadFrame");
	WebElement abc= driver.findElement(By.xpath("/html/body/form/center/input"));
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
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("/html/body/form/center/input[2]")).click();
	System.out.println("upload clicked");
	driver.switchTo().alert().accept();
	 System.out.println("File Acquired");
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("panel2");
	 driver.findElement(By.id("Save&Close6")).click();
	 driver.switchTo().alert().accept();
	 System.out.println("File uploaded successfully");
	 Thread.sleep(2000);	
	
	
	
}

	
	
	
	
	
	


	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Taiwanfileupload abc = new Taiwanfileupload();
		
		WebDriver driver = abc.fileuploadlogin();
		
		
		abc.Fdfileupload(driver);
		abc.Gcmsfileupload(driver);
		abc.Fixtie(driver);
		
		
		

	}

}
