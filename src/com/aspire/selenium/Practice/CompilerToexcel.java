package com.aspire.selenium.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompilerToexcel
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream File=new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test2.xlsx");
	Workbook wbf = WorkbookFactory.create(File);
	String s[]= {"Shubham","Parshuram","Bhambere"};
	for(int i=0;i<s.length;i++)
	{
		wbf.getSheet("Sheet1").createRow(i).createCell(2).setCellValue(s[i]);
	}
	
	FileOutputStream Fileop = new FileOutputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test2.xlsx");
	wbf.write(Fileop);
	
}
}
