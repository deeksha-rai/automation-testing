package supportProviderUtilities;
public class ConstantsDeclared {
	public static final String excelPath="F:\\deeksha working\\selenium projects\\walletHubTest\\TestData.xlsx";
	public static final String chromedriverexe="D:\\selenium\\chromedriver2.37\\chromedriver.exe";
	public static final String propertiesfile="F:\\deeksha working\\selenium projects\\walletHubTest\\propertyFile.txt";
	public static final String firefoxdriverexe="D:\\selenium\\firefoxdriver\\geckodriver.exe";
	public static final String browser=ExcelReadWrite.readStringData("Data", 1, 5);
	public static final String url=ExcelReadWrite.readStringData("Data", 2, 5);
	public static final String userName=ExcelReadWrite.readStringData("Data", 4, 5);
	public static final String passowrd=ExcelReadWrite.readStringData("Data", 5, 5);
	public static final String review=ExcelReadWrite.readStringData("Data", 13, 5);


}
