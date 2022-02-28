package com.aspire.selenium.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//take screenshot and save in destination folder by user defined name
public class prg2 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		float a=1.25f;   //its type cast example
//		int b=(int) a;   //its type cast example Here we transfer the data from higher data type to lower data type  
	          TakesScreenshot ts = (TakesScreenshot)driver;    
	          File source = ts.getScreenshotAs(OutputType.FILE);   
	         	 File Destination=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\Flipkart.jpg");
	             FileHandler.copy(source,Destination);
	         	 System.out.println(Destination);
	          
	          
	          
		
	}

}
