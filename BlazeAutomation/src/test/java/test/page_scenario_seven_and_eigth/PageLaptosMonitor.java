package test.page_scenario_seven_and_eigth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PageLaptosMonitor {

	public PageLaptosMonitor() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='itemc'and contains(text(), 'Laptops')]")
	private WebElement btnLaptops;

	@FindBy(how = How.XPATH, using = "//h4[@class='card-title']//a[contains(text(), 'Dell')]")
	private WebElement txtDell;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg' and contains(text(), 'Add to cart')]")
	private WebElement txtProduct;
	
	@FindBy(how = How.XPATH, using = "//a[@id='itemc'and contains(text(), 'Monitor')]")
		private WebElement btnMonitor;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class, 'col-lg-4') and contains(@class, 'col-md-6') and contains(@class, 'mb-4')])[1]")
	private WebElement txtFirstElement;
	
	public WebElement getFirstElement() {
		return txtFirstElement;
	}
	
	public WebElement getBtnLaptops() {
		return btnLaptops;
	}
	
	public WebElement getBtnMonitor() {
		return btnMonitor;
	}

	public WebElement getTxtDell() {
		return txtDell;
	}

	public WebElement getTxtProduct() {
		return txtProduct;
	}
}
