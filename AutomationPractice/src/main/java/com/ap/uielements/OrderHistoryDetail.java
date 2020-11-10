package com.ap.uielements;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class OrderHistoryDetail extends BaseClass {

	private static By lnkOrderDetail = By.xpath("//table[@id='order-list']/tbody/tr[1]/td[contains(@class,'history_detail')]/a[./span[contains(text(),'Details')]]");
	private static By lblReferenceId = By.xpath("//table[@id='order-list']/tbody/tr[1]/td[contains(@class,'history_link')]/a");

	public static void clickOrderDetail() {
		PageActions.clickBtnLnk(lnkOrderDetail);
	}
	
	public static void verifyReferenceId(String expRefenceId) {
		Assert.assertEquals(driver.findElement(lblReferenceId).getText().trim(), expRefenceId);
	}
	
}
