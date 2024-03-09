package br.com.fiap.beans;

public class Produto {

	//Visibilidade + tipo de dado + nome da variavel;
	
	private String nome;
	private int quantidade;
	private double valor;
	
	//Construtores vazios
	public Produto() {
		super();
	}
	
	//Construtores Cheiros
	public Produto(String nome, int quantidade, double valor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
