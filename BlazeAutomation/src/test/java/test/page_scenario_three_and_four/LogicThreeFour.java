package test.page_scenario_three_and_four;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import core.Driver;
import core.Utility;

public class LogicThreeFour {
	private static PageRegisterValidation page = new PageRegisterValidation();
	private static Modal model = new Modal();

	public static void clickSingModal() {
		Utility.timeSelenium(page.getBtnSingModal());
	}

	public static void writeSingUser() {
		WebElement txtSingUser = page.getTxtSignUser();
		Utility.timeWait(txtSingUser);
		txtSingUser.sendKeys(model.getSignUser());

	}

	public static void writeSingPassword() {
		WebElement txtSingPassword = page.getTxtSignPassword();
		Utility.timeWait(txtSingPassword);
		txtSingPassword.sendKeys(model.getSignPasword());

	}

	public static void clickSingSubmit() {
		page.getBtnSingSubmit().click();

	}

	public static void signSucessful() {
		Utility.alertIsPresent();
		Alert alert = Driver.getWebDriver().switchTo().alert();
		if (alert.getText().equals("Sign up successful.")) {
			Assert.assertEquals("Sign up successful.", alert.getText());
			System.out.println("Cadastrado com sucesso");
			alert.accept();
		}

	}

	public static void writeUserExisting() {
		WebElement txtSingUser = page.getTxtSignUser();
		Utility.timeSelenium(txtSingUser);
		txtSingUser.sendKeys(model.getUserExiting());
	}

	public static void signUnsuccessful() {
		page.getBtnSingSubmit().getText();
		Utility.alertIsPresent();
		Alert alert = Driver.getWebDriver().switchTo().alert();
		if (alert.getText().equals("This user already exist.")) {
			System.out.println("Já existe esse usuário");
			alert.accept();

		}
	}

	public static void closeModal() {
		page.getBtnClose().click();
	}
}
