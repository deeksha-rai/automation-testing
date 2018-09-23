package taiwan;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelogin {
	
	WebDriver login1;
	public WebDriver login_screen(String user,String pwd)
	{
		WebDriver login1;
	File file = new File("D:/Vikas kapoor selenium notes/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	login1 = new ChromeDriver();
	login1.get("http://172.21.163.65:24000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null");
	login1.navigate().refresh();
	login1.manage().window().maximize();
try{
	   WebElement username = login1.findElement(By.id("userId"));
	   username.sendKeys(user);
	   WebElement password = login1.findElement(By.id("password"));
	   password.sendKeys(pwd);
 	   Thread.sleep(100L);
 	   //WebElement oupca =  login1.findElement(By.id("entity"));
 	   



password.sendKeys(Keys.RETURN);
 	   //oupca.sendKeys("BTMU Taipei Branch");
 	   //Select select = new Select(oupca);
 	   //select.selectByValue("BTMU Taipei Branch");
 	   WebElement login = login1.findElement(By.id("Login"));
 	   login.click();
 	   login1.manage().window().maximize();
 	   System.out.println("logged in");
 	   Thread.sleep(1000);
 	   login1.manage().timeouts().implicitlyWait(70L, TimeUnit.SECONDS);
 	   
}

      catch (InterruptedException e) {
			e.printStackTrace();
		}

	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
return login1; 
   	    
}





}
