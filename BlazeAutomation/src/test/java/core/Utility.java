package core;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static void activeScroll(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
		JavascriptExecutor jse = (JavascriptExecutor) Driver.getWebDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public static void timeSelenium(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
		text.click();
	}

	public static void timeWait(WebElement text) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));

	}

	public static void alertIsPresent() {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void clickRandon(List<WebElement> item) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
		List<WebElement> List = item;
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
