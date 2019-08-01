package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonMethods;

public class SearchPage extends CommonMethods{


	By searchResultPrices = By.xpath("//span[@class='a-price' and @data-a-color='base']/span[@class='a-offscreen']");
	By searchResultNames = By.xpath("//div[@class='s-result-list s-search-results sg-row']//a[@class='a-link-normal a-text-normal']");

	public String getResultPrice(int index)
	{
	 return  getListOfElements(searchResultPrices).get(index).getText();
	}
	
	public void clickResultDetails(int index)
	{
		clickElement(getListOfElements(searchResultPrices).get(index));
	}


	
}
