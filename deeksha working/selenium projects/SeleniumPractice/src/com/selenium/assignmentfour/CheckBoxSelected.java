package com.selenium.assignmentfour;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelected {

	WebDriver driver;
	public void invokeChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chrome driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-form/");
			JavascriptExecutor jse= (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			boolean checked=driver.findElement(By.id("profession-0")).isSelected();
			boolean checked2=driver.findElement(By.id("profession-1")).isSelected();
			if (checked==true)
				System.out.println(driver.findElement(By.id("profession-0")).getText() +""+"is selected");
			else if (checked2==true)
				System.out.println(driver.findElement(By.id("profession-1")).getText() +""+"is selected");
			else
				System.out.println("none selected");

		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxSelected obj=new CheckBoxSelected();
		obj.invokeChromeBrowser();
		
	}

}
