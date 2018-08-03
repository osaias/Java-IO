package br.com.alura.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import br.com.alura.model.ObjetoSerialiacao;

public class TesteSerializacao {

	public static void main(String[] args) {

		ObjetoSerialiacao obj = new ObjetoSerialiacao();
		
		try {
			//serializar(obj);
			desserializar();
		} catch (Exception e) {
			System.out.println("Erro: ");
			e.printStackTrace();
		}

	}

	private static void serializar(ObjetoSerialiacao obj) throws IOException, FileNotFoundException {
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		
		oss.writeObject(obj);
		oss.close();
	}
	
	private static void desserializar() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		ObjetoSerialiacao object = (ObjetoSerialiacao) ois.readObject();

		System.out.println(object.toString());
	}
}
