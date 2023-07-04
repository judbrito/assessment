package test;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.page_scenario_one_and_two.LogicOneTwo;
import test.page_scenario_three_and_four.LogicThreeFour;

public class BlazeSteps {
	
	@Dado("que acesso o site")
	public void queAcessoOSite() {
		LogicOneTwo.acess();
	}

	@Dado("acesso o painel de login")
	public void acessoOPainelDeLogin() {
		LogicOneTwo.clickLogin();
	}

	@Quando("digito o usuário")
	public void digitoOUsuário() {
		LogicOneTwo.writeUser();

	}

	@Quando("a senha")
	public void aSenha() {
		LogicOneTwo.writePassword();
	}

	@Quando("clico no botão de logar")
	public void clicoNoBotãoDeLogar() {
		LogicOneTwo.Submit();
	}

	@Então("confirmo o usuario logado")
	public void confirmoOUsuarioLogado() {
		LogicOneTwo.emailOn();
	}

	@Dado("que clico em logout")
	public void queClicoEmLogout() {
		LogicOneTwo.logout();
	}

	@Então("valido login ausente")
	public void validoLoginAusente() {
		LogicOneTwo.emailOff();
	}

	@Dado("que clico em sing Up")
	public void queClicoEmSingUp() {
		LogicThreeFour.clickSingModal();
	}

	@Quando("digito o usuário novo")
	public void digitoOUsuárioNovo() {
		LogicThreeFour.writeSingUser();
	}

	@Quando("a nova senha")
	public void aNovaSenha() {
		LogicThreeFour.writeSingPassword();
	}

	@Então("valido a mensagem conta existente")
	public void validoAMensagemContaExistente() {
		LogicThreeFour.clickSing();
	}

}
