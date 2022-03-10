package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
@FindBy(xpath="//input[@id='userid']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement Password;
@FindBy (xpath="//button[@type='submit']")private WebElement loginbtn;

public Login (WebDriver Driver)
{
	PageFactory.initElements(Driver, this);
}

public void UserName(String UNValue)
{
	UN.sendKeys(UNValue);
}
public void Password(String PasswordValue)
{
	Password.sendKeys(PasswordValue);
}
	
public void Loginbtn()
{
	loginbtn.click();
}
	
}
