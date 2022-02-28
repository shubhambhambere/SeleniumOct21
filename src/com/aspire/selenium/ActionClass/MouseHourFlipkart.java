package com.aspire.selenium.ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHourFlipkart 
{
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	List<WebElement> allmodule = driver.findElements(By.xpath("//div[@class='_37M3Pb']//div[@class='xtXmba']"));
	Actions act=new Actions(driver);
	for(WebElement Module:allmodule)
	{
	  act.moveToElement(Module).perform();	
	  Thread.sleep(2000);
	}
	
	driver.quit();
}
}
