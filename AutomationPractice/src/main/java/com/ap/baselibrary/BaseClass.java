package com.ap.baselibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public static String appURL;

	public BaseClass() {
		try{ 
			FileInputStream configProperties = new FileInputStream("./config.properties"); 
			prop = new Properties();
			prop.load(configProperties); 
		} 
		catch (FileNotFoundException e){
			e.printStackTrace(); 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		}
		
	}
	
	public static void launchBrowser() {
		if(prop.getProperty("browser").equals("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
