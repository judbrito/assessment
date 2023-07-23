package test.page_scenario_one_and_two;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Driver;
import core.Utility;

public class LogicOneTwo {
	private static PageLoginLogout page = new PageLoginLogout();
	private static Modal model = new Modal();

	public static void access() {
		Driver.webSite("https://www.demoblaze.com/");

	}

	public static void clickLogin() {
		page.getBtnUser().click();
	}

	public static void writeUser() {
		WebElement txtUser = page.getTxtUser();
		Utility.timeSelenium(txtUser);
		txtUser.sendKeys(model.getEmail());
	}

	public static void writePassword() {
		WebElement TxtPassword = page.getTxtPassword();
		Utility.timeSelenium(TxtPassword);
		TxtPassword.sendKeys(model.getPassWord());
	}

	public static void Submit() {
		page.getBtnSubmit().click();
	}

	public static void emailOn() {
		WebElement islogged = page.getTxtValidationOn();
		Utility.timeSelenium(islogged);
		Assert.assertEquals(true, islogged.isDisplayed());
		System.out.println("O endereço de email está visível na tela.");
	}

	public static void logout() {
		page.getBtnLogout().click();
	}

	public static void emailOff() {
		WebElement isUnlogged = page.getTxtValidationOff();
		Utility.timeSelenium(isUnlogged);
		Assert.assertEquals(true, isUnlogged.isDisplayed());
		System.out.println("O Botão log out não está visível na tela.");
	}

}
