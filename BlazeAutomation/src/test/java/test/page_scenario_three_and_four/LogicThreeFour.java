package test.page_scenario_three_and_four;

import org.openqa.selenium.WebElement;

import core.Utility;

public class LogicThreeFour {
	private static PageRegisterValidation page = new PageRegisterValidation();
	private static Modal model = new Modal();

	public static void clickSingModal() {
		Utility.timeClick(page.getBtnSingModal());
	}

	public static void writeSingUser() {
		WebElement txtSingUser = page.getTxtSignUser();
		Utility.timeClick(txtSingUser);
		txtSingUser.sendKeys(model.getSignUser());

	}

	public static void writeSingPassword() {
		WebElement txtSingPassword = page.getTxtSignPassword();
		Utility.timeClick(txtSingPassword);
		txtSingPassword.sendKeys(model.getSignPasword());

	}

	public static void clickSingSubmit() {
		page.getBtnSingSubmit().click();

	}

	public static void signSucessful() {
		Utility.alertIsPresent("Sign up successful.");

	}

	public static void writeUserExisting() {
		WebElement txtSingUser = page.getTxtSignUser();
		Utility.timeClick(txtSingUser);
		txtSingUser.sendKeys(model.getUserExiting());
	}

	public static void signUnsuccessful() {
		page.getBtnSingSubmit().getText();
		Utility.alertIsPresent("This user already exist.");

	}

	public static void closeModal() {
		page.getBtnClose().click();
	}
}
