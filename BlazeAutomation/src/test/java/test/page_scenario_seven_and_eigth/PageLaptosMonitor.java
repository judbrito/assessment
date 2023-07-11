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
		@FindBy(how = How.XPATH, using ="//a[@id='itemc'and contains(text(), 'Laptops')]")
		private WebElement btnLaptops;  

		@FindBy(how = How.XPATH, using = "//h4[@class='card-title']//a[contains(text(), 'Dell')]")
		private WebElement txtDell;

		@FindBy(how = How.XPATH, using = "//h2[@class='hrefch'and contains(text(), 'Dell')]")
		private WebElement txtProduto;
		
		@FindBy(how = How.XPATH, using = "//h2[@class='name'and contains(text(), 'Dell')]")
		private WebElement txtValidation;
		
		@FindBy(how = How.LINK_TEXT, using = "hrefch")
		private WebElement txtValidationOn;

		public WebElement getBtnLaptops() {
			return btnLaptops;
		}

		public WebElement getTxtDell() {
			return txtDell;
		}

		public WebElement getTxtProduto() {
			return txtProduto;
		}

		public WebElement getTxtValidation() {
			return txtValidation;
		}

		public WebElement getTxtValidationOn() {
			return txtValidationOn;
		}

	}
