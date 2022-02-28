package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelToHtml
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	
	FileInputStream file = new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
	String name = wbf.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
	Thread.sleep(2000);
	String surname = wbf.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(surname);
     Thread.sleep(2000);
//       double mob = wbf.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
//	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys();
     Thread.sleep(2000);   
     String password=wbf.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
     driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(password);
    
      WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
     Select s1 = new Select(daylist);
     s1.selectByValue("23");
     List<WebElement> allday = s1.getOptions();
     for(WebElement day:allday)
     {
    	System.out.println(day.getText());
     }
          
     WebElement allmonth = driver.findElement(By.xpath("//select[@id='month']"));
    Select s2=new Select(allmonth);
    s2.selectByVisibleText("Jan");
//    s2.deselectByIndex(0);
    
    List<WebElement> monthlist = s2.getOptions();
//    for(WebElement month:monthlist)
//    {
//    	System.out.println(month.getText());
//    	
//    }
//  System.out.println(s2.getFirstSelectedOption().getText());
      
       TreeSet tr=new TreeSet();
    for(WebElement m1:monthlist)
    {
    	tr.add(m1.getText());
    }

    for(Object trm:tr)
    {
    	System.out.println(trm);
    }
    driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
    

    Thread.sleep(2000);
    driver.quit();
    
}
}
