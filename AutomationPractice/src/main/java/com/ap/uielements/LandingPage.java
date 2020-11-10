package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class LandingPage extends BaseClass {

	
	public static By lnkSignIn = By.xpath("//a[@class='login']");
	
	public static void clickSignIn() {
		PageActions.clickBtnLnk(lnkSignIn);
	}
	
}
