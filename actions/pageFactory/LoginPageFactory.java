package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePageFactory;

public class LoginPageFactory extends BasePageFactory {

	private WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;
	@FindBy(xpath = "//button[contains(@class,'login-button')]")
	private WebElement loginButton;
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	@FindBy(id = "Email-error")
	private WebElement emailErrorMessage;
	@FindBy(xpath = "//div[contains(@class,'message-error')]")
	private WebElement passwordErrorMessage;
	@FindBy(xpath = "//div[contains(@class,'message-error')]")
	private WebElement aboveEmailErrorMessage;

	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, emailTextField);
		emailTextField.sendKeys(emailAddress);
	}

	public void inputPassword(String passWord) {
		waitForElementClickable(driver, passwordTextField);
		passwordTextField.sendKeys(passWord);
	}

	public void clickLoginButton() {
		waitForElementClickable(driver, loginButton);
		loginButton.click();
	}

	public String getErrorMessageAtEmailTextfield() {
		waitForElementVisible(driver, emailErrorMessage);
		return emailErrorMessage.getText();
	}

	public String getErrorMessageAboveEmailField() {
		waitForElementVisible(driver, aboveEmailErrorMessage);
		return aboveEmailErrorMessage.getText();
	}

}
