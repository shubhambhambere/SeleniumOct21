package com.aspire.selenium.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Otherpopup 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	driver.manage().window().maximize();
// Alert
	driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
// confirm box
	
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Alert alt2 = driver.switchTo().alert();
	System.out.println(alt2.getText());
	alt2.accept();
//	alt2.dismiss();
	
//  prompt Box
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	Alert alt3 = driver.switchTo().alert();
	System.out.println(alt3.getText());
	alt3.sendKeys("Shubham Ayesha");
	alt3.accept();
//	alt3.dismiss();
	
	
	
	
	
	
	
}
	
	
}
