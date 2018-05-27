package payPalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class homePagePay extends ProjectMethods{
	
	public homePagePay() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement signUpButton;
	
	
	public accountPage clickSignUpButton() {
		click(signUpButton);
		return new accountPage();
	}
}
