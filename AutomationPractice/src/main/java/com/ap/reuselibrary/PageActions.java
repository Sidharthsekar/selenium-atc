package com.ap.reuselibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Reporter;
import org.openqa.selenium.support.ui.Select;

import com.ap.baselibrary.BaseClass;

public class PageActions extends BaseClass{
	
	
	
	public static void setText(By locator, String inputText) {
		try {
			(new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(locator));
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(inputText);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectDropdown(By locator, String inputText) {
		try {
			Select select = new Select((new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(locator)));
			select.selectByVisibleText(inputText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickBtnLnk(By locator) {
		try {
			(new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(locator)).click();
			
			pageLoadWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void mouseOverElement(By locator) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement((new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(locator))).perform();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void pageLoadWait() {
		String loadStatus;
		JavascriptExecutor js;
		do {
			js = (JavascriptExecutor) driver;
			loadStatus = (String)js.executeScript("return document.readyState");
		}while(!loadStatus.equals("complete"));
	}
}
