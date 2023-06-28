package test;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Driver;

public class BusinessLogic {
	public static PageElement page = new PageElement();

	public static void acess() {
		Driver.webSite("https://www.demoblaze.com/");
	}

	public static void clickModal() {
		page.getBtnUser().click();

	}

	public static void whiteUser() {
		page.getTxtUser().sendKeys("clientevip@gmail.com");
	}

	public static void whitePassword() {
		page.getTxtPassword().sendKeys("241307241307");
	}

	public static void clickBtnLogin() {
		page.getBtnLogin().click();
	}

	public static void validation() {

		WebElement isLogged = page.getTxtValidation();
		Assert.assertEquals(page.getTxtValidation().getText(), isLogged.getText());
	}

}
