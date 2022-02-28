package com.aspire.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookRagistration {
public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shubham");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhambere");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8452081990");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shubha@1223");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(2000);
        driver.quit();
        
        
        
        
        
        
}
}
