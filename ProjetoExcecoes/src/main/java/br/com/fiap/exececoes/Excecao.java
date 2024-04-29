package br.com.fiap.exececoes;

public class Excecao extends Exception {

	// Construtor vazio
	public Excecao() {
		super();
	}

	//
	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("\n Falha ao dividir por zero");
		} else if (e.getClass().toString().equals("class java.util.InputMismatchException")) {
			System.out.println("\n Falha ao inserir letra em campo de numero");
		} else {
			System.out.println("\n Falha desconhecida, tome cuidado");
			e.printStackTrace();
		}
	}

}
