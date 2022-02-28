package com.aspire.selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook 
{	WebDriver driver;
    @Test
    public void BrowserLaunch()
    {
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
    }
    @Test
    public void WebSiteLaunch() throws InterruptedException
    {
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    }
    @Test
    public void ragistration() throws InterruptedException
    {
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    Thread.sleep(2000);
    }
    @Test
    public void UNname() throws InterruptedException
    {
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shubham");
    Thread.sleep(2000);
    }
    @Test
    public void USurname() throws InterruptedException
    {
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhambere");
    Thread.sleep(2000);
    }
    @Test
    public void MobNo() throws InterruptedException
    {
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8452081990");
    Thread.sleep(2000);
    }
    @Test
    public void Password() throws InterruptedException
    {
    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shubha@1223");
    Thread.sleep(2000);
    }
    @Test
    public void Gender() throws InterruptedException
    {
    driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
    Thread.sleep(2000);
    }
    @Test
    public void SignIn() throws InterruptedException
    {
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    Thread.sleep(2000);
    }
    @Test
    public void BrowserClose() throws InterruptedException
    {
    Thread.sleep(2000);
    driver.quit();
    }
    
	
	
}
