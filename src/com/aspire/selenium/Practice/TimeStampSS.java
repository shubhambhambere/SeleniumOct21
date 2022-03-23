package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStampSS
{
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ibm.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Date d=new Date();
	String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
	System.out.println(TimeStamp);
	   
	
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Dest=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\"+TimeStamp+".jpg");
	FileHandler.copy(source, Dest);
     
}
	
}
