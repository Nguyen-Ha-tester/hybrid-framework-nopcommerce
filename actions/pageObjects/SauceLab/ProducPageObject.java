package pageObjects.SauceLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUIs.saucelab.ProductPageUI;

public class ProducPageObject extends BasePage {
	private WebDriver driver;

	public ProducPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void sortProduct(String optionName) {
		waitForElementClickable(driver, ProductPageUI.DROPEDOWN_PRODUCT_CONTAINER);
		selectItemInDefaultDropdown(driver, ProductPageUI.DROPEDOWN_PRODUCT_CONTAINER, optionName);

	}

	public boolean isProductNameSortedByAscending() {
		ArrayList<String> currentListOfProductName = new ArrayList<>();
		List<WebElement> currentElement = getListWebElements(driver, ProductPageUI.LIST_PRODUCT_NAME);

		for (WebElement webElement : currentElement) {
			currentListOfProductName.add(webElement.getText());
		}

		ArrayList<String> expectedListofProductName = new ArrayList<>();

		for (String string : currentListOfProductName) {
			expectedListofProductName.add(string);
		}
		Collections.sort(expectedListofProductName);

		return expectedListofProductName.equals(currentListOfProductName);
	}

	public boolean isProductNameSortedByDescending() {
		ArrayList<String> currentListOfProductName = new ArrayList<>();
		List<WebElement> currentElement = getListWebElements(driver, ProductPageUI.LIST_PRODUCT_NAME);

		for (WebElement webElement : currentElement) {
			currentListOfProductName.add(webElement.getText());
		}

		ArrayList<String> expectedListofProductName = new ArrayList<>();

		for (String string : currentListOfProductName) {
			expectedListofProductName.add(string);
		}
		Collections.sort(expectedListofProductName);
		Collections.reverse(expectedListofProductName);

		return expectedListofProductName.equals(currentListOfProductName);
	}

	public boolean isProductPriceSortedByAscending() {
		ArrayList<Float> currentListOfProductPrice = new ArrayList<>();
		List<WebElement> currentElement = getListWebElements(driver, ProductPageUI.LIST_PRODUCT_PRICE);

		for (WebElement webElement : currentElement) {
			String priceText = webElement.getText();
			// Delete $ in price and converse data type of price from text to float
			Float priceNumber = Float.parseFloat(priceText.replace("$", ""));
			currentListOfProductPrice.add(priceNumber);
		}

		ArrayList<Float> expectedListofProductPrice = new ArrayList<>();
		for (Float price : currentListOfProductPrice) {
			expectedListofProductPrice.add(price);
		}
		Collections.sort(expectedListofProductPrice);

		return expectedListofProductPrice.equals(currentListOfProductPrice);
	}

	public boolean isProductPriceSortedByDescending() {
		ArrayList<Float> currentListOfProductPrice = new ArrayList<>();
		List<WebElement> currentElement = getListWebElements(driver, ProductPageUI.LIST_PRODUCT_PRICE);

		for (WebElement webElement : currentElement) {
			String priceText = webElement.getText();
			// Delete $ in price and converse data type of price from text to float
			Float priceNumber = Float.parseFloat(priceText.replace("$", ""));
			currentListOfProductPrice.add(priceNumber);
		}

		ArrayList<Float> expectedListofProductPrice = new ArrayList<>();
		for (Float price : currentListOfProductPrice) {
			expectedListofProductPrice.add(price);
		}
		Collections.sort(expectedListofProductPrice);
		Collections.reverse(expectedListofProductPrice);

		return expectedListofProductPrice.equals(currentListOfProductPrice);
	}

}
