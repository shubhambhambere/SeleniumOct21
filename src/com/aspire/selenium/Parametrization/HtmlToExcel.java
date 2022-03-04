package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlToExcel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");
		FileInputStream file=new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\ProjectData.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		FileOutputStream dest=new FileOutputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\ProjectData.xlsx");
		
	     String text = driver.findElement(By.xpath("//span[text()='Men']")).getText();
		
		wbf.getSheet("Sheet2").createRow(0).createCell(0).setCellValue(text);
		wbf.write(dest);
		
		
	}
	
}
