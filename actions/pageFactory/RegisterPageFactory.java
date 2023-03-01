package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePageFactory;

public class RegisterPageFactory extends BasePageFactory {
	private WebDriver driver;

	public RegisterPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "register-button")
	private WebElement registerButton;
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	@FindBy(id = "Email")
	private WebElement emailTextField;
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	@FindBy(id = "FirstName-error")
	private WebElement firstNameErrorMessage;
	@FindBy(id = "LastName-error")
	private WebElement lastNameErrorMessage;
	@FindBy(id = "Email-error")
	private WebElement emailErrorMessage;
	@FindBy(id = "Password-error")
	private WebElement passwordErrorMessage;
	@FindBy(id = "ConfirmPassword-error")
	private WebElement confirmPasswordErrorMessage;
	@FindBy(xpath = "//div[contains(@class,'message-error')]")
	private WebElement existingEmailErrorMessage;
	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement loginLink;
	@FindBy(xpath = "//div[@class='result']")
	private WebElement registerSuccessMessage;

	public void clickRegisterButton() {
		waitForElementClickable(driver, registerButton);
		registerButton.click();
	}

	public String getFirstNameErrorMassege() {
		waitForElementVisible(driver, firstNameErrorMessage);
		return firstNameErrorMessage.getText();
	}

	public String getLastNameErrorMassege() {
		waitForElementVisible(driver, lastNameErrorMessage);
		return lastNameErrorMessage.getText();

	}

	public String getEmailErrorMassege() {
		waitForElementVisible(driver, emailErrorMessage);
		return emailErrorMessage.getText();
	}

	public String getPasswordErrorMassege() {
		waitForElementVisible(driver, passwordErrorMessage);
		return passwordErrorMessage.getText();
	}

	public String getConfirmPasswordErrorMassege() {
		waitForElementVisible(driver, confirmPasswordErrorMessage);
		return confirmPasswordErrorMessage.getText();
	}

	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, emailTextField);
		emailTextField.sendKeys(emailAddress);

	}

	public void inputFirstName(String firstName) {
		waitForElementClickable(driver, firstNameTextField);
		firstNameTextField.sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		waitForElementClickable(driver, lastNameTextField);
		lastNameTextField.sendKeys(lastName);
	}

	public void inputPassword(String password) {
		waitForElementClickable(driver, passwordTextField);
		passwordTextField.sendKeys(password);
	}

	public void inputConfirmPassword(String password) {
		waitForElementClickable(driver, confirmPasswordTextField);
		confirmPasswordTextField.sendKeys(password);
	}

	public String getSuccessMessage() {
		waitForElementVisible(driver, registerSuccessMessage);
		return registerSuccessMessage.getText();
	}

	public void clickLoginLink() {
		waitForElementClickable(driver, loginLink);
		loginLink.click();
	}

	public String getExistingEmailErrorMassege() {
		waitForElementVisible(driver, existingEmailErrorMessage);
		return existingEmailErrorMessage.getText();
	}

}
