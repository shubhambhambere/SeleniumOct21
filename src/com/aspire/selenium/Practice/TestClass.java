package com.aspire.selenium.Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass 
{

	//@Test--->@Before MEthod---->@BeforeClass---->@BeforeTest---->BeforeGroup------BeforeSuit
	//@Test--->@After MEthod---->@AfterClass---->@AfterTest---->AfterGroup------AfterSuit
	
    @Test
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void m2()
	{
		Reporter.log("M2",true);
	}
	@AfterClass
	public void Password()
	{
		Reporter.log("Password",true);
	}
	@BeforeClass
	public void Pin()
	{
		Reporter.log("Pin",true);
	}
	@BeforeTest
	public void Initial()
	{
		Reporter.log("Initial",true);
	}
	   @BeforeTest
	public void Profile()
	{
		Reporter.log("Profile",true);
	}
	
	
	
}
