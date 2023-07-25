package test.page_scenario_eleven_twelve;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PagePricePay {

	public PagePricePay() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='itemc'][position() < 4]")
	private WebElement btnCategory;

	@FindBy(how = How.XPATH, using = "//a[@id='itemc' and contains(text(),'Phones')]")
	private WebElement btnPhones;

	@FindBy(how = How.XPATH, using = "//a[@class='hrefch'][position() < 4]")
	private WebElement txtRandonItem;

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
	private List<WebElement> btnDelete;

	@FindBy(how = How.ID, using = "//tbody[@id='tbodyid']/tr")
	private List<WebElement> txtProducts;

	@FindBy(how = How.ID, using = "//tbody[@id='tbodyid']/tr//td[3]")
	private List<WebElement> txtUpdate;

	@FindBy(how = How.CLASS_NAME, using = "btn-success")
	private WebElement btnPlaceOrder;

	@FindBy(how = How.ID, using = "name")
	private WebElement txtName;

	@FindBy(how = How.ID, using = "country")
	private WebElement txtCountry;

	@FindBy(how = How.ID, using = "city")
	private WebElement txtCity;

	@FindBy(how = How.ID, using = "card")
	private WebElement txtCreditcard;

	@FindBy(how = How.ID, using = "month")
	private WebElement txtMonth;

	@FindBy(how = How.ID, using = "year")
	private WebElement txtYear;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Purchase')]")
	private WebElement btnPurchase;

	@FindBy(how = How.CLASS_NAME, using = "//div[@class='sa-confirm-button-container']//button[contains(text(),'OK')]")
	private WebElement btnOk;
	@FindBy(how = How.ID, using = "//h2[contains(text(),'Thank you for your purchase!')]")
	private WebElement txtThanksMessage;

	public WebElement getTxtCategory() {
		return txtThanksMessage;
	}

	public WebElement getBtnCategory() {
		return btnCategory;
	}

	public WebElement getBtnPhones() {
		return btnPhones;
	}

	public WebElement getTxtRandonItem() {
		return txtRandonItem;
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

	public List<WebElement> getBtnDelete() {
		return btnDelete;
	}

	public List<WebElement> getTxtProducts() {
		return txtProducts;
	}

	public List<WebElement> getTxtUpdate() {
		return txtUpdate;
	}

	public WebElement getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtCreditcard() {
		return txtCreditcard;
	}

	public WebElement getTxtMonth() {
		return txtMonth;
	}

	public WebElement getTxtYear() {
		return txtYear;
	}

	public WebElement getBtnPurchase() {
		return btnPurchase;
	}

	public WebElement getBtnOk() {
		return btnOk;
	}

}
