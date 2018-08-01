package br.com.alura.teste;

import java.io.FileInputStream;

import br.com.alura.model.Escritor;
import br.com.alura.model.EscritorArquivo;
import br.com.alura.model.EscritorHardware;

public class TesteEscrita {

	public static void main(String[] args) {
		
		try {
			/*Escritor escritor = new EscritorArquivo("arquivo2.txt");
			String source = "Primeira linha.\nSegunda linha.\nTerceira linha.Quarta linha.";
			escritor.escrever(source);*/
			
			/*Escritor escritor = new EscritorArquivo("Arquivo3.txt");
			escritor.escrever(new FileInputStream("arquivo.txt"));*/
			
			/*Escritor escritor = new EscritorHardware(System.out);
			escritor.escrever(new FileInputStream("arquivo.txt"));*/
			
			Escritor escritor = new EscritorHardware(System.out);
			escritor.escrever(System.in);

		} catch (Exception e) {
			System.out.println("Erro ao escrever arquivo...");
			e.printStackTrace();
		}
		
	}
}

