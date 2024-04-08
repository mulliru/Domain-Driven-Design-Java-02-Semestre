package br.com.fiap.beans;

public class Cliente {

	private int Codigo;
	private String nome;
	private String rg;

	// Construtor Vazio
	public Cliente() {
		super();
	}

	// Construtor Cheio
	public Cliente(int codigo, String nome, String rg) {
		super();
		Codigo = codigo;
		this.nome = nome;
		this.rg = rg;
	}

	// Getters e Setters
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
