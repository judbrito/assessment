package test.page_scenario_three_and_four;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

public class LogicThreeFour {
	private static PageRegisterValidation page = new PageRegisterValidation();
	private static Modal model = new Modal();

	public static void clickSingModal() {
		page.getBtnSingModal().click();
	}

	public static void writeSingUser() {
		page.getTxtSignUser().sendKeys(model.getSignUser());
	}

	public static void writeSingPassword() {
		page.getTxtSignPassword().sendKeys(model.getSignPasword());

	}

	public static void clickSingSubmit() {
		page.getBtnSingSubmit().click();

	}

	public static void signSucessful() {
		page.getBtnSingSubmit().getText();
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = Driver.getWebDriver().switchTo().alert();
		if (alert.getText().equals("Sign up successful.")) {
			Assert.assertEquals("Sign up successful.", alert.getText());
			System.out.println("Cadastrado com sucesso");
			alert.accept();
			page.getClose().click();
		} else if (alert.getText().equals("This user already exist.")) {
			Assert.assertEquals("This user already exist.", alert.getText());
			System.out.println("Já existe esse usuário");
			alert.accept();
			timeSelenium(page.getClose());
			page.getClose().click();
		}
	}
	public static void signUnsuccessful() {
		page.getBtnSingSubmit().getText();
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = Driver.getWebDriver().switchTo().alert();
		if (alert.getText().equals("This user already exist.")) {
			System.out.println("Já existe esse usuário");
			alert.accept();	
			page.getClose().click();
		}
	}

	public static void timeSelenium(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
		wait.until(ExpectedConditions.elementToBeClickable(text));
	}

}
