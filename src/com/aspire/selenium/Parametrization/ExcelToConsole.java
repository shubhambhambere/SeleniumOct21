package com.aspire.selenium.Parametrization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelToConsole 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException  {

	    
	  FileInputStream file = new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");
	  Workbook wbf = WorkbookFactory.create(file);
	  String password = wbf.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	  System.out.println(password);
	  String city = wbf.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
	  System.out.println(city);     
	 //last row index no  
	  int lastindexno = wbf.getSheet("Sheet1").getLastRowNum();
	  System.out.println("Last row index no="+lastindexno);
	//last cell No of row First 
	  short lastcellr1 = wbf.getSheet("Sheet1").getRow(0).getLastCellNum();
	  System.out.println("Row 1 Having last cell no= "+lastcellr1);
	 //last cell no of row Second
	 short lastcellr2 = wbf.getSheet("Sheet1").getRow(1).getLastCellNum();
	  System.out.println("Row 2 Having last cell No="+lastcellr2);
	
}
}
