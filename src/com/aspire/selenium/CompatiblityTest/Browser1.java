package com.aspire.selenium.CompatiblityTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Browser1
{
    WebDriver driver;
	@Test
	public void EdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
}
/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  <test  name="Test1">
    <classes>
      <class name="com.aspire.selenium.CompatiblityTest.Browser1"/>
    </classes>
    
  </test> 
    <test  name="Test2">
    <classes>
      <class name="com.aspire.selenium.CompatiblityTest.Browser2"/>
    </classes>  
  </test>
  
    <test  name="Test3">
    <classes>
      <class name="com.aspire.selenium.CompatiblityTest.Browser3"/>
    </classes>
    
  </test> 
</suite> <!-- Suite -->


*/