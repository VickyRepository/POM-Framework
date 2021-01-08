package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(css = "[id$=logout]")
	List<WebElement> logoutButton;

	@FindBy(xpath = "//a[contains(text(), 'Order')]")
	WebElement OrderLink;

	public HomePage(WebDriver webDriver) {

		this.driver = webDriver;
		PageFactory.initElements(driver, this);

	}

	public boolean verifyLogin() {

		if (logoutButton.size() != 0) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOrder() {
		OrderLink.click();
	}

}
