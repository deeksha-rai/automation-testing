package utilities;

public class ConstantValues {
	
	public static final String chromedriverexe = "D:\\selenium\\chrome driver\\chromedriver.exe";
	public static final String firefoxdriverexe = "C:\\Automation\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	public static final String excelPath = "D:\\selenium\\com.Hybriddrivenframework.edureka\\Test.xlsx";
	public static final String propertiesfile = "D:\\selenium\\com.Hybriddrivenframework.edureka\\locators.properties";
	public static final String screenshotpath = "D:\\selenium\\ScreenShots\\";
	
	public static final String browserType = excelReadwrite.readValues("TestData", 1, 5);
	public static final String websiteURL = excelReadwrite.readValues("TestData", 2, 5);
	public static final String firstName = excelReadwrite.readValues("TestData", 10, 5);
	public static final String lastName = excelReadwrite.readValues("TestData", 11, 5);
	public static final String userName = excelReadwrite.readValues("TestData", 12, 5);
	public static final String password = excelReadwrite.readValues("TestData", 13, 5);
	public static final String confirmPassword = excelReadwrite.readValues("TestData", 14, 5);
	public static final String emailID = excelReadwrite.readValues("TestData", 15, 5);
	public static final String companyName = excelReadwrite.readValues("TestData", 16, 5);
	public static final String streetName = excelReadwrite.readValues("TestData", 17, 5);
	public static final String cityName = excelReadwrite.readValues("TestData", 18, 5);
	public static final String zipCode = excelReadwrite.readValues("TestData", 19, 5);
	public static final String phone = excelReadwrite.readValues("TestData", 20, 5);
	public static final String country = excelReadwrite.readValues("TestData", 21, 5);
	public static final String state = excelReadwrite.readValues("TestData", 22, 5);
	
}
