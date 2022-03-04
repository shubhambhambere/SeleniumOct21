package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		FileInputStream File = new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\ProjectData.xlsx");
		Workbook wbf = WorkbookFactory.create(File);
		String UNname = wbf.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
	    String Pass = wbf.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
		String PINValue = wbf.getSheet("Sheet1").getRow(9).getCell(2).getStringCellValue();
	     boolean LOGOValue = wbf.getSheet("Sheet1").getRow(9).getCell(3).getBooleanCellValue();
		String InitialValue = wbf.getSheet("Sheet1").getRow(9).getCell(4).getStringCellValue();
		
		Login lp=new Login(driver);
		lp.UserName(UNname);
		lp.Password(Pass);
		lp.LoginButton();
		
		Pin pp=new Pin(driver);
		pp.PIN(PINValue);
		pp.ContinuBtn();
		
		Home hp=new Home(driver);
		hp.logo(LOGOValue);
		hp.Initials(InitialValue);
		
		
		
		
		
		
}

}
