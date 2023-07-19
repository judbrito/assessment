package test.page_scenario_one_and_two;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

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
		page.getTxtUser().sendKeys(model.getEmail());
	}

	public static void writePassword() {
		page.getTxtPassword().sendKeys(model.getPassWord());
	}
	public static void Submit() {
		page.getBtnSubmit().click();
	}

	public static void emailOn() {
		WebElement islogged = page.getTxtValidationOn();
		timeSelenium(islogged);
		Assert.assertEquals(true, islogged.isDisplayed());
		System.out.println("O endereço de email está visível na tela.");
	}

	public static void logout() {
		page.getBtnLogout().click();
	}

	public static void emailOff() {
		WebElement isUnlogged = page.getTxtValidationOff();
		timeSelenium(isUnlogged);
		Assert.assertEquals(true, isUnlogged.isDisplayed());
		System.out.println("O Botão log out não está visível na tela.");
	}

	public static void timeSelenium(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
	}
}
