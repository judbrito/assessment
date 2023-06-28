package test;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BlazeSteps {

	@Dado("que acesso o site")
	public void queAcessoOSite() {
		BusinessLogic.acess();
	}

	@Dado("acesso o painel de login")
	public void acessoOPainelDeLogin() {
		BusinessLogic.clickModal();
	}

	@Quando("digito o usuário")
	public void digitoOUsuário() {
		BusinessLogic.whiteUser();

	}

	@Quando("a senha")
	public void aSenha() {
		BusinessLogic.whitePassword();
	}

	@Quando("clico no botão de logar")
	public void clicoNoBotãoDeLogar() {
		BusinessLogic.clickBtnLogin();
	}

	@Então("confirmo o usuario logado")
	public void confirmoOUsuarioLogado() {
		BusinessLogic.validation();

	}
}
