package br.com.alura.model;

import java.io.Serializable;

public class ObjetoSerialiacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome = "Classe de Teste";
	private int id = 123;
	private double valor = 100.5;
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: " + id + " Nome: " + nome + " Valor: " + valor;
	}
}
