package com.aspire.selenium.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
	WebDriver	driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	Thread.sleep(2000);	
//	act.clickAndHold(source).perform();
//	Thread.sleep(2000);
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement dest=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	Actions  act=new Actions(driver);
//	act.release(dest).perform();
//	Thread.sleep(2000);
    act.dragAndDrop(source, dest).perform();
 	Thread.sleep(2000);
	
	
	driver.quit();
	
	
		
	}

}