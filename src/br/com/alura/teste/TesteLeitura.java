package br.com.alura.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import br.com.alura.model.Leitor;
import br.com.alura.model.LeitorArquivo;
import br.com.alura.model.LeitorHardware;

public abstract class TesteLeitura {

	public static void main(String[] args) {

		try {
			//Leitor leitor = new LeitorArquivo("arquivo.txt");
			Leitor leitor = new LeitorHardware(System.in);
			
			System.out.println(leitor.ler());
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo...");
			e.printStackTrace();
		}
	}

}
