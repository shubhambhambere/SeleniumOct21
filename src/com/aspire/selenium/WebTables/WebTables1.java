package com.aspire.selenium.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables1 
{
 public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe"); 
    WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	Thread.sleep(2000);
	//cell
	String CellText = driver.findElement(By.xpath("//td[text()='A Time to Kill']")).getText();
	System.out.println(CellText);
	
	 String cellText = driver.findElement(By.xpath("//td[contains(text(),'Fantasti')]")).getText();
	System.out.println(cellText);
	
	
	//Row
	List<WebElement> HeaderList = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//th"));
	System.out.println("No Of Column="+HeaderList.size());	
	for(WebElement name:HeaderList)
	{
		System.out.print(name.getText()+"             ");
		
	}
	System.out.println();
	List<WebElement> firstRowele = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]/td"));
	for (WebElement FirRow:firstRowele)
	{
		System.out.print(FirRow.getText()+"           ");
	}
	
	driver.quit();
	//Column
	
	
	//Header+Body
	
  
  
}
}
