package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MassaDados {
	private Workbook arquivo;
	private Sheet planilha;
	private FileInputStream fluxoDados;

	public MassaDados(Workbook arquivo, Sheet planilha) {
		this.arquivo = arquivo;
		this.planilha = planilha;
	}

	public MassaDados(String arquivoName, String planilhaName) {
		try {
			fluxoDados = new FileInputStream(new File(arquivoName));
			arquivo = WorkbookFactory.create(fluxoDados);
			planilha = arquivo.getSheet(planilhaName);
		} catch (IOException e) {
			throw new RuntimeException("Falha ao localizar ", e);
		}
	}

	public String obterValor(String id, int parametroIndex) {
		int rowStart = planilha.getFirstRowNum() + 1;
		int rowEnd = planilha.getLastRowNum();
		DataFormatter formatter = new DataFormatter();

		for (int index = rowStart; index <= rowEnd; index++) {
			String currentId = planilha.getRow(index).getCell(0).getStringCellValue();
			if (currentId.equals(id)) {
				Cell cell = planilha.getRow(index).getCell(parametroIndex);
				return formatter.formatCellValue(cell);
			}
		}

		return null;
	}

	public void close() {
		try {
			arquivo.close();
			fluxoDados.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Falha ao fechar o arquivo", e);
		}
	}

}
