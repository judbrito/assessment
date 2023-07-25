package test.page_scenario_eleven_twelve;

import org.openqa.selenium.WebElement;

import core.MassaDados;
import core.Utility;

public class Modal {

	private String getName;
	private String getCountry;
	private String getCity;
	private String getCreditcard;
	private String getMonth;
	private String getYear;

	static MassaDados dados = new MassaDados("./src/test/resources/massaDados.xlsx", "dados");

	public String getGetName() {
		this.getName = dados.obterValor("ID_0012", 1);
		return getName;
	}

	public String getGetCountry() {
		this.getCountry = dados.obterValor("ID_0012", 2);
		return getCountry;
	}

	public String getGetCity() {
		this.getCity = dados.obterValor("ID_0012", 3);
		return getCity;
	}

	public String getGetCreditcard() {
		this.getCreditcard = dados.obterValor("ID_0012", 4);
		return getCreditcard;
	}

	public String getGetMonth() {
		this.getMonth = dados.obterValor("ID_0012", 5);
		return getMonth;
	}

	public String getGetYear() {
		this.getYear = dados.obterValor("ID_0012", 6);
		return getYear;
	}

	public void writeText(WebElement element, String text) {
		Utility.timeSelenium(element);
		Utility.activeScroll(element);
		element.sendKeys(text);
	}
}
