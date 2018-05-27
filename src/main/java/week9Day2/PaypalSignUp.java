package week9Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class PaypalSignUp extends SeMethods{
	@Test
	public  void main() {

		startApp("chrome", "https://www.paypal.com/in/home");

		WebElement signUp = locateElement("signup-button");
		signUp.click();
		WebElement radioButton = locateElement("radio-personal");
		boolean verSe = verifySelected(radioButton);
		if(!verSe) {
			radioButton.click();
		}
		WebElement nextButton = locateElement("link", "Next");
		nextButton.click();
		WebElement counDD = locateElement("country");
		selectDropDownUsingText(counDD, " Angola");
	}

	

}
