package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe"); 
    WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
	Thread.sleep(2000);
	//Row Text
	List<WebElement> items = driver.findElements(By.xpath("//table[contains(@class,'wikitable so')]//th"));
	System.out.println(items.size());
	for(WebElement item:items)
	{
		System.out.println(item.getText());
	}
	
	//Cell 
	System.out.println(driver.findElement(By.xpath("//span[text()='51,500,352']")).getText());
	
}
}
