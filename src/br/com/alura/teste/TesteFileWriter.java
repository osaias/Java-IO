package br.com.alura.teste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TesteFileWriter {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("Arquivo4.txt");
			
			Scanner scanner = new Scanner(System.in);
			
			while(scanner.hasNext()) {
				writer.write(scanner.nextLine());
				writer.write(System.lineSeparator());
				writer.flush();
			}
			
			scanner.close();
			writer.close();
			
		} catch (IOException e) {
			System.out.println("Não conseguiu abrir o arquivo...");
			e.printStackTrace();
		}

	}

}
