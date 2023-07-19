package test;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.page_scenario_five_and_six.LogicFiveSix;
import test.page_scenario_nine_and_ten.LogicNineTen;
import test.page_scenario_one_and_two.LogicOneTwo;
import test.page_scenario_seven_and_eigth.LogicSevenEight;
import test.page_scenario_three_and_four.LogicThreeFour;

public class BlazeSteps {

	@Dado("que acesso o site")
	public void queAcessoOSite() {
		LogicOneTwo.access();
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

	@Então("confirmo o usuário logado")
	public void confirmoOUsuárioLogado() {
		LogicOneTwo.emailOn();
	}

	@Dado("que clico em logout")
	public void queClicoEmLogout() {
		LogicOneTwo.logout();
	}

	@Então("valido o login ausente")
	public void validoOLoginAusente() {
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

	@Então("confirmo o video andamento")
	public void confirmoOVideoAndamento() {
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

	@Então("valido o envio da mensagem")
	public void validoOEnvioDaMensagem() {
		LogicFiveSix.sentMessage();
	}

	@Quando("clico em laptops")
	public void clicoEmLaptops() {
		LogicSevenEight.clickLaptop();
	}

	@Quando("confirmo a marca")
	public void confirmoAMarca() {
		LogicSevenEight.selectDell();
	}

	@Quando("adiciono no carrinho")
	public void adicionoNoCarrinho() {
		LogicSevenEight.addToCart();
	}

	@Quando("confirmo o produto")
	public void confirmoOProduto() {
		LogicSevenEight.sentMessage();
	}

	@Então("retorno a página inicial")
	public void retornoAPáginaInicial() {
		LogicSevenEight.clickHome();
	}

	@Quando("clico em monitors")
	public void clicoEmMonitors() {
		LogicSevenEight.clickMonitor();
	}

	@Quando("seleciono o primeiro item")
	public void selecionoOPrimeiroItem() {
		LogicSevenEight.firstItem();
	}

	@Quando("clico em cart")
	public void clicoEmCart() {
		LogicSevenEight.clickCart();
	}

	@Então("confirmo o monitor")
	public void confirmoOMonitor() {
		LogicSevenEight.confirmItem();
	}

	@Quando("clico em algumas categorias")
	public void clicoEmAlgumasCategorias() {
		LogicNineTen.clickCategory();
	}

	@Quando("seleciono alguns itens")
	public void selecionoAlgunsItens() {
		LogicNineTen.clickAnyItems();
	}

	@Quando("adiciono os itens ao carrinho")
	public void adicionoOsItensAoCarrinho() {
		LogicNineTen.addToCart();
	}

	@Quando("somo os valores")
	public void somoOsValores() {
		LogicNineTen.mapValues();
	}
}
