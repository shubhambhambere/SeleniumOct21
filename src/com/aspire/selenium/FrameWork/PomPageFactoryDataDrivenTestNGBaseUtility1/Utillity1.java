package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utillity1
{
	private static final String TakesScreenShot = null;

	
	static Workbook wbf;
	public static String Testdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException 
	{
	   FileInputStream   file = new FileInputStream(System.getProperty("user.dir")+"\\File\\Project.xlsx");
		 wbf = WorkbookFactory.create(file);
		String testvalue1 = wbf.getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
		return testvalue1;
	}
	
	public static boolean Testdata1(int rowindex,int cellindex)
	{
		
		boolean testValue1 = wbf.getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getBooleanCellValue();
		return testValue1;	
	}
	
	public static  void screenShot(WebDriver driver)throws IOException
	{
		Date d=new Date();
		String timestamp = d.toString().replace(":","_").replace(" ","_");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\"+timestamp+".jpg");
		FileHandler.copy(src, dest);	
	}
	
	public static String GeturlpropertyFile(String key) throws IOException
	{
	  Properties proObj=new Properties();
	  FileInputStream fileObj=new FileInputStream(System.getProperty("user.dir")+ "\\Prop.properties");
	  proObj.load(fileObj);
	  String value = proObj.getProperty(key);
	  return value;
		
	}
	
	

	
}
