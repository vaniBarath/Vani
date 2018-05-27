package payPalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class accountPage extends ProjectMethods {
	public accountPage() {
		PageFactory.initElements(driver,this);

	}
	

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement radioButton;
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement nextButton;
	
	
	public accountPage clickRadio() {
		click(radioButton);
		return this;
		
	}
	
	public void verifyRadioSel() {
		verifySelected(radioButton);
		
		
	}
	
	public SignUpPage clickNextButton() {
		click(nextButton);
		return new SignUpPage();
	}

}
