package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By logoutButton = By.cssSelector("[id$=logout]");
	By OrderLink = By.xpath("//a[contains(text(), 'Order')]");

	public HomePage(WebDriver webDriver) {

		this.driver = webDriver;

	}

	public boolean verifyLogin() {

		if (driver.findElements(logoutButton).size() != 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public void clickOrder() {
		driver.findElement(OrderLink).click();
	}

}
