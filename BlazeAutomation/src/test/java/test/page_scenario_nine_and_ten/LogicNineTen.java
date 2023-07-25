package test.page_scenario_nine_and_ten;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

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
		Utility.timeSelenium(page.getTxtAnyItems());

	}

	public static void deleteItem() {
		Utility.activeScroll(page.getBtnDelete());

	}

	public static boolean noItems() {
		WebElement txtTotal = page.getTxtTotal();
		String text = txtTotal.getText().trim();
		return text.isEmpty();
	}

	public static int mapValues() {
		WebElement tbody = page.getTbody();

		tbody = page.getTbody();

		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		int sum = 0;

		for (WebElement row : rows) {
			String valueText = row.findElement(By.xpath("./td[3]")).getText();
			int value = Integer.parseInt(valueText);
			sum += value;
		}
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(page.getTxtTotal(), Integer.toString(sum)));
		System.out.println("Soma dos valores na tabela: " + sum);
		return sum;
	}

	public static void bothValue() {
		int systemValue = mapValues();
		WebElement valueHome = page.getTxtTotal();
		String valueHomeText = valueHome.getText().trim();

		if (!valueHomeText.isEmpty()) {
			int valueHomeInt = Integer.parseInt(valueHomeText);
			Utility.timeWait(page.getTxtTotal());
			Assert.assertNotEquals(systemValue, valueHomeInt);
		} else {
			System.out.println("Valor na página após a exclusão não está disponível.");

		}
	}

	public static void ValueAfterDelete() {
		Utility.timeWait(page.getTxtTotal());
		int systemValuesBefore = mapValues();

		deleteItem();

		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.textToBePresentInElement(page.getTxtTotal(), Integer.toString(systemValuesBefore)));

		FluentWait<WebDriver> wait1 = new FluentWait<>(Driver.getWebDriver()).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		wait1.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement totalElement = page.getTxtTotal();
				String totalValue = totalElement.getText().trim();
				return !totalValue.isEmpty() && Integer.parseInt(totalValue) != systemValuesBefore;
			}
		});

		int systemValuesAfter = mapValues();

		System.out.println("Soma dos valores antes da exclusão: " + systemValuesBefore);
		System.out.println("Resultado final após a exclusão: " + systemValuesAfter);

		Assert.assertNotEquals("A soma dos valores antes da exclusão é igual à soma após a exclusão.",
				systemValuesBefore, systemValuesAfter);
	}
}
