package br.com.alura.model;

import java.io.InputStream;

public class LeitorHardware extends Leitor{

	public LeitorHardware(InputStream in) throws Exception {
		super(in);
	}

	@Override
	public String ler() throws Exception {

		StringBuilder sb = new StringBuilder();

		String line = super.buffer.readLine();

		while(line != null && !line.isEmpty() ) {
			sb.append(line);
			sb.append("\n");

			line = super.buffer.readLine();
		}

		super.buffer.close();
		return sb.toString();
	}

}
