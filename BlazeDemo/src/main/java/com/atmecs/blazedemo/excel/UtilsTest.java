package com.atmecs.blazedemo.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilsTest {
	public static File file;
	public static FileInputStream fis;
	
	public static String readData( int row, int column) throws Exception {
	
		String data=null;
		//file = new File(path);
		fis=new FileInputStream("./src/test/resources/Userinformation.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
		XSSFCell cell = sheet.getRow(row).getCell(column);
		data = cell.toString();
		return data;
	}
}
	/*
	 * public static String[][] excel(String path) throws IOException { File file =
	 * new File(path); FileInputStream fileInput = new FileInputStream(file);
	 * 
	 * @SuppressWarnings("resource") XSSFWorkbook book = new
	 * XSSFWorkbook(fileInput); XSSFSheet sheet = book.getSheetAt(0); int row1 =
	 * sheet.getLastRowNum(); row1 += 1; // System.out.println(row1); int col =
	 * sheet.getRow(0).getLastCellNum(); String array[][] = new String[row1][col];
	 * int count = 0; for (Row row : sheet) { int count1 = 0; for (Cell cell : row)
	 * { String Data = cell.toString(); array[count][count1] = Data; count1++; }
	 * count++; }
	 * 
	 * return array; }
	 */			

			



