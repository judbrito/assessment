package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MassaDados {
	private Workbook arquivo;
	private Sheet planilha;
	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;

	public MassaDados(Workbook arquivo, Sheet planilha) {
		this.arquivo = arquivo;
		this.planilha = planilha;
	}

	public MassaDados(String arquivoName, String planilhaName) {
		try {
			fileInputStream = new FileInputStream(new File(arquivoName));
			arquivo = WorkbookFactory.create(fileInputStream);
			planilha = arquivo.getSheet(planilhaName);
		} catch (IOException e) {
			throw new RuntimeException("Falha ao localizar ", e);
		}
	}

	public String getCellData(int rowNumber, int columnNumber) {
		Row row = planilha.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(cell);
	}

	public int getRowCount() {
		return planilha.getLastRowNum() + 1;
	}

	public int getColumnCount(int rowNumber) {
		Row linhas = planilha.getRow(rowNumber);
		return linhas.getLastCellNum();
	}

	public String[] getRowData(int rowNumber) {
		Row row = planilha.getRow(rowNumber);
		int columnCount = getColumnCount(rowNumber);
		String[] rowData = new String[columnCount];

		for (int coluna = 0; coluna < columnCount; coluna++) {
			Cell cell = row.getCell(coluna);
			DataFormatter formatter = new DataFormatter();
			rowData[coluna] = formatter.formatCellValue(cell);
		}

		return rowData;
	}

	public void saveWorkbook(String arquivoName) {
		try {
			fileOutputStream = new FileOutputStream(new File(arquivoName));
			arquivo.write(fileOutputStream);
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			arquivo.close();
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
