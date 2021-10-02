package com.gtn.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.gtn.qa.TestBase.TestBase;

public class Util extends TestBase
{
	public static int page_Load_Timeout=60;
	public static int implicitly_Wait=70;
	public static int socks_port=9999;
	public static String socks_url="localhost";
	public static Workbook book;
	public static Sheet sheet;
	public static String TESTDATA_SHEET_PATH="C:\\Users\\ramasegowda\\workspace2Parallel\\GTN_TMO_Automation\\"
			+ "src\\main\\java\\com\\gtn\\qa\\testData\\GTN-10851_RPA_Successful_Cases.xlsx";
	
	
	public static void frameSwitching(String framename)	{
		driver.switchTo().frame(framename);
	}
	
	public static void switchBackToMainWindowfromFrame()	{
		driver.switchTo().defaultContent();
	}
	
	public static void alertSwitchingAccept()	{
		driver.switchTo().alert().accept();

	}
	
	public static void alertSwitchingDismiss()	{
		driver.switchTo().alert().dismiss();

	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File scrFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\ramasegowda\\workspace2Parallel\\GTN_TMO_Automation\\test" + System.currentTimeMillis() + ".png"));
	}
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException 
	{
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
}
