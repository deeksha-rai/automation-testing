package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Evidences {

	public static void getScreenshot(TakesScreenshot ts, String imagename) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat("ddMMyy@hh@mm@ss");
		Date dateObj = new Date();
		System.out.println(sf.format(dateObj));
		File fileBrs = new File(ConstantValues.screenshotpath + imagename + sf.format(dateObj) +  ".jpeg");
		File filesrc = ts.getScreenshotAs(OutputType.FILE);
		Files.move(filesrc, fileBrs);
	}
}
