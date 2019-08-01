package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import main.CucumberRunner;

public class CommonMethods extends CucumberRunner{
	
	protected void clickElement(By element)
	{
		driver.findElement(element).click();
	}
	
	
	protected void enterText(By element,String keysToSend)
	{
		driver.findElement(element).sendKeys(keysToSend);
	}
	
	protected List<WebElement> getListOfElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	protected void clickElement(WebElement webElement) {
		webElement.click();
	}
	
	protected WebElement getWebElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	protected String getText(By locator)
	{
		return getWebElement(locator).getText();
	}

	public void compareStrings(String actual,String expected)
	{
		Assert.assertEquals(actual, expected);
	}
	
	public void elementIsDisplayed(By locator)
	{
		Assert.assertNotNull(getWebElement(locator));
	}
}
