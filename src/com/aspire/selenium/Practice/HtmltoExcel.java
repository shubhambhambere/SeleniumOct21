package com.aspire.selenium.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmltoExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	List<WebElement> Modulelist = driver.findElements(By.xpath("//div[@class='_37M3Pb']//div[@class='xtXmba']"));
	
	for(WebElement list:Modulelist)
	{

		String s=list.getText();
		System.out.println(s);
		
	}
	 
//     FileInputStream File = new FileInputStream("D:\\Java project\\OCT 21\\SeleniumOct21\\File\\Test2.xlsx");
//	 Workbook wbf = WorkbookFactory.create(File);
	 
	 
	
	
	
	
}

}
