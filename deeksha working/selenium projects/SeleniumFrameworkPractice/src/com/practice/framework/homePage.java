package com.practice.framework;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class homePage {
	public static WebDriver driver;

	public static void openBrowser() throws IOException
	{

		
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
			 driver= new ChromeDriver();
			driver.get("http://automationpractice.com//index.php");
			TakingScreenShot.takess();
		}
	
	public static void signIn() throws IOException
	{
		WebElement sign=driver.findElement(By.className("login"));
		TakingScreenShot.takess();
		sign.click();
		
	}
	public static void createAccount() throws IOException
	{
		WebElement username=driver.findElement(By.id("email_create"));
		username.sendKeys("abc2716Oxt1993boon@gmail.com");
		TakingScreenShot.takess();
	}
	public static void clickcreateAccount() throws IOException
	{
		WebElement clk=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		TakingScreenShot.takess();
		clk.click();
		
	}
	
	
	}

	


