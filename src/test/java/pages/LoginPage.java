package pages;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.CommonMethods;


public class LoginPage extends CommonMethods{

	

	By createAccountSubmit = By.id("createAccountSubmit");
	
	public void clickCreateAccount()
	{
		clickElement(createAccountSubmit);
	}
	
	
}
