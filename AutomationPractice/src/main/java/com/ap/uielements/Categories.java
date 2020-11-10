package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class Categories extends BaseClass {
	
	public static By lnkCategoryWomen = By.xpath("//div[@id='block_top_menu']//a[@title='Women']");
	
	public static By lnkCategorySummerDresses = By.xpath("//a[@title='Women']/following-sibling::ul//a[@title='Summer Dresses']");
	
	public static void hoverOverWomen() {
		PageActions.mouseOverElement(lnkCategoryWomen);
	}
	public static void clickSummerDresses() {
		PageActions.clickBtnLnk(lnkCategorySummerDresses);
	}
	
	

}
