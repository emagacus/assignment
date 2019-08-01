package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.CucumberRunner;
import pages.LoginPage;

public class CucumberSteps extends CucumberRunner {

	
	LoginPage login = new LoginPage();
	
	
	  @Given("^I am in amazon homepage$")
	  public void givenImInAmazon() throws Throwable {
	  
	  }	
	  @When("^I search for  a product$")
	  public void whenIsearch()
	  {
		  
	  }
	  @And("^I save the cost of the first result$")
	  public void IsavetheCost()
	  {
		  
	  }
	  
	  @And("^I click on the first Result$")
	  public void clickFirstResult()
	  {
		  
	  }
	  
	  @Then("^Details cost matches with results cost$")
	  public void detailsMatchesWithResultCosts()
	  {
		  
	  }
	  @When ("^I add the product to cart$")
	  public void addProductToCart()
	  {
		  
	  }
	  @And ("^I go back to homepage$")
	  public void goBackToHomePage()
	  {
		  
	  }
	  @And ("^I click category in navigation bar$")
	  public void clickCategoryInNavigation()
	  {
		  
	  }
	  @Then("^Login page is displayed$")
	  public void loginPageIsDisplayed()
	  {
		  login.clickCreateAccount();
	  }
	  @When ("^I click on create your amazon account$")
	  public void clickOnCreateAmazon()
	  {
		  
	  }
	  @And ("^I enter name in name field$")
	  public void enterName()
	  {
		  
	  }
	  @And ("^I enter email in email field$")
	  public void enterEmail()
	  {
		  
	  }
	  @And ("^I enter password in password field$")
	  public void enterPassword()
	  {
		  
	  }
	  @And("^I enter password in password confirmation field$")
	  public void enterPasswordConfirmation()
	  
	  {
		  
	  }
	  
	  @Then ("^Create account text is displayed$")
	  public void createAccountTextIsDisplayed()
	  {
		  
	  }
	
	

}
