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

	@FindBy(how = How.XPATH, using = "//input[@id='sign-password']")
	private WebElement txtSignPassword;

	@FindBy(how = How.XPATH, using = "//h5[@id='signInModalLabel' and text()='Sign up']//..//span")
	private WebElement btnClose;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary' and text()='Sign up']")
	private WebElement btnSingSubmit;

	public WebElement getBtnSingModal() {
		return btnSingModal;
	}

	public WebElement getTxtSignUser() {
		return txtSignUser;
	}

	public WebElement getTxtSignPassword() {
		return txtSignPassword;
	}

	public WebElement getBtnClose() {
		return btnClose;
	}

	public WebElement getBtnSingSubmit() {
		return btnSingSubmit;
	}

}
