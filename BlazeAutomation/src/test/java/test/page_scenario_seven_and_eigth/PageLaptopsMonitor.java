package test.page_scenario_seven_and_eigth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PageLaptopsMonitor {

	public PageLaptopsMonitor() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='itemc'and contains(text(), 'Laptops')]")
	private WebElement btnLaptops;

	@FindBy(how = How.XPATH, using = "//a[@id='itemc' and contains(text(),'Monitors')]")
	private WebElement btnMonitor;

	@FindBy(how = How.XPATH, using = "//h4[@class='card-title']//a[contains(text(), 'Dell') or contains(text(), 'monitor')]")
	private WebElement txtSelectMonitor;

	@FindBy(how = How.XPATH, using = "//h2[@class='name' and contains(text(), 'Dell')]")
	private WebElement txtDell;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg' and contains(text(), 'Add to cart')]")
	private WebElement txtAddCart;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class, 'col-lg-4')])[1]//a[contains(text(), 'monitor')]")
	private WebElement txtFirstElement;

	@FindBy(how = How.ID, using = "cartur")
	private WebElement btnCart;

	@FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr/td[2]")
	private WebElement txtConfirmProduct;

	@FindBy(how = How.XPATH, using = "//a[@class= 'nav-link' and contains(text(), 'Home ')]")
	private WebElement btnHome;

	@FindBy(how = How.XPATH, using = "//tbody//td[contains(text(), 'monitor')]")
	private WebElement txtCartMonitor;

	public WebElement getBtnLaptops() {
		return btnLaptops;
	}

	public WebElement getBtnMonitor() {
		return btnMonitor;
	}

	public WebElement getTxtSelectMonitor() {
		return txtSelectMonitor;
	}

	public WebElement getTxtDell() {
		return txtDell;
	}

	public WebElement getTxtAddCart() {
		return txtAddCart;
	}

	public WebElement getTxtFirstElement() {
		return txtFirstElement;
	}

	public WebElement getBtnCart() {
		return btnCart;
	}

	public WebElement getTxtConfirmProduct() {
		return txtConfirmProduct;
	}

	public WebElement getBtnHome() {
		return btnHome;
	}

	public WebElement getTxtCartMonitor() {
		return txtCartMonitor;
	}

}
