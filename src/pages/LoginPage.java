package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By userName = By.cssSelector("[id$=username]");
	By password = By.cssSelector("[id$=password]");
	By LoginButton = By.cssSelector("[id$=button]");

	public LoginPage(WebDriver webDriver) {
		this.driver = webDriver;
	}

	public void enterUserName(String userNameData) {
		driver.findElement(userName).sendKeys(userNameData);
	}

	public void enterPassword(String passwordData) {
		driver.findElement(password).sendKeys(passwordData);
	}

	public void clickLogin() {
		driver.findElement(LoginButton).click();
	}

	public void doLogin(String userNameData, String passwordData) {
		this.enterUserName(userNameData);
		this.enterPassword(passwordData);
		this.clickLogin();
	}
}
