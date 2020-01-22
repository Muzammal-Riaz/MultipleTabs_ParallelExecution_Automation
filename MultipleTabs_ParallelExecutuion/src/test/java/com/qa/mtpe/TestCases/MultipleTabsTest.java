package com.qa.mtpe.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mtpe.TestBase.BaseClass;
import com.qa.mtpe.TestPages.MainPageClass;
import com.qa.mtpe.TestPages.SecondaryPageClass;
import com.qa.mtpe.Testdata.HashMapsforURL;

public class MultipleTabsTest extends BaseClass
{

	MainPageClass MainPage;
	SecondaryPageClass SecondaryPage;
	
	public MultipleTabsTest() throws IOException
	{
		super();
		
	}
	
	
	@BeforeMethod 
	public void setup() throws IOException
	{
		initialization();
		MainPage = new MainPageClass();
		SecondaryPage = new SecondaryPageClass();
	}
	
	@Test
	public void First_Test()
	{
		String url1 = HashMapsforURL.geturls().get("seleniumpage");
		driver.get(url1);
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		String newWindow = driver.getWindowHandle();
		
		String url2 = HashMapsforURL.geturls().get("downloadpage");
		driver.get(url2);
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		
		String title_Second = SecondaryPage.gettitle_download();
		System.out.println("The title of second page is: " + title_Second);
		Assert.assertEquals("Downloads", title_Second);
	
		
		driver.switchTo().window(newWindow);
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		
		String title_First = MainPage.gettitle();
		System.out.println("The title of first page is: " + title_First);
		Assert.assertEquals("", title_First);
		System.out.println(Thread.currentThread().getId());
		
		
	}
	
	
	
	@Test
	public void ParallelExecutionTest()
	{
		String url1 = HashMapsforURL.geturls().get("seleniumpage");
		driver.get(url1);
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		String newWindow = driver.getWindowHandle();
		
		String url2 = HashMapsforURL.geturls().get("downloadpage");
		driver.get(url2);
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		
		String title_Second = SecondaryPage.gettitle_grid();
		System.out.println("The title of second page is: " + title_Second);
	//	Assert.assertEquals("Selenium Server (Grid)", title_Second);
	
		
		driver.switchTo().window(newWindow);
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		
	//	String title_First = MainPage.gettitle2();
	//	System.out.println("The title of first page is: " + title_First);
	//	Assert.assertEquals("", title_First);
		System.out.println(Thread.currentThread().getId());
	}
	
/*	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	
	}
	
*/
}
