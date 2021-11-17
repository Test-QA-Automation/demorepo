package com.shadi.qa.util;

import java.io.FileInputStream;

import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.shadi.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	static String TESTDATA_SHEET_PATH = "F:\\Eclipse 2021\\ShadiDotComTestAutomation\\src\\main\\java\\com\\shadi\\qa\\testdata\\testdata.xlsx";
	static Workbook book;
	static Sheet sheet;
	static FileInputStream file;

	// create function to access sheet data
	public static String testData(int rowCount, int colNumber) throws Exception {
		InputStream ip = new FileInputStream(TESTDATA_SHEET_PATH);
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet = wb.getSheetAt(0);
		String shadiurl = sheet.getRow(rowCount).getCell(colNumber).getStringCellValue();
		System.out.println(shadiurl);
		return shadiurl;
	}

}
