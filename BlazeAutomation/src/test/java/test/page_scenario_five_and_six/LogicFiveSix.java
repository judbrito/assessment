package test.page_scenario_five_and_six;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

public class LogicFiveSix {
	private static PageVideoContact page = new PageVideoContact();
	private static Modal model = new Modal();

	public static void clickAbout() {
		page.getBtnAbout().click();
	}

	public static void clickPlay() {
		timeSelenium(page.getBtnPlay());
		page.getBtnPlay().click();
	}

	public static void videoProgress() {
		page.getBtnPlay().isDisplayed();
		if (page.getBtnPlay().isDisplayed()) {
			System.out.println("Video em andamento");
		} else {
			System.out.println("video não encontrado");
		}
	}

	public static void videoClosed() {
		timeSelenium(page.getBtnClose());
		page.getBtnClose().click();

	}

	public static void clickContact() {
		page.getBtnContact();
	}

	public static void writeEmail() {
		page.getTxtEmail(model.getEmail());
	}

	public static void writeName() {
		page.getTxtName(model.getGetName());
	}

	public static void writeMessage() {
		page.getTxtMessage(model.getGetMessage());
	}

	public static void clickSendMessage() {
		page.getBtnSend().click();
		
	}

	public static void sentMessage() {
		timeSelenium(page.getBtnSend());
		String text = page.getBtnSend().getText();
		Alert alert = Driver.getWebDriver().switchTo().alert();
		Assert.assertEquals(text, alert.getText());
	}

	public static void timeSelenium(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
		wait.until(ExpectedConditions.elementToBeClickable(text));
	}
}
