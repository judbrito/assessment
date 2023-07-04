package test.page_scenario_three_and_four;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

public class LogicThreeFour {
	private static PageRegisterValidation page = new PageRegisterValidation();
	private static Modal model = new Modal();

	public static void timeSelenium(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
	}
	
	public static void clickSingModal() {
		page.getBtnSingModal().click();
	}

	public static void writeSingUser() {
		page.getTxtSignUser().sendKeys(model.getSignUser());
	}

	public static void writeSingPassword() {
		page.getTxtSignPassword().sendKeys(model.getSignPasword());

	}

	public static void clickSing() {
		page.getBtnSingSubmit().click();

	}

}
