package br.com.alura.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {

		Scanner entrada;
		try {
			entrada = new Scanner(new File("contas.csv"));
			Scanner linha = null;

			while(entrada.hasNextLine()) {
				String line = entrada.nextLine();
				System.out.println(line);

				linha = new Scanner(line);
				linha.useDelimiter(",");
				linha.useLocale(Locale.US);
				
				String tipo = linha.next();
				int agencia = linha.nextInt();
				int numero = linha.nextInt();
				String titular = linha.next();
				double saldo = linha.nextDouble();

				System.out.printf(new Locale("pt", "BR"), "%s %d %d %s %7.2f\n", tipo, agencia, numero, titular, saldo);
				System.out.println("-------------------------------");

			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado...");
			e.printStackTrace();
		}

	}
}
