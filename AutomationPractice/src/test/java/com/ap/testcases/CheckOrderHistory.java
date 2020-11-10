package com.ap.testcases;

import org.testng.annotations.*;

import com.ap.baselibrary.BaseClass;
import com.ap.reuselibrary.*;
import com.ap.uielements.*;

public class CheckOrderHistory extends BaseClass {
	public static String loginEmailTxt;
	public static String loginPassTxt;
	public static String firstNameTxt;
	public static String lastNameTxt;
	public static String companyTxt;
	public static String address1Txt;
	public static String address2Txt;
	public static String cityTxt;
	public static String stateTxt;
	public static String zipcodeTxt;
	public static String countryTxt;
	public static String homePhoneTxt;
	public static String mobilePhoneTxt;
	public static String addInformationTxt;
	public static String addressTitleTxt;

	@BeforeClass
	public void browserLaunch() {
		launchBrowser();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 1, dataProvider = "OrderDetails")
	public void fetchOrderDetails(String loginEmail, String password,String firstName,String lastName,
			String company, String address1, String address2, String city, String state, String zipcode,
			String country, String homePhone, String mobilePhone, String addInformation, String addressTitle) {
		loginEmailTxt = loginEmail;
		loginPassTxt = password;
		firstNameTxt = firstName;
		lastNameTxt = lastName;
		companyTxt = company;
		address1Txt = address1;
		address2Txt = address2;
		cityTxt = city;
		stateTxt = state;
		zipcodeTxt = zipcode;
		countryTxt = country;
		homePhoneTxt = homePhone;
		mobilePhoneTxt = mobilePhone;
		addInformationTxt = addInformation;
		addressTitleTxt = addressTitle;
	}

	@DataProvider(name = "OrderDetails")
	public Object[][] getExcelData() throws Exception {
		String sheetName = "OrderDetails";
		return ExcelUtility.readExcelData(sheetName);
	}

	@Test(priority = 2)
	public void loginUser() {
		LandingPage.clickSignIn();
		SignInPage.enterLoginEmail(loginEmailTxt);
		SignInPage.enterLoginPassword(loginPassTxt);
		SignInPage.clickSignIn();
	}

	@Test(priority=3) 
	public void addAddress() 
	{ 
		MyAccountPage.clickMyAddress();
		MyAddress.clickAddAnAddress();
		MyAddress.enterFirstName(firstNameTxt);
		MyAddress.enterLastName(lastNameTxt);
		MyAddress.enterCompanyName(companyTxt);
		MyAddress.enterAddress1(address1Txt);
		MyAddress.enterAddress2(address2Txt);
		MyAddress.enterCity(cityTxt);
		MyAddress.enterState(stateTxt);
		MyAddress.enterZip(zipcodeTxt);
		MyAddress.enterCountry(countryTxt);
		MyAddress.enterHomePhone(homePhoneTxt);
		MyAddress.enterMobilePhone(mobilePhoneTxt);
		MyAddress.enterAdditionalInformation(addInformationTxt);	
		MyAddress.enterAddressTitle(addressTitleTxt);
		MyAddress.clickSave(); 
	}
	
	@Test(priority =4)
	public void selectProduct() {
		Categories.hoverOverWomen();
		Categories.clickSummerDresses();
		
		ProductResults.selectProduct1();
		ProductPage.enterQuantity("5");
		ProductPage.enterSize("L");
		ProductPage.selectColor();
		ProductPage.clickAddToCart();
		ProductPage.clickContinueShopping();
		ProductResults.selectSummerDressesCategory();
		
		ProductResults.selectProduct2();
		ProductPage.enterQuantity("5");
		ProductPage.enterSize("L");
		ProductPage.selectColor();
		ProductPage.clickAddToCart();
		ProductPage.clickContinueShopping();
		ProductResults.selectSummerDressesCategory();
		
		ProductResults.selectProduct3();
		ProductPage.enterQuantity("5");
		ProductPage.enterSize("L");
		ProductPage.selectColor();
		ProductPage.clickAddToCart();
		ProductPage.clickProceedToCart();
	}
	
	@Test(priority =5)
	public void checkoutProduct() {
		ShoppingCartSummary.clickSummaryCheckout();
		ShoppingCartSummary.clickAddressCheckout();
		ShoppingCartSummary.checkTerms();
		ShoppingCartSummary.clickShippingCheckout();
		ShoppingCartSummary.selectPayByWire();
		ShoppingCartSummary.clickConfirmMyOrder();
		String referenceId = ShoppingCartSummary.getReferenceId();
		
		MyAccountPage.clickUserProfile();
		MyAccountPage.clickOrderDetails();
		
		OrderHistoryDetail.clickOrderDetail();
		
		OrderHistoryDetail.verifyReferenceId(referenceId);
		
		ScreenShot.getPageScreenShot("Order History");
		

		
		MyAccountPage.clickSignOut();
	}
	
	
}
