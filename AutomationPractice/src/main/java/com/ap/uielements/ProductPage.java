package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class ProductPage extends BaseClass {

	private static By txtQuantity = By.xpath("//input[@id='quantity_wanted']");
	private static By drpSize = By.xpath("//select[@id='group_1']");
	private static By lnkColor = By.xpath("//ul[@id='color_to_pick_list']//a[@class='color_pick'][1]");
	private static By btnAddToCart = By.xpath("//p[@id='add_to_cart']/button[@type='submit']");
	
	private static By btnContinueShopping = By.xpath("//span[@title='Continue shopping']/span");
	private static By btnProceedToCart = By.xpath("//a[@title='Proceed to checkout']/span");
	
	public static void enterQuantity(String quantity) {
		PageActions.setText(txtQuantity, quantity);
	}
	
	public static void enterSize(String size) {
		PageActions.selectDropdown(drpSize, size);
	}
	
	public static void selectColor() {
		PageActions.clickBtnLnk(lnkColor);
	}
	
	public static void clickAddToCart() {
		PageActions.clickBtnLnk(btnAddToCart);
	}
	
	public static void clickContinueShopping() {
		PageActions.clickBtnLnk(btnContinueShopping);
	}
	public static void clickProceedToCart() {
		PageActions.clickBtnLnk(btnProceedToCart);
	}
	
}
