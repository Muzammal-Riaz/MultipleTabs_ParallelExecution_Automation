package com.qa.mtpe.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mtpe.TestBase.BaseClass;

public class MainPageClass extends BaseClass
{

	
	@FindBy (xpath = "//img[@class='logo logo-large']")
	WebElement Selenium_Title;
	
	@FindBy (xpath = "//h2[contains(text(),'Getting Started')]")
	WebElement Getting_Started;
	
	
	
	public MainPageClass() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}

	
	public String gettitle()
	{
		
	String Title =	Selenium_Title.getText();
	return Title;
	}
	
	public String gettitle2()
	{
		String Title1 = Getting_Started.getText();
		return Title1;
	}
}
