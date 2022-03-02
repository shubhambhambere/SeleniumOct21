package com.aspire.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice15
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");
		driver.manage().window().maximize();
		WebElement seeleniumdn = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(seeleniumdn);
		Thread.sleep(2000);
		for(int i=1;i<9;i++) 
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		}
		act.doubleClick().perform();
		
	}
	

}
