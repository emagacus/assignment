package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CommonMethods;

public class ProductDetailsPage extends CommonMethods{


	By productPrice = By.id("priceblock_ourprice");
	By addToCartButton = By.xpath("add-to-cart-button");
	

	public void compareProductPrice(String expectedPrice)
	{
		String currentPrice = getText(productPrice);
		compareStrings(expectedPrice,currentPrice);
	}
	
	public void clickAddToCart()
	{
		clickElement(addToCartButton);
	}
	
	
	
}
