
package com.practice.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
//import org.openqa.selenium.WebDriverException;

public class TakingScreenShot {
	public static WebDriver driver=homePage.driver;
	public static void takess() throws IOException
	{
		SimpleDateFormat sf=new SimpleDateFormat("ddMMyy@hhmmss");
		Date dateobj=new Date();
		File brs=new File("F:\\deeksha working\\selenium projects\\SeleniumFrameworkPractice\\ScreenShot\\" + "image"+sf.format(dateobj)+".jpeg");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		Files.move(src, brs);
		
	}

}
