package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("(//ul[contains(@class,'a-unordered-list a-nostyle a-horizo')])[1]"));
		File Source = logo.getScreenshotAs(OutputType.FILE);
		
		 File Dest = new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\Sachin.jpg");
		 FileHandler.copy(Source, Dest);
		 
		
		
	}
}
