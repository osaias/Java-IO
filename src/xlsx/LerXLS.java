package xlsx;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LerXLS {

	public static void main(String[] args) throws BiffException, IOException {

		String nomeArquivo = "jogador.xls";
		Workbook arquivo = Workbook.getWorkbook(new File(nomeArquivo));

		Sheet planilha = arquivo.getSheet(0);

		int linhas = planilha.getRows();
		int colunas = planilha.getColumns();

		Cell[][] campo = new Cell[linhas][colunas];

		for (int l=0; l < linhas; l++) {
			for (int c=0; c < colunas; c++) {
				campo[l][c] = planilha.getCell(c, l);
			}
		}

		for (int l=0; l < linhas; l++) {
			for (int c=0; c < colunas; c++) {
				System.out.print(campo[l][c].getContents().trim() + " ");
			}
			
			System.out.println();
		}

		arquivo.close();
	}

}
