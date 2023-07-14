package test.page_scenario_nine_and_ten;

import java.time.Duration;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.Driver;

public class LogicSevenEight {
	private static PageLaptopsMonitor page = new PageLaptopsMonitor();

	public static void clickLaptop() {
		page.getBtnLaptops().click();
		System.out.println("Clique em Laptops");
	}

	public static void selectDell() {
		activeScroll(page.getTxtDell());
		System.out.println("selecionou dell");
	}

	public static void addToCart() {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getTxtAddCart()));
		page.getTxtAddCart().click();
		System.out.println("Adicionando ao carrinho");

	}

	public static void sentMessage() {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		try {
			Alert alert = Driver.getWebDriver().switchTo().alert();
			String alertText = alert.getText();
			Pattern pattern = Pattern.compile("Product added\\.?");
			Assert.assertTrue(pattern.matcher(alertText).matches());
			alert.accept();
			System.out.println("assertou");
		} catch (NoAlertPresentException e) {

		}
	}

	public static void clickHome() {
		page.getBtnHome().click();
	}

	public static void clickMonitor() {
		Driver.getWebDriver().navigate().refresh();

		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(page.getBtnMonitor())).click();
		System.out.println("Clique em Monitor");

	}

	public static void clickCart() {
		page.getBtnCart().click();
	}

	public static void firstItem() {
		activeScroll(page.getTxtFirstElement());
		System.out.println("Clique em monitor");
	}

	public static void confirmItem() {
		WebElement cartMonitor = page.getTxtCartMonitor();
		activeScroll(cartMonitor);
		String cartMonitorText = cartMonitor.getText();
		Assert.assertTrue(cartMonitorText.contains("monitor"));

	}

	public static void activeScroll(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
			JavascriptExecutor jse = (JavascriptExecutor) Driver.getWebDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (StaleElementReferenceException e) {

		}
	}

}