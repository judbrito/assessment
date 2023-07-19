package test.page_scenario_nine_and_ten;

import core.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class LogicNineTen {
	private static final PageManyItems page = new PageManyItems();

	public static void clickCategory() {
		activeScroll(page.getBtnCategory());
		page.getBtnCategory().click();
		System.out.println("Clique em algumas categorias");
	}

	public static void clickAnyItems() {
		activeScroll(page.getTxtRandonItem());
		System.out.println("Clique em alguns itens");
	}

	public static void addToCart() {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getTxtAddCart())).click();
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

	public static void mapValues() {

	    int sum = 0;

	    List<WebElement> elements = page.getTxtMapValues();
	    for (WebElement element : elements) {
	        String value = element.getText();
	        int valor = Integer.parseInt(value);
	        sum += valor;
	    }

	    System.out.println("A soma dos valores é: " + sum);
	    Assert.assertEquals(page.getTxtTotal().getText(), sum);
	}
}