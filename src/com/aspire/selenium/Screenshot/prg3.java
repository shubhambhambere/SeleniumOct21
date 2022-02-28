package com.aspire.selenium.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//take diff screen shot with diff name and save in destination folder
public class prg3 {

	public static void main(String[] args) throws IOException {
		
		for(int i=0;i<=10;i++)
		{
			

		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	  WebDriver   driver	=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	  
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	  
	   File destination = new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\Amazon"+i+".jpg");
	    FileHandler.copy(source,destination);
	    driver.close();
		}	  
	}
}
