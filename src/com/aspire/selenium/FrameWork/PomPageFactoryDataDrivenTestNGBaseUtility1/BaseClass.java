package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility.Utility;

public class BaseClass 
{
	WebDriver driver;
	
public void BrowserOpen() throws IOException
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\SoftFiles\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	driver.get(Utillity1.GeturlpropertyFile("url"));
	
}
	
}
