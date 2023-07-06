package test.page_scenario_three_and_four;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;


class PageRegisterValidation {

	public PageRegisterValidation() {
		PageFactory.initElements(Driver.getWebDriver(), this);

	}
	
	@FindBy(how = How.XPATH, using = "//a[@id='signin2']")
	private WebElement btnSingModal;	

	@FindBy(how = How.ID, using = "sign-username")
	private WebElement txtSignUser;
		
	@FindBy(how = How.ID, using = "sign-password")
	private WebElement txtSignPassword;
	
	@FindBy(how = How.XPATH, using = "//div[@id='signInModal']//span")
	private WebElement btnClose;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary' and text()='Sign up']")
	private WebElement btnSingSubmit;
	
	public WebElement getBtnSingModal() {
		return btnSingModal;
	}
	
	public WebElement getClose() {
		return btnClose;
	}

	public WebElement getTxtSignUser() {
		LogicThreeFour.timeSelenium(txtSignUser);
		return txtSignUser;
	}

	public WebElement getTxtSignPassword() {
		return txtSignPassword;
	}
	public WebElement getBtnSingSubmit() {
		return btnSingSubmit;
	}
}
