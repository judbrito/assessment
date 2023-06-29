package test;

import core.MassaDados;

public class Modal {

	private String email;
	private String senha;

	static MassaDados dados = new MassaDados("./src/test/resources/massaDados.xlsx", "dados");

	public void senha() {
		String id = "ID_0001";
		int parametroIndex = 2;
		String valorParametro = dados.obterValor(id, parametroIndex);
		System.out.println("Valor do parâmetro: " + valorParametro);
		this.senha = valorParametro;

	}

	public String getEmail() {
		String id = "ID_0001";
		int parametroIndex = 1;
		String valorParametro = dados.obterValor(id, parametroIndex);
		System.out.println("Valor do parâmetro: " + valorParametro);
		this.email = valorParametro;
		System.out.println("Valor do email: " + email);
		return email;
	}

	public String getSenha() {
		String id = "ID_0001";
		int parametroIndex = 2;
		String valorParametro = dados.obterValor(id, parametroIndex);
		System.out.println("Valor do parâmetro: " + valorParametro);
		this.senha = valorParametro;
		System.out.println("Valor do senha: " + senha);
		dados.close();
		return senha;

	}

}
