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
	
	
	
	public MainPageClass() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}

	
	public String gettitle()
	{
		
	String Title =	Selenium_Title.getText();
	return Title;
	}
}
