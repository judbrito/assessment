package test;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BlazeSteps {

	@Dado("que acesso o site")
	public void queAcessoOSite() {
		BusinessLogic.acess();
	}

	@Quando("digitar login")
	public void digitarLogin() {
		System.out.println("testando step anterior");
	}

	@Quando("senha")
	public void senha() {
		System.out.println("testando step anterior");
	}

	@Então("confirmo acesso")
	public void confirmoAcesso() {
		System.out.println("testando step anterior");
	}

}
