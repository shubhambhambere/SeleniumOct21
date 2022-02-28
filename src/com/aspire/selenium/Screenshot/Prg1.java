package com.aspire.selenium.Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//take screenshot and save as tempt file in random folder
public class Prg1
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
		
	}

}
