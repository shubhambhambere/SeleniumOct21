package com.aspire.selenium.CompatiblityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser2 
{
	
	
	WebDriver driver;
	
	@Test
	public void ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	

}
