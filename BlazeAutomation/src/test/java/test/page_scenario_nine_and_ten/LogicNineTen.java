package test.page_scenario_nine_and_ten;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		Utility.activeScroll(page.getbtnDelete());

	}

	public static boolean noItems() {
		WebElement txtTotal = page.getTxtTotal();
		String text = txtTotal.getText().trim();
		return text.isEmpty();
	}

	public static int mapValues() {
		Utility.activeScroll(page.getTxtMapValues());
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

}