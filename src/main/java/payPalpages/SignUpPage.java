package payPalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpPage extends ProjectMethods{

	public SignUpPage() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(how=How.ID,using="country")
	private WebElement country;
	
	
	@FindBy(how=How.ID,using="email")
	private WebElement email;
	
	@FindBy(how=How.ID,using="password")
	private WebElement pass;
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement conpass;
	
	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement continueButton;
	
	public SignUpPage selectCountry(String data) {
		selectDropDownUsingText(country, data);
		return this;
	}
	
	public SignUpPage enterEmail(String em) {
		type(email, em);
		return this;
	}
	
	public SignUpPage enterPassword(String passW) {
		type(email, passW);
		return this;
	}
	
	public SignUpPage confirmPass(String ConPassW) {
		type(conpass, ConPassW);
		return this;
	}
	
	public void clickContinueButton() {
		click(continueButton);
		
	}
	
}
