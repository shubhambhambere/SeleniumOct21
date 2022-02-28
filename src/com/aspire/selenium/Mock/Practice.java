package com.aspire.selenium.Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
    Thread.sleep(2000);
   WebElement checkboxes = driver.findElement(By.xpath("//div[@class='row']//input"));
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.xpath("//label[text()='Programming Languages']")).getText());
        
    
    
}
}
