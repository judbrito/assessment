package test;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

public class BusinessLogic {
	private static PageElement page = new PageElement();
	private static Modal model = new Modal();

	public static void acess() {
		Driver.webSite("https://www.demoblaze.com/");
	}

	public static void clickModal() {
		page.getBtnUser().click();

	}

	public static void writeUser() {

		page.getTxtUser().sendKeys(model.getEmail());
	}

	public static void writePassword() {
		page.getTxtPassword().sendKeys(model.getSenha());

	}

	public static void clickBtnLogin() {
		page.getBtnLogin().click();
	}

	public static void validation() {
		WebElement isLogged = page.getTxtValidation();
		Assert.assertEquals(page.getTxtValidation().getText(), isLogged.getText());
	}

	public static void time(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
