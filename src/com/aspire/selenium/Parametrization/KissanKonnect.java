package com.aspire.selenium.Parametrization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KissanKonnect 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.kisankonnect.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@class='ng-input'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='ng-option ng-star-inserted'])[1]")).click();
	driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]")).click();

	WebElement shoplist = driver.findElement(By.xpath("(//a[text()='Shop'])[1]"));
	
	Actions act=new Actions(driver);
	act.moveToElement(shoplist).perform();

//    List<WebElement>  shoplist1 = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
//	for(WebElement shop:shoplist1)
//	{
//		System.out.println(shop.getText());
//	}
//	
	
	
	
	
	Thread.sleep(2000);
	driver.quit();	
}
}
