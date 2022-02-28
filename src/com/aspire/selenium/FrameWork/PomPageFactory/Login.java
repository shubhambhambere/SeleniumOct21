package com.aspire.selenium.FrameWork.PomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (xpath="//input[@id='userid']") WebElement UN;
	@FindBy (xpath="//input[@id='password']") WebElement pas;
	@FindBy (xpath="//button[@type='submit']") WebElement LoginButton;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
		
	//Username
	public void Username()
	{
		UN.sendKeys("DP6852");
	}
	// driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");	

	//Password
	public void Password()
	{
		pas.sendKeys("Pramod@2105");
	}
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
	//login button
	public void LoginButton()
	{
		LoginButton.click();
	}

	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}
