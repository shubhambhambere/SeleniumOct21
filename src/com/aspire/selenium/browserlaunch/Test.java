package com.aspire.selenium.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("https://www.flipkart.com/");
	         Thread.sleep(2000);
	         driver.navigate().to("https://www.amazon.in/");
	         Thread.sleep(2000);
	         driver.navigate().back();
	         Thread.sleep(1000);
	         driver.navigate().to("https://www.facebook.com/");
	         Thread.sleep(2000);
	         driver.navigate().refresh();
	         driver.close();
	         
	         
	}

}
