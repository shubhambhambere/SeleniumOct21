package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	static String filepath;
	static Workbook wbf;
	static FileInputStream file;
	
	public static String testdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
	    filepath="D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Project.xlsx";
		file = new FileInputStream(filepath);
		wbf = WorkbookFactory.create(file);
		String testvalue=wbf.getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
		return testvalue;
	}
	
	public static boolean testdata1(int rowindex,int cellindex)
	{
		
		boolean testvalue1 = wbf.getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getBooleanCellValue();
		return testvalue1;
		
	}
	
	public static  void screenShot(WebDriver driver,int abs)throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot"+abs+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	

}
