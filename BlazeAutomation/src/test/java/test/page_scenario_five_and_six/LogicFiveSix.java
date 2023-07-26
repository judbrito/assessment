package test.page_scenario_five_and_six;

import static org.junit.Assert.assertTrue;

import core.Utility;

public class LogicFiveSix {
	private static PageVideoContact page = new PageVideoContact();
	private static Modal model = new Modal();

	public static void clickAbout() {
		Utility.timeClick(page.getBtnAbout());
		System.out.println("clique sobre");
	}

	public static void clickPlay() {
		Utility.timeClick(page.getBtnPlay());
	}

	public static void videoProgress() {
		Utility.timeClick(page.getTxtVideo());
		boolean isVideoVisible = page.getTxtVideo().isDisplayed();
		assertTrue("Vídeo não encontrado", isVideoVisible);
	}

	public static void videoClosed() {
		Utility.timeClick(page.getBtnClose());
		page.getBtnClose().click();
	}

	public static void clickContact() {
		page.getBtnContact().click();
	}

	public static void writeEmail() {
		Utility.timeClick(page.getTxtEmail());
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
		Utility.alertIsPresent("Thanks for the message!!");
	}
}
