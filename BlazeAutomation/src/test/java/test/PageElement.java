package test;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;

public class PageElement {

	public PageElement() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	@FindBy(how = How.ID, using = "login2")
	private WebElement btnUser;

	@FindBy(how = How.ID, using = "loginusername")
	private WebElement txtUser;

	@FindBy(how = How.ID, using = "loginpassword")
	private WebElement txtPassword;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary' and text()='Log in']")
	private WebElement btnLogin;

	@FindBy(how = How.ID, using = "nameofuser")
	private WebElement txtValidation;

	public WebElement getBtnUser() {
		return btnUser;
	}

	public WebElement getTxtUser() {
		time(txtUser);
		return txtUser;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtValidation() {
		return txtValidation;
	}

	public void time(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}