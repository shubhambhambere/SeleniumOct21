package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{

public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement electronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
	Actions act=new Actions(driver);
	act.moveToElement(electronic).perform();
     List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'xtXm')]//div[@class='_3XS_gI _7qr1OC']/a[2]"));
	for(WebElement each:list)
	{
		System.out.println(each.getText());
		
	}
	
	
}	
}
