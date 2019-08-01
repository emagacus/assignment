package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CommonMethods;

public class NavigationBarPage extends CommonMethods {

	

	By searchBar = By.id("twotabsearchtextbox");
	By yourAmazonCategory = By.id("nav-your-amazon");
	By submitSearchBtn = By.id("nav-search-submit-text");
	By amazonLogo = By.className("nav-logo-link");
	
	
	public void  searchItem(String itemName)
	{
		enterText(searchBar, itemName);
		clickElement(submitSearchBtn);
	}
	
	public void clickYourAmazon()
	{
		clickElement(yourAmazonCategory);
	}
	
	public void clickAmzonLogo()
	{
		clickElement(amazonLogo);
	}

}
