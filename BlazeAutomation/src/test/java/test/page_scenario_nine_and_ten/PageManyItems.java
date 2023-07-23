package test.page_scenario_nine_and_ten;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PageManyItems {

	public PageManyItems() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='itemc'][position() < 5]")
	private List<WebElement> btnCategory;

	@FindBy(how = How.XPATH, using = "//a[@class='hrefch'][position() < 5]")
	private WebElement txtAnyItems;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg' and contains(text(), 'Add to cart')]")
	private WebElement txtAddCart;

	@FindBy(how = How.ID, using = "cartur")
	private WebElement btnCart;

	@FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']//td[contains(text(), 'monitor')]")
	private WebElement txtConfirmProduct;

	@FindBy(how = How.XPATH, using = "//a[@class= 'nav-link' and contains(text(), 'Home ')]")
	private WebElement btnHome;

	@FindBy(how = How.XPATH, using = "//tbody//td[contains(text(), 'monitor')]")
	private WebElement txtCartMonitor;

	@FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr//td[3]")
	private WebElement txtMapValues;

	@FindBy(how = How.ID, using = "totalp")
	private WebElement txtTotal;

	@FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr[1]/td[4]/a")
	private WebElement btnDelete;

	@FindBy(how = How.ID, using = "//tbody[@id='tbodyid']/tr")
	private List<WebElement> txtProducts;

	public List<WebElement> getBtnCategory() {
		return btnCategory;

	}

	public WebElement getTxtAnyItems() {
		return txtAnyItems;
	}

	public WebElement getTxtAddCart() {
		return txtAddCart;
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

	public WebElement getTxtMapValues() {
		return txtMapValues;
	}

	public WebElement getTxtTotal() {
		return txtTotal;
	}

	public WebElement getbtnDelete() {
		return btnDelete;
	}

	public List<WebElement> getProducts() {
		return txtProducts;
	}

}
