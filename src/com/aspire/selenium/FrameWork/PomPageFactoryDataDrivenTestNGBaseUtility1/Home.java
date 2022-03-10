package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home
{

	@FindBy(xpath="//img[@alt='Kite logo']") WebElement actlogo;
	@FindBy(xpath="//span[text()='PM']") WebElement actinitial;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean  verifylogo()
	{
	
	  boolean	Actlogo=actlogo.isDisplayed();
	  return Actlogo;
	  
	  
	}


	public String verifyInitialName()
	{	
		String ActinintialValue = actinitial.getText();
	   return ActinintialValue;	
	}
	
	public void ClickInitial()
	{
		actinitial.click();
		
	}
	
	
}
