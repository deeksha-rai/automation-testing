package utilities;

import Utilities.excelReadwrite;

public class ConstantValues {
	
	public static final String chromedriverexe = "D:\\selenium\\chrome driver\\chromedriver.exe";
	public static final String excelPath = "C:\\Users\\SONY\\Documents\\deeksha working\\EdurekaProject\\TestData.xlsx";
	public static final String propertiesfile = "C:\\Users\\SONY\\Documents\\deeksha working\\EdurekaProject\\Locators.properties";
	public static final String screenshotpath = "D:\\selenium\\ScreenShots\\";
	
	public static final String browserType = excelReadwrite.readValues("TestData", 1, 5);
	public static final String websiteURL = excelReadwrite.readValues("TestData", 2, 5);
	public static final String userName = excelReadwrite.readValues("TestData", 3, 5);
	
	public static final String password = excelReadwrite.readValues("TestData", 4, 5);
	public static final String NoOfPassenger = excelReadwrite.readValues("TestData", 8, 5);
	public static final String DepartFrom = excelReadwrite.readValues("TestData", 9, 5);
	public static final String DepartMonth = excelReadwrite.readValues("TestData", 10, 5);
	public static final String DepartDate = excelReadwrite.readValues("TestData", 11, 5);
	public static final String ArriveCity = excelReadwrite.readValues("TestData", 12, 5);
	public static final String ReturnMonth = excelReadwrite.readValues("TestData", 13, 5);
	public static final String ReturnDate = excelReadwrite.readValues("TestData", 14, 5);
	public static final String Fname = excelReadwrite.readValues("TestData", 19, 5);
	public static final String Lname = excelReadwrite.readValues("TestData", 20, 5);
	public static final String meal = excelReadwrite.readValues("TestData", 21, 5);
	public static final String cardType = excelReadwrite.readValues("TestData", 22, 5);
	public static final String cardNumber = excelReadwrite.readValues("TestData", 23, 5);
	public static final String ExpMonth = excelReadwrite.readValues("TestData", 24, 5);
	public static final String ExpYear = excelReadwrite.readValues("TestData", 25, 5);
	public static final String FirstName = excelReadwrite.readValues("TestData", 26, 5);
	public static final String LastName = excelReadwrite.readValues("TestData", 27, 5);
	public static final String BillAddress = excelReadwrite.readValues("TestData", 28, 5);
	public static final String BilCity = excelReadwrite.readValues("TestData", 29, 5);
	public static final String BilState = excelReadwrite.readValues("TestData", 30, 5);
	public static final String BilzipCode = excelReadwrite.readValues("TestData", 31, 5);
	public static final String BilCountry = excelReadwrite.readValues("TestData", 32, 5);
	public static final String DelAddress = excelReadwrite.readValues("TestData", 33, 5);
	public static final String DelCity = excelReadwrite.readValues("TestData", 34, 5);
	public static final String Delstate = excelReadwrite.readValues("TestData", 35, 5);
	public static final String Delzipcode = excelReadwrite.readValues("TestData", 36, 5);
	public static final String DelCountry = excelReadwrite.readValues("TestData", 37, 5);
	
}
