package com.ap.uielements;

import org.openqa.selenium.By;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.PageActions;

public class MyAddress extends BaseClass {

	private static By btnAddAddress = By.xpath("//a[@title='Add an address']");
	
	private static By txtFirstName = By.xpath("//input[@id='firstname']");
	private static By txtLastName = By.xpath("//input[@id='lastname']");
	private static By txtCompany = By.xpath("//input[@id='company']");
	private static By txtAddress1 = By.xpath("//input[@id='address1']");
	private static By txtAddress2 = By.xpath("//input[@id='address2']");
	private static By txtCity = By.xpath("//input[@id='city']");
	private static By drpState = By.xpath("//select[@id='id_state']");
	private static By txtZipcode = By.xpath("//input[@id='postcode']");
	private static By drpCountry = By.xpath("//select[@id='id_country']");
	private static By txtHomePhone = By.xpath("//input[@id='phone']");
	private static By txtMobilePhone = By.xpath("//input[@id='phone_mobile']");
	private static By txtAdditionalInformation = By.xpath("//textarea[@id='other']");
	private static By txtAddressTitle = By.xpath("//input[@id='alias']");
	private static By btnSave = By.xpath("//button[@id='submitAddress']");
	
	public static void enterFirstName(String firstName) {
		PageActions.setText(txtFirstName,firstName);
	}

	public static void enterLastName(String lastName) {
		PageActions.setText(txtLastName,lastName);
	}
	
	public static void enterCompanyName(String companyName) {
		PageActions.setText(txtCompany,companyName);
	}
	
	public static void enterAddress1(String address1) {
		PageActions.setText(txtAddress1,address1);
	}

	public static void enterAddress2(String address2) {
		PageActions.setText(txtAddress2,address2);
	}
	
	public static void enterCity(String city) {
		PageActions.setText(txtCity,city);
	}
	public static void enterState(String state) {
		PageActions.selectDropdown(drpState, state);
	}
	public static void enterZip(String zip) {
		PageActions.setText(txtZipcode,zip);
	}
	public static void enterCountry(String country) {
		PageActions.selectDropdown(drpCountry, country);
	}
	public static void enterHomePhone(String homePhone) {
		PageActions.setText(txtHomePhone,homePhone);
	}
	public static void enterMobilePhone(String mobilePhone) {
		PageActions.setText(txtMobilePhone,mobilePhone);
	}
	public static void enterAdditionalInformation(String addInfo) {
		PageActions.setText(txtAdditionalInformation,addInfo);
	}	
	public static void enterAddressTitle(String addressTitle) {
		PageActions.setText(txtAddressTitle,addressTitle);
	}
	
	
	public static void clickSave() {
		PageActions.clickBtnLnk(btnSave);
	}
	
	public static void clickAddAnAddress() {
		PageActions.clickBtnLnk(btnAddAddress);		
	}
}
