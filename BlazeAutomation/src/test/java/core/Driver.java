package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver driver;

	public static void createAcess() {

		System.setProperty("webdriver.chrome.driver", "./BlazeAutomation/driverChrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static WebDriver getWebDriver() {

		if (driver == null) {
			createAcess();
		}
		return driver;
	}

	public static void tearDown() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}

}
