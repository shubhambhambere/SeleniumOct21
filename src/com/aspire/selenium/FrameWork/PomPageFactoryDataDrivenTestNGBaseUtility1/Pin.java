package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin 
{
	@FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement CntnBtn;


	public Pin (WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}

	public void Pin(String PinValue)
	{
		Pin.sendKeys(PinValue);
	}
	public void ContinueBtn()
	{
		CntnBtn.click();
	}
		
	
		
}
