package com.ap.reuselibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import com.ap.baselibrary.BaseClass;

public class ScreenShot extends BaseClass {
	private static JavascriptExecutor js;
	
	public static void getPageScreenShot(String pageName) {
		
		int windowHeight = driver.manage().window().getSize().getHeight();
		js = (JavascriptExecutor)driver;
		int scrollHeight = (int)js.executeScript("return document.documentElement.scrollHeight");
		
		do {
			int screenCount = 1;
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File target = new File("./test-output/screenshots/"+pageName+" "+String.valueOf(screenCount) +".png");
			try {
				FileUtils.copyFile(src,target);
			} catch (IOException e) {
				e.printStackTrace();
			}
			windowHeight -= scrollHeight;
		}while(windowHeight<0);
		
		
		
	}

}
