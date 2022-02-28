package com.aspire.selenium.FrameWork.PomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//Username
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");	
	Thread.sleep(2000);
	//Password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
	//login button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//pin
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
	//Continue button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//logo verify
	Thread.sleep(2000);
	boolean logoexp = true;
	boolean logoact = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
	if(logoexp==logoact)
	{
		System.out.println("LogoDisplay Test Case pass");
	}
	else
	{
		System.out.println("LogoDisplay Test case Fail");
	}
	//initials 
	Thread.sleep(2000);
	String Expectinitial = "PM";
	String ActInitial = driver.findElement(By.xpath("//span[text()='PM']")).getText();
	System.out.println(ActInitial);
	if(Expectinitial.equals(ActInitial))
	{
		System.out.println("Initials name is TestCase Pass");
	}
	else
	{
		System.out.println("Initials name is TestCase Fail");
	}
	Thread.sleep(2000);
	driver.quit();
	
	
}
}
