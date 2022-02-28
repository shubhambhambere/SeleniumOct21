package com.aspire.selenium.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass1 
{
	String s="Shubham";
	String a="Shubham";
	String b="Soham";
	String c=null;
	boolean d=true;
	boolean e=false;
	@Test
	public void m1()
	{
		Assert.assertEquals(s, a,"Please provide Same Value");
	}
	@Test
	public void m2()
	{
		Assert.assertNotEquals(s, b,"Please Provide Correct value");
	}
	
	@Test
	public void m3()
	{
		Assert.assertNull(c);
	}
	@Test
	public void m4()
	{
		Assert.assertNotNull(a);
	}
	@Test
	public void m5()
	{
		Assert.assertTrue(d,"Please enter True Value");
	}
	@Test
	public void m6()
	{
	     Assert.assertFalse(e,"Please Enter False Value");	
	}
	@Test
	public void m7()
	{
		Assert.fail("Fail This Test Case intentionally");
	}
	
	
	
	
	

}
