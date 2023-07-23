package test.page_scenario_one_and_two;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PageLoginLogout {

	public PageLoginLogout() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.ID, using = "login2")
	private WebElement btnUser;

	@FindBy(how = How.ID, using = "loginusername")
	private WebElement txtUser;

	@FindBy(how = How.ID, using = "loginpassword")
	private WebElement txtPassword;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary' and text()='Log in']")
	private WebElement btnSubmitUser;

	@FindBy(how = How.ID, using = "nameofuser")
	private WebElement txtValidationOn;

	@FindBy(how = How.ID, using = "login2")
	private WebElement txtValidationOff;

	@FindBy(how = How.ID, using = "logout2")
	private WebElement btnLogout;

	public WebElement getBtnUser() {
		return btnUser;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnSubmit() {
		return btnSubmitUser;
	}

	public WebElement getTxtValidationOn() {
		return txtValidationOn;
	}

	public WebElement getTxtValidationOff() {
		return txtValidationOff;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

}