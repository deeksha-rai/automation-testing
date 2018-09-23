package com.practice.framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class searchForTop {
	public static WebDriver driver=homePage.driver;

	
	public static void hoverOnWomen() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		WebElement main=driver.findElement(By.className("sf-with-ul"));
	
		act.moveToElement(main).build().perform();
		act.click();
		Thread.sleep(1000);
		TakingScreenShot.takess();
		driver.findElement(By.linkText("T-shirts")).click();
		TakingScreenShot.takess();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,150)", "");
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"))).click(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"))).build().perform();
		Thread.sleep(2000);
		TakingScreenShot.takess();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();;
		
		
		
	}
}
