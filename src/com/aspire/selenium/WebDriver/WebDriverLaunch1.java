package com.aspire.selenium.WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.flipkart.com/");
     	Thread.sleep(2000);
	    System.out.println(driver.getTitle());

    	Thread.sleep(2000);
	    driver.manage().window().getSize();
    	System.out.println(	driver.manage().window().getSize());
	    Dimension d = new Dimension(400,500);                    //set size to window
     	driver.manage().window().setSize(d);
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());          //get size of window on console
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
         Dimension d1 = new Dimension(700,800);
	     driver.manage().window().setSize(d1);
	     Thread.sleep(2000);
	     System.out.println(driver.manage().window().getSize());
	     Thread.sleep(2000);
	     
	 Point p = new  Point(200,500);
	     driver.manage().window().setPosition(p);
	     Thread.sleep(2000);
	     System.out.println(driver.manage().window().getPosition());
	     Thread.sleep(2000);
	     Point p1 = new Point(800,800);
	     driver.manage().window().setPosition(p1);
	     Thread.sleep(2000);
	     System.out.println(driver.manage().window().getPosition());
	     driver.close();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     //
	     
	
		
		
	}
	
	
}
