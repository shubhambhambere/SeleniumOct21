package com.aspire.selenium.Practice;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice16 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	Dimension winsize = driver.manage().window().getSize();
	System.out.println(winsize);
	Dimension d=new Dimension(1000,800);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	System.out.println(driver.manage().window().getSize());
	Point p=new Point(400,500);
    System.out.println(driver.manage().window().getPosition());
	
	
	
	}
}
