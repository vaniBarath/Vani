package testCasePay;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import payPalpages.homePagePay;
import wdMethods.ProjectMethods;

public class TC001_SignUp extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Sign";
		testDescription="SignUp Paypal";
		testNodes="signUp";
		category="Smoke";
		authors="vani";
		browserName="chrome";
		dataSheetName="TC001_Sign";
	}
	
	@Test(dataProvider="fetchData")
	public void signUp(String co,String em,String pW,String conPW) {
		new homePagePay()
		.clickSignUpButton()
		.clickRadio()
		.clickNextButton()
		.selectCountry(co);
		
				
	}
}
