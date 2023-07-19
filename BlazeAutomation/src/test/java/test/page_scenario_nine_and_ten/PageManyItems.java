package test.page_scenario_nine_and_ten;


import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PageManyItems {

	public PageManyItems() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='itemc'][position() < 4]")
	private List<WebElement> btnCategory;
//	
//	@FindBy(how = How.XPATH, using = "//a[@id='itemc' and contains(text(),'Phones')]")
//	private WebElement btnPhones;
//	
//	@FindBy(how = How.XPATH, using = "//a[@id='itemc' and contains(text(),'Monitors')]")
//	private WebElement btnMonitor;

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
	
	@FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']//td[3]")
	private List<WebElement> txtMapValues;
	
	@FindBy(how = How.ID, using = "totalp")
	private WebElement txtTotal;

	

	public WebElement getBtnCategory() {
		 Random random = new Random();
	        int randomIndex = random.nextInt(btnCategory.size());
	        return btnCategory.get(randomIndex);
		
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

	public List<WebElement> getTxtMapValues() {
		return txtMapValues;
	}
	public WebElement getTxtTotal() {
		return txtTotal;
	}

}
