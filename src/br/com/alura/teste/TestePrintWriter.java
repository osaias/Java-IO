package br.com.alura.teste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestePrintWriter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/*PrintWriter writer = new PrintWriter(System.out);
				
		while(scanner.hasNext()) {
			writer.write(scanner.nextLine());
			writer.println();
			writer.flush();
		}
		
		scanner.close();
		writer.close();*/

		PrintStream writer = new PrintStream(System.out);
		
		while(scanner.hasNext()) {
			writer.println(scanner.nextLine());
			writer.flush();
		}
		
		scanner.close();
		writer.close();
	}

}
