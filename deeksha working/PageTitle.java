package com.edureka.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageTitle {
 
	static WebDriver driver;
	public static String invokeBrowser()
	{
		System.setProperty("webdriver.ie.driver", "D:\\selenium\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        driver.get("http://newtours.demoaut.com/");
        String Title=driver.getTitle();
        driver.close();
        return Title;
        
	}
	public static void main(String[] args) {
		PageTitle obj=new PageTitle();
		for(int i=0;i<5;i++)
		{
			String TitleOfPage=obj.invokeBrowser();
			System.out.println("Title of Page  :" + " " + TitleOfPage);
		}

	}

}
