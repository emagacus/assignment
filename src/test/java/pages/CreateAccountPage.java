package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CommonMethods;

public class CreateAccountPage extends CommonMethods {
	
	By createAccountHeader = By.xpath("//h1[normalize-space()='Create account']");

	By nameField = By.id("ap_customer_name");
	By emailField = By.id("ap_email");
	By passwordField = By.id("ap_password");
	By passwordConfirmField = By.id("ap_password_check");


	public void createAccountIsDisplayed() {
		elementIsDisplayed(createAccountHeader);
	}

	public void enterEmail(String email) {
		enterText(emailField, email);
	}

	public void enterName(String name) {
		enterText(nameField, name);
	}

	public void enterPassword(String password) {
		enterText(passwordField, password);
	}

	public void enterConfirmationPassword(String password) {
		enterText(passwordConfirmField, password);
	}

}
