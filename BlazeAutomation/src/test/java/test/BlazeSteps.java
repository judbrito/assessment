package test;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.page_scenario_five_and_six.LogicFiveSix;
import test.page_scenario_one_and_two.LogicOneTwo;
import test.page_scenario_seven_and_eigth.LogicSevenEight;
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

	@Quando("clico no botão submit")
	public void clicoNoBotãoSubmit() {
		LogicThreeFour.clickSingSubmit();
	}

	@Então("valido a mensagem conta nova")
	public void validoAMensagemContaNova() {
		LogicThreeFour.signSucessful();
	}

	@Então("valido a mensagem conta existente")
	public void validoAMensagemContaExistente() {
		LogicThreeFour.signUnsuccessful();
	}

	@Dado("que clico em About Us")
	public void queClicoEmAboutUs() {
		LogicFiveSix.clickAbout();
	}

	@Quando("clico em play")
	public void clicoEmPlay() {
		LogicFiveSix.clickPlay();
	}

	@Quando("o video inicia")
	public void oVideoInicia() {
		LogicFiveSix.videoProgress();
	}

	@Então("confirmo video andamento")
	public void confirmoVideoAndamento() {
		LogicFiveSix.videoClosed();
	}

	@Dado("que clico em contato")
	public void queClicoEmContato() {
		LogicFiveSix.clickContact();
	}

	@Quando("escrevo o email")
	public void escrevoOEmail() {
		LogicFiveSix.writeEmail();
	}

	@Quando("escrevo o nome")
	public void escrevoONome() {
		LogicFiveSix.writeName();
	}

	@Quando("escrevo a mensagem")
	public void escrevoAMensagem() {
		LogicFiveSix.writeMessage();
	}

	@Quando("clico em enviar mensagem")
	public void clicoEmEnviarMensagem() {
		LogicFiveSix.clickSendMessage();
	}

	@Quando("valido envio da mensagem")
	public void validoEnvioDaMensagem() {
		LogicFiveSix.sentMessage();
	}

	@Quando("que clico em laptops")
	public void queClicoEmLaptops() {
		LogicSevenEight.clickLaptops();
	}

	@Quando("confirmo a marca")
	public void confirmoAMarca() {
		LogicSevenEight.selectDell();
	}

	@Quando("adiciono no carrinho")
	public void adicionoNoCarrinho() {
		LogicSevenEight.addToCart();
	}

	@Então("confirmo o produto")
	public void confirmoOProduto() {
		LogicSevenEight.sentMessage();
	}
	@Quando("que clico em monitors")
	public void queClicoEmMonitors() {	
		LogicSevenEight.clickMonitor();
	}
	@Quando("seleciono o primeiro item")
	public void selecionoOPrimeiroItem() {
		
	}
}
