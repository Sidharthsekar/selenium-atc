package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class SignInPage extends BaseClass {

	private static By txtLoginEmail = By.xpath("//input[@id='email']");
	private static By txtLoginPassword = By.xpath("//input[@id='passwd']");
	private static By btnLoginSignIn = By.xpath("//button[@id='SubmitLogin']");

	public static void enterLoginEmail(String inputText) {
		PageActions.setText(txtLoginEmail, inputText);
	}

	public static void enterLoginPassword(String inputText) {
		PageActions.setText(txtLoginPassword, inputText);
	}

	public static void clickSignIn() {
		PageActions.clickBtnLnk(btnLoginSignIn);
	}
}
