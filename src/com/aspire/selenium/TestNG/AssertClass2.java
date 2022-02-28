package com.aspire.selenium.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass2 
{
	String act="Shubham";
	String exp="Shubham";
	String newact="Soham";
	String c=null;
	boolean d=true;
	boolean e=false;
//    @Test
//	public void Hard_Assert()
//	{   Assert.assertEquals(act, exp);	
//		Assert.assertNotEquals(act, exp,"Plz enter Corrret Value");
//        Assert.assertNull(c);
//        Assert.assertNotNull(act);
//        Assert.assertTrue(d);
//        Assert.assertFalse(e);
//    //  Assert.fail();		
//	}
    
    @Test
	public void Soft_Assert()
	{
    	SoftAssert soft=new SoftAssert();
    	soft.assertEquals(act, exp);
    	soft.assertNotEquals(act, exp);
    	soft.assertNull(c);
    	soft.assertNotNull(act);
    	soft.assertTrue(d);
    	soft.assertFalse(e);
    //	soft.fail();
    	
	}

}
