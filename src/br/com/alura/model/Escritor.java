package br.com.alura.model;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public abstract class Escritor {

	protected OutputStream fluxo; 
	protected Writer escritor;
	protected BufferedWriter buffer;

	public Escritor(OutputStream stream) throws Exception {
		fluxo = stream;
		escritor = new OutputStreamWriter(fluxo);
		buffer = new BufferedWriter(escritor);
	}

	public abstract void escrever(InputStream in) throws Exception;

	public void escrever(String source) throws Exception {

		String string = source;
		String line = "";
		while (!string.isEmpty()) {
			int indexPonto = string.indexOf("\n");

			if (indexPonto == -1) {
				line = string;
				string = "";
			} else {
				line = string.substring(0, indexPonto + 1);
				string = string.substring(indexPonto + 1);
			}

			buffer.write(line);
			buffer.newLine();
		}

		buffer.close();
	}
}
