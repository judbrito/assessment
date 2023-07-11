package test.page_scenario_seven_and_eigth;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.Driver;


public class LogicSevenEight {
    private static PageLaptosMonitor page = new PageLaptosMonitor();

    public static void clickLaptops() {
        activeScroll(page.getBtnLaptops());
        System.out.println("Clique em Laptops");
    }

    public static void selectDell() {
    	activeScroll(page.getTxtDell());
    	  System.out.println("selecionou dell");
    }


    public static void addToCart() {
        timeSelenium(page.getTxtProduct());        
        System.out.println("Adicionando ao carrinho");
        
    }

    public static void sentMessage() {
		try {
			Alert alert = Driver.getWebDriver().switchTo().alert();
			String alertText = alert.getText();
			Assert.assertEquals("Product added.", alertText);
			alert.accept();
		    System.out.println("assertou");
		} catch (NoAlertPresentException e) {

		}
	}
    public static void clickMonitor() {
        activeScroll(page.getBtnMonitor());
        System.out.println("Clique em monitor");
    }
    public static void firstItem() {
        activeScroll(page.getFirstElement());
        System.out.println("Clique em monitor");
    }
  
    
    
       public static void activeScroll(WebElement element) {
        while (true) {
            try {
                element.click();
                break;
            } catch (Exception e) {
                JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getWebDriver();
                jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                break;
            }
            
        }
    }
       public static void timeSelenium(WebElement text) {
           WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(text));
           text.click();
           wait.until(ExpectedConditions.alertIsPresent());
       }
}
