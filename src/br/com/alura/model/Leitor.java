package br.com.alura.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public abstract class Leitor {
	
	protected InputStream fluxo; 
	protected Reader leitor;
	protected BufferedReader buffer;

	public Leitor(InputStream stream) throws Exception {
		fluxo = stream;
		leitor = new InputStreamReader(fluxo);
		buffer = new BufferedReader(leitor);
	}
	
	public abstract String ler() throws Exception;
	
}
