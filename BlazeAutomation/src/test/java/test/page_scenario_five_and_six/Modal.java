package test.page_scenario_five_and_six;

import core.MassaDados;

public class Modal {

	private String getEmail;
	private String getName;
	private String getMessage;

	
	static MassaDados dados = new MassaDados("./src/test/resources/massaDados.xlsx", "dados");


	public String getEmail() {
		this.getEmail = dados.obterValor("ID_0006", 1);
		return getEmail;

	}

	public String getGetName() {
		this.getEmail = dados.obterValor("ID_0006", 2);
		return getName;
	
	}

	public String getGetMessage() {
		this.getMessage = dados.obterValor("ID_0006", 3);
		return getMessage;
	}	
	
}
