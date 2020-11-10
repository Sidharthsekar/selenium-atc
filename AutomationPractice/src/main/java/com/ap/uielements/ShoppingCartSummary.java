package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class ShoppingCartSummary extends BaseClass{

	
	private static By btnSummaryProceedToCart = By.xpath("//p[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']");
	private static By btnAddressProceedToCart = By.xpath("//button[@type='submit'][./span[text()='Proceed to checkout']]");
	private static By btnShippingProceedToCart = By.xpath("//button[@type='submit'][./span[contains(text(),'Proceed to checkout')]]");
	
	
	
	private static By cbxTermsAgree = By.xpath("//input[@id='cgv']");
	
	private static By lnkPayByWire = By.xpath("//a[@class='bankwire']");
	
	private static By btnConfirmOrder = By.xpath("//span[text()='I confirm my order']");
	
	//private static By msgReferenceId = By.xpath("//*[@id='center_column']/div/text()[6]");
	private static By msgReferenceId = By.xpath("//*[@class='box']");
	
	public static void clickSummaryCheckout() {
		PageActions.clickBtnLnk(btnSummaryProceedToCart);
	}
	public static void clickAddressCheckout() {
		PageActions.clickBtnLnk(btnAddressProceedToCart);
	}
	public static void clickShippingCheckout() {
		PageActions.clickBtnLnk(btnShippingProceedToCart);
	}
	
	public static void checkTerms() {
		PageActions.clickBtnLnk(cbxTermsAgree);
	}
	
	public static void selectPayByWire() {
		PageActions.clickBtnLnk(lnkPayByWire);
	}
	
	public static void clickConfirmMyOrder() {
		PageActions.clickBtnLnk(btnConfirmOrder);
	}
	
	public static String getReferenceId() {
		String referenceId = "";
		boolean keyFound = false;
		for(String s : driver.findElement(msgReferenceId).getText().split(" "))
		{
			if(keyFound) {
				referenceId = s.trim();
				break;
			}
			keyFound = s.equals("reference") ?true:false;
		}
		return referenceId;
	}
}
