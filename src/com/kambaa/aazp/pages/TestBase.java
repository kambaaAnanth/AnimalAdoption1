package com.kambaa.aazp.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;


	public static Properties loadproperties() throws IOException {
		FileInputStream stream = new FileInputStream("C://Users//kavya//Desktop//TANHODA//ANIMAL ADOPTION//config.properties");
		prop = new Properties();
		prop.load(stream);
		return prop;
	}
	
	    
	        
	@BeforeClass
	public void initialise() throws IOException{		
		loadproperties();
	String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String location = prop.getProperty("driverlocation");		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", location);		
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			System.setProperty("Webdriver.gecko.driver", location);
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.navigate().to(url);		
		}

	@AfterClass
	public void teardown() throws IOException {
			driver.quit();
		
		}
	
	
		
	}



