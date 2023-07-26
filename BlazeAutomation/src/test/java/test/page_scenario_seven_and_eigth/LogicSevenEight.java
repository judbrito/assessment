package test.page_scenario_seven_and_eigth;

import java.util.regex.Pattern;

import org.junit.Assert;
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
		Utility.timeClick(page.getTxtAddCart());
		Utility.timeOnly(page.getTxtAddCart());
		Pattern pattern = Pattern.compile("Product added\\.?");
		System.out.println("Adicionando ao carrinho");
	}

	public static void clickHome() {
		Utility.timeClick(page.getBtnHome());
	}

	public static void clickMonitor() {
		Driver.getWebDriver().navigate().refresh();
		Utility.timeClick(page.getBtnMonitor());
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
		Utility.timeClick(page.getTxtConfirmProduct());
		WebElement dell = page.getTxtConfirmProduct();
		String text = dell.getText();
		Assert.assertTrue(text.contains("Dell") || text.contains("monitor"));
	}
}
