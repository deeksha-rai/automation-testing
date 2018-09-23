package taiwan;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login_Jenkins {
	WebDriver login1;
	public WebDriver login_screen(String user,String pwd)
	{
		File file = new File("C:/Program Files/Internet Explorer/iexplore.exe");
		System.setProperty("weblogin1.ie.login1", file.getAbsolutePath());
		login1 = new InternetExplorerDriver();
		login1.get("http://172.21.157.107:2222/login?from=%2F");
		login1.navigate().refresh();
		login1.manage().window().maximize();
	 
	   
	   try{
		   WebElement username = login1.findElement(By.id("j_username"));
		   username.sendKeys(user);
		   WebElement password = login1.findElement(By.name("j_password"));
		   password.sendKeys(pwd);
	 	   Thread.sleep(100L);
	 	    WebElement login = login1.findElement(By.id("yui-gen1-button"));
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
