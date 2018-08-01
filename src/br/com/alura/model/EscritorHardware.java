package br.com.alura.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class EscritorHardware extends Escritor{

	public EscritorHardware(OutputStream stream) throws Exception {
		super(stream);
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
			buffer.flush();
			
			line = br.readLine();
		}

		buffer.close();
		
	}

	
	


}
