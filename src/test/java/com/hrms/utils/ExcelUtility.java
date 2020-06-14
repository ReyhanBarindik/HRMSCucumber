package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static Workbook wBook;
	private static Sheet sheet;
	
	public static void openExcel (String filePath, String sheetName) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			try {
				wBook=new XSSFWorkbook(fis);
				sheet=wBook.getSheet(sheetName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public static int colCount () {
		return sheet.getRow(0).getLastCellNum();
	}
	
	public static String getCellData (int rowIndex, int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
	}
	
	
	public static List<Map<String,String>> excelIntoListOfMaps (String filePath, String sheetName) {   // bunu call yapacagiz 
		openExcel (filePath, sheetName);
		
		List<Map<String, String>> data= new ArrayList<Map<String, String>>(); //rowCount()-1 cunku header'i istemiyoruz username in oldugu yere username yazmiyoruz tabiki
		
		for (int i=1; i<rowCount(); i++) {   //-->loop for data starts with 1 because every row gives a map us but first row is header
			
			Map<String, String>map = new HashMap <>();
			for (int j=0; j<colCount(); j++) {
				map.put(getCellData(0,j), getCellData(i,j));  //---> getCellData(0,j) header       getCellData(i,j) data
			}
			data.add(map);
		}
		return data;
	}
	
	
	
	public static List<ArrayList<String>> excelIntoListOfList (String filePath, String sheetName) {
		openExcel(filePath, sheetName);
		List<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		return data;
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
