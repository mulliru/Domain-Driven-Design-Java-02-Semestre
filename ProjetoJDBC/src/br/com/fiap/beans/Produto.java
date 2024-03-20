package br.com.fiap.beans;

public class Produto {

	private int codigo;
	private String marca;
	private String tipo;
	private double valor;
	
	//Construtor vazio
	public Produto() {
		super();
	}

	//COnstrutor cheio
	public Produto(int codigo, String marca, String tipo, double valor) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.valor = valor;
	}

	//Getters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
		
	
	
	
	
}
