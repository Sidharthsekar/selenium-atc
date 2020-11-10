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
	
	public static void getPageScreenShot(String pageName)  {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		long windowHeight = driver.manage().window().getSize().getHeight();
		
		js = (JavascriptExecutor)driver;
		long scrollHeight = (long)js.executeScript("return document.documentElement.scrollHeight");
		int screenCount = 1;
		do {
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File target = new File("./test-output/screenshots/"+pageName+" "+String.valueOf(screenCount) +".png");
			try {
				FileUtils.copyFile(src,target);
			} catch (IOException e) {
				e.printStackTrace();
			}
			js.executeScript("window.scrollBy(0,"+String.valueOf(windowHeight)+")", "");
			scrollHeight = scrollHeight - windowHeight;
			screenCount++;
		}while(scrollHeight>0);
		
		
		
	}

}
