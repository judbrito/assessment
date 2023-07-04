package test.page_scenario_one_and_two;

import core.MassaDados;

public class Modal {

	private String getEmail;
	private String getPassWord;

	
	static MassaDados dados = new MassaDados("./src/test/resources/massaDados.xlsx", "dados");


	public String getEmail() {
		this.getEmail = dados.obterValor("ID_0001", 1);
		return getEmail;

	}
	
	public String getPassWord() {
		this.getPassWord = dados.obterValor("ID_0001", 2);
		return getPassWord;
	}
}
