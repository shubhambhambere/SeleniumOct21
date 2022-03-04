package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompilerToExcel1 

{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String []a= {"SHUBHAM","PARSHURAM","BHAMBERE"};		
		FileInputStream file=new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		FileOutputStream Dest=new FileOutputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");
		for(int i=0;i<a.length;i++)
		{
		wbf.getSheet("Sheet3").createRow(i).createCell(0).setCellValue(a[i]);
		}
		
		wbf.write(Dest);
		
		
	}

		

}
