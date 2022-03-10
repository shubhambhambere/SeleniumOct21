package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard 
{
	
	@FindBy(xpath="(//a[@href='/profile'])[2]") WebElement Profile;
	
	public DashBoard(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	public void ProfileClick()
	{
		Profile.click();
	}

}
