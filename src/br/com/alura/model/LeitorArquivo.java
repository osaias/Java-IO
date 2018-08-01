package br.com.alura.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeitorArquivo extends Leitor{
	
	
	public LeitorArquivo(String file) throws Exception {
		super(new FileInputStream(file));
	}

	public LeitorArquivo(File file) throws Exception {
		super(new FileInputStream(file));
	}

	@Override
	public String ler() throws Exception {
		
		StringBuilder sb = new StringBuilder();
		
		String line = super.buffer.readLine();
		
		while(line != null) {
			sb.append(line);
			sb.append("\n");
			
			line = super.buffer.readLine();
		}
		
		super.buffer.close();
		return sb.toString();
	}
	
}
