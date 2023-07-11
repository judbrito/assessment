test.page
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.Driver;
import test.page_scenario_seven_and_eigth.PageLaptosMonitor;

public class LogicSevenEight {
    private static PageLaptosMonitor page = new PageLaptosMonitor();

    public static void clickLaptops() {
        activeScroll(page.getBtnLaptops());
        System.out.println("Clique em Laptops");
    }

    public static void selectDell() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getWebDriver();
        WebElement dellElement = null;
        boolean elementoEncontrado = false;
        int scrollHeight = 0;
        int previousScrollHeight = -1;

        while (!elementoEncontrado && scrollHeight != previousScrollHeight) {
            previousScrollHeight = scrollHeight;
            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

            try {
                dellElement = page.getTxtDell();
                if (dellElement.isDisplayed()) {
                    elementoEncontrado = true;
                }
            } catch (NoSuchElementException e) {
             
            }

            scrollHeight = Integer.parseInt(jsExecutor.executeScript("return window.scrollY").toString());
        }

        if (elementoEncontrado) {
            dellElement.sendKeys(Keys.PAGE_DOWN);
            dellElement.click();
            System.out.println("Escolha Dell: " + dellElement.getText());
        } else {
            System.out.println("Elemento Dell não encontrado ou não está visível após rolar o scroll.");
        }
    }


    public static void addToCart() {
        page.getTxtProduto().click();
    }

    public static void confirmProduct() {
        page.getTxtValidation().click();
    }

    public static void timeSelenium(WebElement text) {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(text));
    }

    public static void activeScroll(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getWebDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
