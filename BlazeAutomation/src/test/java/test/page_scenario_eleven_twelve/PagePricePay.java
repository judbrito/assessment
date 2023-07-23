package test.page_scenario_eleven_twelve;

import java.util.List;
import java.util.Random;

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
	private List<WebElement> btnCategory;

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
	private WebElement getName;

	@FindBy(how = How.ID, using = "country")
	private WebElement getCountry;

	@FindBy(how = How.ID, using = "city")
	private WebElement getCity;

	@FindBy(how = How.ID, using = "card")
	private WebElement getCreditcard;

	@FindBy(how = How.CLASS_NAME, using = "month")
	private WebElement getMonth;

	@FindBy(how = How.CLASS_NAME, using = "year")
	private WebElement getYear;

	@FindBy(how = How.CLASS_NAME, using = "btn-primary")
	private WebElement btnOk;

	public WebElement getBtnCategory() {
		Random random = new Random();
		int randomIndex = random.nextInt(btnCategory.size());
		return btnCategory.get(randomIndex);

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

	public WebElement getGetName(String string) {
		return getName;
	}

	public WebElement getGetCountry(String string) {
		return getCountry;
	}

	public WebElement getGetCity(String string) {
		return getCity;
	}

	public WebElement getGetCreditcard(String string) {
		return getCreditcard;
	}

	public WebElement getGetMonth(String string) {
		return getMonth;
	}

	public WebElement getGetYear(String string) {
		return getYear;
	}

	public WebElement getBtnOk() {
		return btnOk;
	}
}
