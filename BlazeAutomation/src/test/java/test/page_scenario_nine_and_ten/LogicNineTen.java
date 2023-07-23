package test.page_scenario_nine_and_ten;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

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

	public static void deleteItem() {
		activeScroll(page.getbtnDelete());

	}

	public static boolean noItems() {
		WebElement txtTotal = page.getTxtTotal();
		String text = txtTotal.getText().trim();
		return text.isEmpty();
	}

	public static int mapValues() {
		activeScroll(page.getTxtMapValues());
		WebElement tbody = Driver.getWebDriver().findElement(By.id("tbodyid"));
		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		int soma = 0;

		for (WebElement row : rows) {
			String valorTexto = row.findElement(By.xpath("./td[3]")).getText();
			int valor = Integer.parseInt(valorTexto);
			soma += valor;
		}

		System.out.println("Soma dos valores na tabela: " + soma);
		return soma;
	}

	public static void activeScroll(WebElement element) {

		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
		JavascriptExecutor jse = (JavascriptExecutor) Driver.getWebDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

}