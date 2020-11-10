package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class OrderHistoryDetail extends BaseClass {

	private static By lnkOrderDetail = By.xpath("//table[@id='order-list']/tbody/tr[1]/td[contains(@class,'history_detail')]/a[./span[contains(text(),'Details')]]");

	public static void clickOrderDetail() {
		PageActions.clickBtnLnk(lnkOrderDetail);
	}
}
