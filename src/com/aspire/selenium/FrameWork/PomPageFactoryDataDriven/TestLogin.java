package com.aspire.selenium.FrameWork.PomPageFactoryDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Excelpath = "D:\\Java project\\OCT 21\\SeleniumOct21\\File\\ProjectData.xlsx";
		FileInputStream file = new FileInputStream(Excelpath);
		Workbook wbf = WorkbookFactory.create(file);
		String UNname = wbf.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
		String PasName = wbf.getSheet("Sheet1").getRow(9).getCell(2).getStringCellValue();
		String PinValue = wbf.getSheet("Sheet1").getRow(9).getCell(3).getStringCellValue();
		boolean logoexp = wbf.getSheet("Sheet1").getRow(9).getCell(4).getBooleanCellValue();
		String inintialexpaname = wbf.getSheet("Sheet1").getRow(9).getCell(5).getStringCellValue();
		String link = wbf.getSheet("Sheet1").getRow(9).getCell(6).getStringCellValue(); 
		driver.get(link); 
	 
    //  String UNname="DP6852";
//		String PasName="Pramod@2105";
//		String PinValue="976976";
//		boolean logoexp=true;
//		String inintialexpaname="PM";
		
		Login lp=new Login(driver);
		lp.Username(UNname);
		lp.Password(PasName);
		lp.LoginButton();
		Thread.sleep(4000);
		
		Pin pp=new Pin(driver);
		pp.PinEnter(PinValue);
		Thread.sleep(2000);
		pp.Continuebtn();
		Thread.sleep(3000);
		
		Home hp=new Home(driver);
		hp.logoVerify(logoexp);
		hp.initial(inintialexpaname);
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
