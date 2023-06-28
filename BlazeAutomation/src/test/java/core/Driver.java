package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver driver;

	public static void createAcess() {

		System.setProperty("webdriver.chrome.driver", "./driverChrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void webSite(String texto) {
		Driver.getWebDriver().get(texto);
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
