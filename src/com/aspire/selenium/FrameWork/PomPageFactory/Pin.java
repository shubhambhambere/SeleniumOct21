package com.aspire.selenium.FrameWork.PomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin {

	@FindBy (xpath="//input[@id='pin']") WebElement pin;
	@FindBy(xpath="//button[@type='submit']") WebElement ContButton;
	
	public Pin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	//pin
	public void Pin()
	{
	    pin.sendKeys("976976");	
	}
		//driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
		//Continue button
	public void ContinueButton()
	{
		ContButton.click();
	}
	
	//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
