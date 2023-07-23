package core;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	public static void timeSelenium(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
		text.click();

	}

	public static void timeWait(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));

	}

	public static void alertIsPresent() {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	}
}
