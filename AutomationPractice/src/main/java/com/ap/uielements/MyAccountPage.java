package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class MyAccountPage extends BaseClass {

	private static By btnMyAddress = By.xpath("//a[@title='Addresses']");
	
	private static By btnOrderDetails = By.xpath("//a[@title='Orders']");
	
	private static By lnkUserProfile = By.xpath("//a[@class='account']/span");
	private static By lnkSignOut = By.xpath("//a[@class='logout']");
	
	
	public static void clickUserProfile() {
		PageActions.clickBtnLnk(lnkUserProfile);
	}
	public static void clickSignOut() {
		PageActions.clickBtnLnk(lnkSignOut);
	}
	
	public static void clickMyAddress() {
		PageActions.clickBtnLnk(btnMyAddress);
	}
	
	public static void clickOrderDetails() {
		PageActions.clickBtnLnk(btnOrderDetails);
	}
	
	
}
