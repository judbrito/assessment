package test.page_scenario_five_and_six;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Driver;

class PageVideoContact {

	public PageVideoContact() {
		PageFactory.initElements(Driver.getWebDriver(), this);

	}
	
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link' and text()='About us']")
	private WebElement btnAbout;	

	@FindBy(how = How.ID, using = "example-video_html5_api")
	private WebElement txtVideo;
		
	@FindBy(how = How.CLASS_NAME, using = "vjs-big-play-button")
	private WebElement btnPlay;
		
	@FindBy(how = How.XPATH, using = "//div[@id='videoModal']//span")
	private WebElement btnClose;
	
	@FindBy(how = How.LINK_TEXT, using = "Contact")
	private WebElement btnContact;	

	@FindBy(how = How.ID, using = "recipient-email")
	private WebElement txtEmail;
		
	@FindBy(how = How.ID, using = "recipient-name")
	private WebElement txtName;
		
	@FindBy(how = How.ID, using = "message-text")
	private WebElement txtMessage;
	
	@FindBy(how = How.CLASS_NAME, using = "btn-primary")
	private WebElement btnSend;

	public WebElement getBtnAbout() {
		return btnAbout;
	}

	public WebElement getTxtVideo() {
		return txtVideo;
	}

	public WebElement getBtnPlay() {
		return btnPlay;
	}

	public WebElement getBtnClose() {
		return btnClose;
	}

	public WebElement getBtnContact() {
		return btnContact;
	}

	public WebElement getTxtEmail(String string) {
		return txtEmail;
	}

	public WebElement getTxtName(String string) {
		return txtName;
	}

	public WebElement getTxtMessage(String string) {
		return txtMessage;
	}
	
	public WebElement getBtnSend() {
		return btnSend;
	}
	}
