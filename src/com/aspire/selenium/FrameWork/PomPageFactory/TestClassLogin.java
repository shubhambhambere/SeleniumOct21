package com.aspire.selenium.FrameWork.PomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Login lp=new Login (driver);
		lp.Username();
		lp.Password();
		lp.LoginButton();
		Thread.sleep(2000);
		
		Pin pp=new Pin(driver);
		pp.Pin();
		pp.ContinueButton();
		Thread.sleep(2000);
		
		HomePage hp=new HomePage(driver);
		hp.logoVerify();
		hp.Initials();
		
		Thread.sleep(5000);
	    driver.quit();	
	
	
	}
}
