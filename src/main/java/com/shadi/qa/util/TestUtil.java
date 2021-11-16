package com.shadi.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.shadi.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	static String TESTDATA_SHEET_PATH = "F:\\Eclipse 2021\\ShadiDotComTestAutomation\\src\\main\\java\\com\\shadi\\qa\\testdata\\testdata.csv";
	static Workbook book;
	static Sheet sheet;
	static FileInputStream file;

//	public static Object[][] getTestData(String sheetName) {
//		
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			book = WorkbookFactory.create(file);
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//			}
//		}
//		return data;
//	}

	// This will load csv file 
	 CSVReader reader = new CSVReader(new FileReader("C:\\Users\\mukesh_otwani\\Desktop\\demo.csv"));
	 
	 // this will load content into list
	  List<String[]> li=reader.readAll();
	  System.out.println("Total rows which we have is "+li.size());
	            
	 // create Iterator reference
	  Iterator<String[]>i1= li.iterator();
	    
	 // Iterate all values 
	 while(i1.hasNext()){
	     
	 String[] str=i1.next();
	   
	 System.out.print(" Values are ");
	 
	 for(int i=0;i<str.length;i++)
	{
	 
	   System.out.print(" "+str[i]);
	 
	}
	   System.out.println("   ");
	     
	    
	}
}
