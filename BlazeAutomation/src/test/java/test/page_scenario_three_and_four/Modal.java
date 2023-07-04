package test.page_scenario_three_and_four;

import core.MassaDados;

public class Modal {

	private String getSignEmail;
	private String getSignPassWord;

	static MassaDados dados = new MassaDados("./src/test/resources/massaDados.xlsx", "dados");

	public String getSignUser() {
		this.getSignEmail = dados.obterValor("ID_0003", 1);
		return getSignEmail;

	}

	public String getSignPasword() {
		this.getSignPassWord = dados.obterValor("ID_0003", 2);
		return getSignPassWord;
	}
}
