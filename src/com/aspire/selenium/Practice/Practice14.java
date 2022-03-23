package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice14 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	 
	driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[3]")).click();
	Thread.sleep(2000);
	WebElement elctronic = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(elctronic).perform();
	
	
}
	
	
}
