package TicketBooking;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Evidences {

	public static void getScreenshot(TakesScreenshot ts, String imagename) throws Exception {
		String screenshotpath="D:\\selenium\\ScreenShots\\";
		SimpleDateFormat sf = new SimpleDateFormat("ddMMyy@hh@mm@ss");
		Date dateObj = new Date();
		System.out.println(sf.format(dateObj));
		File fileBrs = new File(screenshotpath + imagename + sf.format(dateObj) +  ".jpeg");
		System.out.println(fileBrs);
		File filesrc = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(filesrc);
		Files.move(filesrc, fileBrs);
		System.out.println(1);
	}
}
