package com.qa.mtpe.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;






public class BaseClass 
{
	
	
	public static WebDriver driver;
	public static Properties Prop;
	
	
	public BaseClass() throws IOException     
	{
		try 
		{
			
		Prop = new Properties();
		FileInputStream io = new FileInputStream ("C:\\Users\\muzammil.riaz\\eclipse-workspace\\MultipleTabs_ParallelExecutuion\\src\\main\\java\\com\\qa\\mtpe\\TestProperties\\config.properties" );
		Prop.load(io);	
		}
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch (IOException e2)
		{
			
			e2.printStackTrace();
		}
	}
	public static void initialization () throws IOException  // initialization of browser
	{
		String browsername = Prop.getProperty("browser");
		if (browsername.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\muzammil.riaz\\Desktop\\exe files\\chrome new version\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if (browsername.contentEquals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\muzammil.riaz\\Desktop\\exe files\\chrome new version\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
	
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(com.qa.mtpe.TestUtil.UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.qa.mtpe.TestUtil.UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		//driver.get(Prop.getProperty("url"));
	
	}	

}


