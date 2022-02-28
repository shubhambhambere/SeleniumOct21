package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice9 
{
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in");	
	    driver.manage().window().maximize();
	    
	    WebElement source=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	    
	   File Sr=source.getScreenshotAs(OutputType.FILE);
	   File dest=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\amazon1.png");
	   FileHandler.copy(Sr, dest);
	   
	    
}
}
