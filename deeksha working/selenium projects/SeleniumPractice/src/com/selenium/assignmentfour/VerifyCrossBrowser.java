package com.selenium.assignmentfour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class VerifyCrossBrowser {

	WebDriver driver;

	public void invokeChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chrome driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			String str=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div")).getText();
			System.out.println(str);
			String freetouse=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[1]/div[2]")).getText();
			System.out.println(freetouse);
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public void invokefireBrowser() {
//		try {
//			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\mozila\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			driver.get("https://www.facebook.com/");
//			System.out.println(driver.getTitle());
//			String str=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div")).getText();
//			System.out.println(str);
//			String freetouse=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[1]/div[2]")).getText();
//			System.out.println(freetouse);
//			
//		
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VerifyCrossBrowser obj=new VerifyCrossBrowser();
		obj.invokeChromeBrowser();
//		obj.invokefireBrowser();
	}

}



