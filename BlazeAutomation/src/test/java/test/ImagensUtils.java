package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import core.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class ImagensUtils {

	@After
	public void capturarScreenshot(Scenario scenario) {
		WebDriver driver = Driver.getWebDriver();
		String nomeCenario = obterNomeCenario(scenario);
		String statusCenario = obterStatusCenario(scenario);
		capturarImagem(driver, nomeCenario, statusCenario);
	}

	public static void capturarImagem(WebDriver driver, String nomeCenario, String statusCenario) {
		File arquivo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String dataHora = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date());
		String nomeArquivo = nomeCenario + "_" + statusCenario + "_" + dataHora + ".png";

		String diretorioResultado;
		if (statusCenario.equals("FALHOU")) {
			diretorioResultado = "./Evidencias/failed/";
		} else {
			diretorioResultado = "./Evidencias/passed/";
		}

		try {
			FileUtils.copyFile(arquivo, new File(diretorioResultado + nomeArquivo));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String obterStatusCenario(Scenario scenario) {
		if (scenario.isFailed()) {
			return "FALHOU";
		} else {
			return "PASSOU";
		}
	}

	public static String obterNomeCenario(Scenario scenario) {
		String idCenario = "";
		for (String tag : scenario.getSourceTagNames()) {
			if (tag.startsWith("@ID_")) {
				idCenario = tag.substring(1); // Remove o "@" da tag
				break;
			}
		}
		return idCenario;
	}
}
