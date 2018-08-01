package br.com.alura.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class EscritorArquivo extends Escritor{

	public EscritorArquivo(String file) throws Exception {
		super(new FileOutputStream(file));
		// TODO Auto-generated constructor stub
	}
	
	public EscritorArquivo(File file) throws Exception {
		super(new FileOutputStream(file));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void escrever(InputStream in) throws Exception {
		
		Reader leitor = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(leitor);
		
		String line = br.readLine();
		while (line != null) {

			buffer.write(line);
			buffer.newLine();

			line = br.readLine();			
		}

		buffer.close();
	}
	
	
}
