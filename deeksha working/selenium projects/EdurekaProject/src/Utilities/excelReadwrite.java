package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReadwrite {
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFRow wr;
	static XSSFCell c1;
	public static void setExcelPath(String PathName) throws Exception
	{
		File f=new File(PathName);
		FileInputStream fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		
	}
	public static String readStringValues(String Sheetname,int rownumber,int cellnumber)
	{
		ws=wb.getSheet(Sheetname);
		c1=ws.getRow(rownumber).getCell(cellnumber);
		String cellValue=c1.getStringCellValue();
		System.out.println(cellValue);
		return cellValue;
	}
	public static int readIntegerValues(String Sheetname,int rownumber,int cellnumber)
	{
		ws=wb.getSheet(Sheetname);
		c1=ws.getRow(rownumber).getCell(cellnumber);
		int cellValue= (int) c1.getNumericCellValue();
		return cellValue;

}
	public static void writeValues(String Sheetname,int rownumber,int cellnumber,String Value)throws Exception
	{
		ws=wb.getSheet(Sheetname);
		c1=ws.getRow(rownumber).getCell(cellnumber);
		c1.setCellValue(Value);
		FileOutputStream fos=new FileOutputStream(ConstantValues.excelPath);
		wb.write(fos);
		fos.close();
		wb = new XSSFWorkbook(new FileInputStream(ConstantValues.excelPath));
		

}
	
}
