package br.com.alura.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncodingECharsets {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String alfabeto = "çóéíúãõêÇÓÉÍÚÃÕÊ";
			
		System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s %-12s\n","LETRA", "UNICODE", "ISO-8859-1", "US-ASCII", "UTF-16", "UTF-8", "WINDOWS=1252");
		for (int i = 0; i < alfabeto.length(); i++) {
			
			int unicode = alfabeto.codePointAt(i);
			System.out.printf("%-16s", alfabeto.valueOf(alfabeto.charAt(i)));
			System.out.printf("%-14d", unicode);
			imprimir(alfabeto.valueOf(alfabeto.charAt(i)), StandardCharsets.ISO_8859_1.name());
			imprimir(alfabeto.valueOf(alfabeto.charAt(i)), StandardCharsets.US_ASCII.name());
			imprimir(alfabeto.valueOf(alfabeto.charAt(i)), StandardCharsets.UTF_16.name());
			imprimir(alfabeto.valueOf(alfabeto.charAt(i)), StandardCharsets.UTF_8.name());
			imprimir(alfabeto.valueOf(alfabeto.charAt(i)), "windows-1252");
			System.out.println();
		}
		
		System.out.println("Encoding do SO: " + Charset.defaultCharset().displayName());

	}

	private static void imprimir(String letra, String encoding) throws UnsupportedEncodingException {

		byte[] bytes = letra.getBytes(encoding);
		System.out.printf("%-12s",new String(bytes));
	}

}
