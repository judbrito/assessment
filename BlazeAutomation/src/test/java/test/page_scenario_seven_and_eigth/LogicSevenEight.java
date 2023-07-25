package test.page_scenario_seven_and_eigth;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import core.Driver;
import core.Utility;

public class LogicSevenEight {
	private static PageLaptopsMonitor page = new PageLaptopsMonitor();

	public static void clickLaptop() {
		Utility.activeScroll(page.getBtnLaptops());
		System.out.println("Clique em Laptops");
	}

	public static void selectDell() {
		Utility.activeScroll(page.getTxtSelectMonitor());
		System.out.println("selecionou dell");
	}

	public static void addToCart() {
		Utility.activeScroll(page.getTxtAddCart());
		Utility.alertIsPresent();
		Alert alert = Driver.getWebDriver().switchTo().alert();
		String alertText = alert.getText();
		Pattern pattern = Pattern.compile("Product added\\.?");
		Assert.assertTrue(pattern.matcher(alertText).matches());
		alert.accept();
		System.out.println("Adicionando ao carrinho");
	}

	public static void clickHome() {
		Utility.timeSelenium(page.getBtnHome());
	}

	public static void clickMonitor() {
		Driver.getWebDriver().navigate().refresh();
		Utility.timeSelenium(page.getBtnMonitor());
		System.out.println("Clique em Monitor");
	}

	public static void clickCart() {
		page.getBtnCart().click();

	}

	public static void firstItem() {
		Utility.activeScroll(page.getTxtFirstElement());
		System.out.println("Clique em monitor");
	}

	public static void confirmItem() {
		WebElement cartMonitor = page.getTxtCartMonitor();
		Utility.activeScroll(cartMonitor);
		String cartMonitorText = cartMonitor.getText();
		Assert.assertTrue(cartMonitorText.contains("monitor"));
	}

	public static void firstItemDell() {
		Utility.timeSelenium(page.getTxtConfirmProduct());
		WebElement dell = page.getTxtConfirmProduct();
		String text = dell.getText();
		Assert.assertTrue(text.contains("Dell") || text.contains("monitor"));
	}

}
