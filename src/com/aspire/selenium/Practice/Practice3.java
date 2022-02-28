package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice3
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	  Thread.sleep(2000);
	 WebElement toollist = driver.findElement(By.xpath("//select[@id='selenium_suite']"));
	Select s=new Select(toollist); 
	 s.selectByValue("RC");
	 Thread.sleep(2000);
	 s.selectByIndex(1);
	 Thread.sleep(2000);
	 s.selectByVisibleText("Limitations");
	 Thread.sleep(2000);
	 List<WebElement> lists = s.getOptions();
	 for(WebElement list:lists)
	 {
		 System.out.println(list.getText());
	 }
	 s.deselectByIndex(1);
	 System.out.println("******All Selected Option********");
	 List<WebElement> selectlist = s.getAllSelectedOptions();
	 
	 for(WebElement selcted:selectlist)
	 {
		 System.out.println(selcted.getText());
	 }

	 
	 
	 
	 
	 
	 
}

}
