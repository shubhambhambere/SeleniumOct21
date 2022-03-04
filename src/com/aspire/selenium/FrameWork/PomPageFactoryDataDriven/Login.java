package com.aspire.selenium.FrameWork.PomPageFactoryDataDriven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {

	@FindBy (xpath="//input[@id='userid']") private WebElement UN;
    @FindBy(xpath="//input[@id='password']")private  WebElement Pas;
    @FindBy(xpath="//button[@type='submit']") private WebElement LoginBtn;
    
    public Login(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	//Username
    @Test
	public void Username(String UNname)
	{
		UN.sendKeys(UNname);
		
	}
		//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");	

	//Password
    @Test
	public void Password(String PasName)
	{
		Pas.sendKeys(PasName);
	}
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
	//login button
    @Test
	public void LoginButton ()
	{
		LoginBtn.click();
	}
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
