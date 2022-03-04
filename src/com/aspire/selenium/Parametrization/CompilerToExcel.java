package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompilerToExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	String []a= {"Aspire","Training","Institute","Pune"};
	FileInputStream file = new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
	wbf.getSheet("Sheet2").createRow(1).createCell(1).setCellValue("Shbham Ayesha");
	FileOutputStream Fileop = new FileOutputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");

	for(int i=0;i<a.length;i++)
	{
		wbf.getSheet("Sheet2").createRow(i+2).createCell(1).setCellValue(a[i]);
		
	}
	
	wbf.write(Fileop);	
	
}
}
