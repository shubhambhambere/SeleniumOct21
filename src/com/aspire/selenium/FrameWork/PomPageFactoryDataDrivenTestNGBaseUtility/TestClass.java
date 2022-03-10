package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

		
	public class TestClass extends Base
	{
	
	Workbook wbf;
	Login lp;
	Pin pp;
	Home hp;
	int abs;
	
	@BeforeTest
	public void browserlaunch() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	    BrowserOpen();
		
		lp= new Login(driver);
		pp = new Pin(driver);
		hp = new Home(driver);
	}
	
	@BeforeClass
	public void loginToApp() throws EncryptedDocumentException, IOException 
	{
		lp.enterUserName(Utility.testdata(10,1));
		lp.enterPassword(Utility.testdata(10, 2));
		lp.clickloginButton();
		
		pp.enterpin(Utility.testdata(10, 3));
		pp.clickcntbtn();
		
	}
	
	@Test
	public void verificationOfLogo()
	{   boolean Exp = Utility.testdata1(10, 4);
	    boolean act = hp.verifylogo();
	    Assert.assertEquals(act, Exp,"Logo verification Test case fail due to logo image not loading");

		
	}
	@Test
	public void verificationOfInitials() throws EncryptedDocumentException, IOException
	{   abs = 5;
	     String Exp = Utility.testdata(10,5);
	    String act = hp.verifyInitialName();
		Assert.assertEquals(act, Exp,"Initial name verification Test case fail beacausse Not Match Initial And Expected");
	    Utility.screenShot(driver, abs);
	    
	}	
	
	@AfterClass
	public void closeBrowser() 
	{
		
		driver.close();
	}
	
		
		
	}
		
		
		



