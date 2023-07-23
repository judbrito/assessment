package test.page_scenario_five_and_six;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import core.Driver;
import core.Utility;

public class LogicFiveSix {
	private static PageVideoContact page = new PageVideoContact();
	private static Modal model = new Modal();

	public static void clickAbout() {
		Utility.timeSelenium(page.getBtnAbout());
		System.out.println("clique sobre");
	}

	public static void clickPlay() {
		Utility.timeSelenium(page.getBtnPlay());

	}

	public static void videoProgress() {
		Utility.timeSelenium(page.getTxtVideo());
		boolean isVideoVisible = page.getTxtVideo().isDisplayed();
		assertTrue("Vídeo não encontrado", isVideoVisible);

		System.out.println("Vídeo em andamento");
	}

	public static void videoClosed() {
		Utility.timeSelenium(page.getBtnClose());
		page.getBtnClose().click();
	}

	public static void clickContact() {
		page.getBtnContact().click();

	}

	public static void writeEmail() {
		Utility.timeSelenium(page.getTxtEmail());
		page.getTxtEmail().sendKeys(model.getEmail());
	}

	public static void writeName() {
		page.getTxtName().sendKeys(model.getName());
	}

	public static void writeMessage() {
		page.getTxtMessage().sendKeys(model.getMessage());
	}

	public static void clickSendMessage() {
		page.getBtnSend().click();

	}

	public static void sentMessage() {
		Utility.alertIsPresent();
		Alert alert = Driver.getWebDriver().switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals("Thanks for the message!!", alertText);
		alert.accept();
	}

}
