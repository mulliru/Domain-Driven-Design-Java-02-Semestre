package br.com.fiap.beans;

public class Cliente {

	private int codigo;
	private String nome;
	private int idade;
	private Double renda;

	// Construtor vazio
	public Cliente() {
		super();
	}

	// Construtor cheio
	public Cliente(int codigo, String nome, int idade, Double renda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.renda = renda;
	}

	// Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	// To string
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", renda=" + renda + "]";
	}

}
