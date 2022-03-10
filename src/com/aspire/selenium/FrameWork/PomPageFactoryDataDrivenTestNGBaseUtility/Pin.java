package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pin{

	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement continuebtn;
	
	public Pin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//enter pin						
	public void enterpin(String pinValue)	//local variable can be with same or different name
	{
		pin.sendKeys(pinValue);
	}
			//driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");

//Continue button
	public void clickcntbtn()
	{
		continuebtn.click();
	}
}