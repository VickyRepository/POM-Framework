package suites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.HomePage;
import pages.LoginPage;

public class TestCases {

	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	@Before
	
	public void preCondition() {

		System.setProperty("webdriver.chrome.driver", "D:\\core java\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);

	}

	@Test
	public void doLogin() {
		loginPage.doLogin("Tester", "test");
		boolean verifyLogin = homePage.verifyLogin();
		if (verifyLogin == true) {
			System.out.println("Login is Success");
		} else {
			System.out.println("Login is not Success");
		}

		homePage.clickOrder();
	}
}
