package br.com.alura.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class TesteProperties {

	public static void main(String[] args) {

		try {
			criaProperties("www.ocs@gmail.com", "ocs", "123456");
			criaProperties("www.lima@gmail.com", "lima", "666655");
			lerProperties("config.properties");
		} catch (Exception e) {
			System.out.println("Erro ao acessar o arquivo....");
			e.printStackTrace();
		}
		
	}

	private static void lerProperties(String file) throws Exception {
		
		Properties props = new Properties();        
		props.load(new FileReader(file));

		/*String usuario = props.getProperty("usuario");
		String senha = props.getProperty("senha");
		String email = props.getProperty("email");*/
		
		PrintWriter writer = new PrintWriter(System.out);
		props.list(writer);
		writer.flush();

	}

	private static void criaProperties(String email, String usuario, String senha) throws IOException {

		Properties props = new Properties();

		props.setProperty("email", email);
		props.setProperty("usuario", usuario);
		props.setProperty("senha", senha);
		
		props.store(new FileWriter("config.properties",true), "Arquivo de login e senhas");
		
	}

}
