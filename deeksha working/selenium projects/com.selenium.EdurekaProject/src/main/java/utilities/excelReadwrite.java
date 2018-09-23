package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReadwrite {

	static XSSFSheet ws;
    static XSSFWorkbook wb;
    static XSSFRow r;
    static XSSFCell c1;
    
    public static void setExcelpath(String pathName) throws Exception {
    	File f = new File(pathName);
    	FileInputStream fis = new FileInputStream(f);
    	wb = new XSSFWorkbook(fis);
    }

    public static String readValues(String sheetName, int rowNumber, int columnNumber) {
    	ws = wb.getSheet(sheetName);
    	c1 = ws.getRow(rowNumber).getCell(columnNumber);
    	
	    	String cellValue = c1.getStringCellValue();
	    	return cellValue;
		}
    
    
    public static int readValuesinNumericformat(String sheetName, int rowNumber, int columnNumber) {
    	ws = wb.getSheet(sheetName);
    	c1 = ws.getRow(rowNumber).getCell(columnNumber);
    	
    	int cellValueNumeric = (int) c1.getNumericCellValue();
    	return cellValueNumeric;
    }
    
    public static void writeToExcel(String sheetName, int rowNumber, int columnNumber, String valuetobewritten) throws Exception {
    	ws = wb.getSheet(sheetName);
    	c1 = ws.getRow(rowNumber).getCell(columnNumber);
    	c1.setCellValue(valuetobewritten);
    	
    	FileOutputStream fos = new FileOutputStream(ConstantValues.excelPath);
    	wb.write(fos);
    	fos.close();
    	
    	wb = new XSSFWorkbook(new FileInputStream(ConstantValues.excelPath));
    }
    
    public static int numberofrows(String sheetname) {
    	ws = wb.getSheet(sheetname);
    	int number = ws.getLastRowNum()+1;
    	return number;
    }
}
