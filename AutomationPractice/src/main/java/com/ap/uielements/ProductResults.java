package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class ProductResults extends BaseClass {
	
	private static By lnkProduct1 = By.xpath("(//div[@id='center_column']//a[@class='product-name'])[1]");
	private static By lnkProduct2 = By.xpath("(//div[@id='center_column']//a[@class='product-name'])[2]");
	private static By lnkProduct3 = By.xpath("(//div[@id='center_column']//a[@class='product-name'])[3]");
	
	private static By lnkCategorySummerDresses = By.xpath("//div[@class='breadcrumb clearfix']/a[@title='Summer Dresses']");

	public static void selectProduct1() {
		PageActions.clickBtnLnk(lnkProduct1);
	}
	
	public static void selectProduct2() {
		PageActions.clickBtnLnk(lnkProduct2);
	}
	
	public static void selectProduct3() {
		PageActions.clickBtnLnk(lnkProduct3);
	}
	
	public static void selectSummerDressesCategory() {
		PageActions.clickBtnLnk(lnkCategorySummerDresses);
	}
}
