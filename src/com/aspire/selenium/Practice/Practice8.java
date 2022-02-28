package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice8
{
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
    Thread.sleep(2000);
    driver.get("https://www.amazon.in");	
    driver.manage().window().maximize();
	
    TakesScreenshot ts=(TakesScreenshot)driver;
    File Source=ts.getScreenshotAs(OutputType.FILE);
     
    File target =new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\Aamzon.png");
    FileHandler.copy(Source,target);
    driver.quit();
    
    
    
    
    
    
    
}
}
