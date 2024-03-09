package br.com.fiap.beans;

public class Aluno {

	// Visibilidade + tipo de dado + nome da variavel;
	private int rm;
	private String nome;
	private String turma;
	private double nota;
	
	//Construtor vazio
	public Aluno() {
		super();
	}
	
	//Construtor cheio
	public Aluno(int rm, String nome, String turma, double nota) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.turma = turma;
		this.nota = nota;
	}
	
	//Getters e Setters
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
