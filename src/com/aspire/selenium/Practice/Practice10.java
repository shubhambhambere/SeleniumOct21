package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice10
{
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in");	
	    driver.manage().window().maximize();
	    
//	  WebElement Leadyss=driver.findElement(By.xpath("//div[@id='desktop-4']"));
//	  File Source=Leadyss.getScreenshotAs(OutputType.FILE);
//	  File Final=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\amazonleady.png");
//	  FileHandler.copy(Source, Final);
	  
// Take a 3 screenShot of Page  	  
//	 for(int i=0;i<=3;i++)
//	 {
//		 
//	 
//	   TakesScreenshot ts=(TakesScreenshot)driver;     //Here we type Cast the takessreenshot interface With Driver 
//	   File Source=ts.getScreenshotAs(OutputType.FILE);
//	   File Dest=new File(".\\ScreenShot\\Amazonhome"+i+".png");
//	   FileHandler.copy(Source, Dest);
//	 }   
	    
	    
	   //Give Random names To screen shot And take 3 SS
	   for(int i=0;i<=3;i++)
	   {
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File Source=ts.getScreenshotAs(OutputType.FILE);
	   String  RandomName=RandomString.make(3);
	    File Dest =new File(".\\ScreenShot\\"+RandomName+""+i+".png");
	    FileHandler.copy(Source, Dest);
	   }
	    
	    
	    driver.quit();
	    
	
}
}
