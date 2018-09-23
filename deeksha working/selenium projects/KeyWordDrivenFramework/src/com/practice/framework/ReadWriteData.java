package com.practice.framework;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteData {

	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static void setxcelPath() throws IOException {
		File f=new File("F:\\deeksha working\\selenium projects\\SeleniumFrameworkPractice\\TestData.xlsx");
		System.out.println(1);
		FileInputStream fis=new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readStringDataFromSheet(String SheetName,int rownum,int colnum)
	{
		
		ws=wb.getSheet(SheetName);
		r=ws.getRow(rownum);
		c=r.getCell(colnum);
		System.out.println(2);
		//if(c.getCellTypeEnum()==CellType.STRING )
		
		String value=c.getStringCellValue();
		return value;
		
		
	}
	public static int readIntegerDataFromSheet(String sheetnm,int row,int col)
	{
		ws=wb.getSheet(sheetnm);
		r=ws.getRow(row);
		c=r.getCell(col);
	int val=(int) c.getNumericCellValue();
	return val;
	}
	
	public static void writeResult(String sheet,int row,int cell,String Value) throws IOException
	{
		ws=wb.getSheet(sheet);
		r=ws.getRow(row);
		c=r.getCell(cell);
		c.setCellValue(Value);
		FileOutputStream fos=new FileOutputStream("F:\\\\deeksha working\\\\selenium projects\\\\SeleniumFrameworkPractice\\\\TestData.xlsx");
		wb.write(fos);
		fos.close();
		
	}
}
