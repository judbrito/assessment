package test.page_scenario_eleven_twelve;

import org.openqa.selenium.WebElement;

import core.Driver;
import core.Utility;

public class LogicElevenTwelve {
	private static final PagePricePay page = new PagePricePay();
	static Modal model = new Modal();

	public static void clickCategory() {
		Utility.activeScroll(page.getBtnCategory());
		page.getBtnCategory().click();

	}

	public static void clickAnyItems() {
		Utility.activeScroll(page.getTxtRandonItem());
		System.out.println("Clique em alguns itens");
	}

	public static void clickPhones() {
		Utility.timeSelenium(page.getBtnPhones());
	}

	public static void clickPlaceOrder() {
		page.getBtnPlaceOrder().click();
	}

	public static void writeName() {
		WebElement txtName = page.getTxtName();
		model.writeText(txtName, model.getGetName());
	}

	public static void writeCountry() {
		WebElement txtCountry = page.getTxtCountry();
		model.writeText(txtCountry, model.getGetCountry());
	}

	public static void writeCity() {
		WebElement txtCity = page.getTxtCity();
		model.writeText(txtCity, model.getGetCity());
	}

	public static void writeCredit() {
		WebElement txtCreditcard = page.getTxtCreditcard();
		model.writeText(txtCreditcard, model.getGetCreditcard());
	}

	public static void writeMonth() {
		WebElement txtMonth = page.getTxtMonth();
		model.writeText(txtMonth, model.getGetMonth());
	}

	public static void writeYear() {
		WebElement txtYear = page.getTxtYear();
		model.writeText(txtYear, model.getGetYear());
	}

	public static void clickPurchase() {
		page.getBtnPurchase().click();
	}

	public static void clickOk() {
		Driver.getWebDriver().navigate().refresh();
		Utility.timeWait(page.getBtnOk());

	}

}
