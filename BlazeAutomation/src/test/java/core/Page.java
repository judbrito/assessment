package core;

public class Page {

	public static void webSite(String texto) {
		Driver.getWebDriver().get(texto);
	}
}
