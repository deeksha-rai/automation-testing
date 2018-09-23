package com.selenium.practice.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithExcel {
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFCell wc;
	static XSSFRow wr;
	public static String excelpath="D:\\selenium\\TestData.xlsx";

	public  void setExcelPath() throws Exception
	{
		File f=new File(excelpath);
		FileInputStream fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		
		
	}
	public  void readValues(String sheetname,int rowNumber,int colNumber)
	{
		ws=wb.getSheet(sheetname);
		wc=ws.getRow(rowNumber).getCell(colNumber);
		String cellvalue=wc.getStringCellValue();
		System.out.println(cellvalue);
		
	}
	public  void readIntValues(String sheetname,int rownum,int cellnum)
	{
		ws=wb.getSheet(sheetname);
		wc=ws.getRow(rownum).getCell(cellnum);
		long cellvalue=(long)wc.getNumericCellValue();
		System.out.println(cellvalue);
	}
	public void writeToExcel(String value,String sheetname,int rownum,int cellnum) throws Exception
	{
		File f=new File(excelpath);
		ws=wb.getSheet(sheetname);
		wc=ws.getRow(rownum).getCell(cellnum);
		wc.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		
	}

}
