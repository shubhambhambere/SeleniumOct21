package com.aspire.selenium.ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHouer
{

	public static void main(String[] shubham) throws InterruptedException 
	{
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(2000);
		    driver.get("https://demo.guru99.com/test/newtours/");
		   driver.manage().window().maximize();
 // mouse hour for single element 
		  WebElement singlecell = driver.findElement(By.xpath("//tr[@class='mouseOut'][1]/td[1]"));
		
	        Actions act = new Actions(driver);
	        act.moveToElement(singlecell).perform();
	        Thread.sleep(2000);
	        
//Mouse Hour For Multielements
	        List<WebElement> Allcell = driver.findElements(By.xpath("//tr[@class='mouseOut']/td[1]"));
//	        Actions act=new Actions(driver);
	        for(WebElement cell:Allcell)
	        {
	        	act.moveToElement(cell).perform();
	        	Thread.sleep(2000);
	        }
	        
	        
	        driver.quit();
		
	}
	
}
