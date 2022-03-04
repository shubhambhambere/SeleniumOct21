package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTocompiler 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream file=new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
	for(int i=0;i<=5;i++) 
	{
		for(int j=0;j<=4;j++)
		{
			System.out.println(wbf.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue());		
		}		
	}
    }
}
