package test.page_scenario_eleven_twelve;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
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

public class LogicElevenTwelve {
	private static final PagePricePay page = new PagePricePay();

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

	public static void deleteItems() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@id='tbodyid']/tr/td[4]/a")));

		List<WebElement> deleteButtons = page.getbtnDelete();

		while (!deleteButtons.isEmpty()) {
			// Clicar no primeiro botão "Delete" encontrado na página
			WebElement deleteButton = deleteButtons.get(0);
			wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
			deleteButton.click();

			// Aguardar até que o botão "Delete" desapareça da página
			wait.until(ExpectedConditions.stalenessOf(deleteButton));

			// Aguardar até que pelo menos um novo botão "Delete" esteja presente na página
			wait.until(
					ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@id='tbodyid']/tr/td[4]/a")));

			// Atualizar a lista de botões após a exclusão
			deleteButtons = page.getbtnDelete();
		}
	}

	public static void clickPhones() {
		Driver.getWebDriver().navigate().refresh();
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(page.getBtnPhones())).click();
		System.out.println("Clique em Monitor");
	}

	public static void countElement() {

		WebElement tbody = Driver.getWebDriver().findElement(By.id("tbodyid"));

		List<WebElement> rows = tbody.findElements(By.tagName("tr"));

		System.out.println("Número de produtos " + rows.size());

	}

	public static void update() {
		Driver.getWebDriver().navigate().refresh();
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(5));
		List<String> myList = new ArrayList<>();
		myList.add("Elemento 1");
		myList.add("Elemento 2");
		myList.add("Elemento 3");

		String element = myList.get(1);
		System.out.println(element);
	}

}