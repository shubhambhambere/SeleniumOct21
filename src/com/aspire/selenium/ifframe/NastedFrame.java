package com.aspire.selenium.ifframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NastedFrame
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new	ChromeDriver();
	driver.get("https://demoqa.com/nestedframes");
	driver.manage().window().maximize();
	Thread.sleep(2000);
// Switch to parent IFRAME BY WEB ELEMENT
	WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(parentframe);
	
    String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();	
	System.out.println(parenttext);
// BY INDEX
//	 driver.switchTo().frame(1);
 //    String Parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//	System.out.println(Parenttext);
	
// BY ID & NAME
	
//	driver.switchTo().frame("frame1");
//	System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());

	
// SWITCH TO CHILD
	WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(childframe);
	System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
	

// SWITCH TO CHILD TO PARENT
//	driver.switchTo().parentFrame();
	
// SWITCH TO CHILD TO HOME
//	driver.switchTo().defaultContent();
//	String HOMETEXT = driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]")).getText();
//	System.out.println( HOMETEXT);
	
//	driver.close();

		
	}
	
}
