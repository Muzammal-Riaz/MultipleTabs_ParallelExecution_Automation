package com.qa.mtpe.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mtpe.TestBase.BaseClass;

public class SecondaryPageClass extends BaseClass
{

	@FindBy (xpath = "//h1[contains(text(),'Downloads')]")
	WebElement Download_title;
	
	@FindBy (xpath = "//h2[contains(text(),'Selenium Server (Grid)')]")
	WebElement Selenium_Server_Grid;
	
	public SecondaryPageClass() throws IOException 
	{
		PageFactory.initElements(driver, this);
	
	}

	
	public String gettitle_download()
	{
		String Text_one = Download_title.getText();
		return Text_one;
	}
	
	public String gettitle_grid()
	{
		String Text_Two = Selenium_Server_Grid.getText();
		return Text_Two;
		
	}
}
