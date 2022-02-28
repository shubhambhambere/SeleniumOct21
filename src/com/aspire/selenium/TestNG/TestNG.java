package com.aspire.selenium.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG 
{
   @Test
	public void m1()
	{
	System.out.println("Hi");
	Reporter.log("Hii", true);
	}
   
   @Test
   public void m2()
   {
	   System.out.println("Shubham");
	   Reporter.log("Shubham",true);
   }
   
   
}
