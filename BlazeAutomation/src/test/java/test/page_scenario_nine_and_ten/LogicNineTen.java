package test.page_scenario_nine_and_ten;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;
import core.Utility;

public class LogicNineTen {
	private static final PageManyItems page = new PageManyItems();

	public static void clickCategory() {
		Utility.clickRandon(page.getBtnCategory());
	}

	public static void clickAnyItems() {
		Utility.timeClick(page.getTxtAnyItems());

	}

	public static void noItems() {

	}

	public static void deleteItem() {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		By deleteButtonLocator = By.xpath("//tbody[@id='tbodyid']/tr/td[4]/a");
		By txtTotalLocator = By.id("totalp");

		List<WebElement> deleteButtons = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(deleteButtonLocator));

		while (true) {
			WebElement txtTotalElement = Driver.getWebDriver().findElement(txtTotalLocator);
			boolean isTotalDisplayed = txtTotalElement.isDisplayed();
			boolean isTotalEmpty = txtTotalElement.getText().trim().isEmpty();

			if (!isTotalDisplayed || isTotalEmpty) {
				break;
			}

			deleteButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(deleteButtonLocator));

			WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(deleteButtonLocator));
			deleteButton.click();

			wait.until(ExpectedConditions.invisibilityOf(deleteButton));

			wait.until(ExpectedConditions.invisibilityOfElementLocated(txtTotalLocator));
		}
	}

	public static int mapValues() {
		List<WebElement> rows = page.getRows();
		int sum = 0;
		for (WebElement row : rows) {
			String valueText = row.findElement(By.xpath("./td[3]")).getText();
			try {
				int value = Integer.parseInt(valueText);
				sum += value;
			} catch (NumberFormatException e) {
				System.out.println("Valor não pôde ser convertido para inteiro: " + valueText);
			}
		}

		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(page.getTxtTotalWeb(), Integer.toString(sum)));
		System.out.println("Soma dos valores na tabela: " + sum);
		return sum;
	}

	public static void bothValue() {
		int systemValue = mapValues();
		WebElement valueHome = page.getTxtTotalWeb();
		String valueHomeText = valueHome.getText();
		if (!valueHomeText.isEmpty()) {
			int valueHomeInt = Integer.parseInt(valueHomeText);
			Utility.timeWait(page.getTxtTotalWeb());
			Assert.assertNotEquals(systemValue, valueHomeInt);
		}
	}

	public static void ValueAfterDelete() {
		int systemValuesBefore = mapValues();
		deleteItem();
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementValue(page.getTxtTotalWeb(),
				Integer.toString(systemValuesBefore))));
		FluentWait<WebDriver> time = new FluentWait<>(Driver.getWebDriver()).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		time.until(driver -> {
			WebElement totalElement = page.getTxtTotalWeb();
			String totalValue = totalElement.getText().trim();
			return !totalValue.isEmpty() && Integer.parseInt(totalValue) != systemValuesBefore;
		});

		int systemValuesAfter = mapValues();
		System.out.println("Soma dos valores antes da exclusão: " + systemValuesBefore);
		System.out.println("Resultado final após a exclusão: " + systemValuesAfter);
		Assert.assertNotEquals("A soma dos valores antes da exclusão é igual à soma após a exclusão.",
				systemValuesBefore, systemValuesAfter);
	}
}
