package com.aspire.selenium.CompatiblityTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser3 
{
    WebDriver driver;
	
	@Test
	public void FireFoxDriver()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}
	
}
