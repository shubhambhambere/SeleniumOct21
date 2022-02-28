package com.aspire.selenium.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPop
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	// UID--->,pass--->, TextGet---->,login
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shubham.bhambere.99@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shubh@99");
    String Popuptext = driver.findElement(By.xpath("//p[@class='_1-pxlW']")).getText();
    System.out.println(Popuptext);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
    
    
	
}
}
