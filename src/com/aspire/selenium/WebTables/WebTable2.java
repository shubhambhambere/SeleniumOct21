package com.aspire.selenium.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 
{
	 public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe"); 
		    WebDriver	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
			Thread.sleep(2000);
			//Column
			List<WebElement> Columnele = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]"));
			System.out.println("No Of ROWS="+Columnele.size());
			for(WebElement ele:Columnele)
			{
				System.out.println(ele.getText());
			}
			
			System.out.println("*******Elements From 2nd Column***********");
			
			List<WebElement> columnele = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[2]"));
			
			for(WebElement Ele:columnele)
			{
				System.out.println(Ele.getText());
			}
			
			//Header+Body
			List<WebElement> Headerele = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/th"));
			System.out.println("*******Header Elements********");
			for(WebElement ele:Headerele)
			{ 
			System.out.print(ele.getText()+"                ");	
			}
			System.out.println();
			
			
			
			int RowCount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]")).size();
			 int Colmunt = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]/td")).size();
			for(int i=1;i<=RowCount;i++)
			{
			
				for(int j=1;j<=Colmunt;j++)
				{
					String bodyele = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+(i+1)+"]/td["+j+"]")).getText();
					  
					 System.out.print(bodyele+"                     ");
				}  
				System.out.println();
				
			}
			
			
			
			
			driver.quit();
	 }
	
}
