package core;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static void activeScroll(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
		JavascriptExecutor jse = (JavascriptExecutor) Driver.getWebDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public static void timeClick(WebElement Element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Element));
		Element.click();

	}

	public static void timeOnly(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}

	public static void timeWait(WebElement element) {
		Driver.getWebDriver().navigate().refresh();
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		System.out.println("Aguardando até que o elemento seja clicável...");
		wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("Elemento clicável encontrado!");

	}

	public static void alertIsPresent(String text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = Driver.getWebDriver().switchTo().alert();
		if (alert.getText().equals(text)) {
			Assert.assertEquals(text, alert.getText());
			alert.accept();
		}
	}

	public static void clickButtonJs(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getWebDriver();
		jsExecutor.executeScript("arguments[0].click();", element);
	}

	public static void clickRandon(List<WebElement> element) {
		List<WebElement> List = element;
		int Elements = List.size();
		if (Elements > 0) {
			int randomIndex = new Random().nextInt(Elements);
			WebElement randomElement = List.get(randomIndex);
			randomElement.click();
			System.out.println("Clique em alguns itens " + randomElement.getText());
		} else {
			System.out.println("Nenhum elemento encontrado na lista ");
		}
	}

}