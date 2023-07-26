package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.page_scenario_eleven_twelve.LogicElevenTwelve;
import test.page_scenario_five_and_six.LogicFiveSix;
import test.page_scenario_nine_and_ten.LogicNineTen;
import test.page_scenario_one_and_two.LogicOneTwo;
import test.page_scenario_seven_and_eigth.LogicSevenEight;
import test.page_scenario_three_and_four.LogicThreeFour;

public class BlazeSteps {

	@BeforeClass
	public void openWeb() {
		Driver.webSite("https://www.demoblaze.com/index.html");
	}

	@AfterClass
	public void closeWeb() {
		Driver.tearDown();
	}

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

	@Dado("digito a senha")
	public void digitoASenha() {
		LogicOneTwo.writePassword();
	}

	@Dado("clico no botão de login")
	public void clicoNoBotãoDeLogin() {
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

	@Quando("digito a nova senha")
	public void digitoANovaSenha() {
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

	@Quando("digito o usuário existente")
	public void digitoOUsuárioExistente() {
		LogicThreeFour.writeUserExisting();
	}

	@Então("valido a mensagem conta existente")
	public void validoAMensagemContaExistente() {
		LogicThreeFour.signUnsuccessful();
	}

	@Quando("clico no botão fechar modal")
	public void clicoNoBotãoFecharModal() {
		LogicThreeFour.closeModal();
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
		LogicSevenEight.firstItemDell();
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
		LogicSevenEight.addToCart();
	}

	@Quando("a soma de todos os valores na tabela é \\{int}")
	public void aSomaDeTodosOsValoresNaTabelaÉ() {
		LogicNineTen.mapValues();

	}

	@Então("verifico ambos os resultados")
	public void verificoAmbosOsResultados() {
		LogicNineTen.bothValue();
	}

	@Então("confirmo carrinho vazio")
	public void confirmoCarrinhoVazio() {
		LogicNineTen.noItems();
	}

	@Dado("que clico em phones")
	public void queClicoEmPhones() {
		LogicElevenTwelve.clickPhones();
	}

	@Quando("deleto todos os itens")
	public void deletoTodosOsItens() {
		LogicNineTen.deleteItem();
	}

	@Quando("deleto o primeiro item")
	public void deletoOPrimeiroItem() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Quando("clico no botão place order")
	public void clicoNoBotãoPlaceOrder() {
		LogicElevenTwelve.clickPlaceOrder();
	}

	@Quando("digito o nome")
	public void digitoONome() {
		LogicElevenTwelve.writeName();
	}

	@Quando("digito o country")
	public void digitoOCountry() {
		LogicElevenTwelve.writeCountry();
	}

	@Quando("digito o city")
	public void digitoOCity() {
		LogicElevenTwelve.writeCity();
	}

	@Quando("digito o credit card")
	public void digitoOCreditCard() {
		LogicElevenTwelve.writeCredit();
	}

	@Quando("digito o month")
	public void digitoOMonth() {
		LogicElevenTwelve.writeMonth();
	}

	@Quando("digito o year")
	public void digitoOyear() {
		LogicElevenTwelve.writeYear();
	}

	@Então("clico no botão purchase")
	public void clicoNoBotãoPurchase() {
		LogicElevenTwelve.clickPurchase();
	}

	@Então("clico no Ok")
	public void clicoNoOk() {
		LogicElevenTwelve.clickOk();
	}

}
