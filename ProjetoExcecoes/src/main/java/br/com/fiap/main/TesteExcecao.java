package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.exececoes.Excecao;

public class TesteExcecao {

	public static void main(String[] args) throws Excecao {

		Scanner leitor = new Scanner(System.in);
		
		try {		

			int dividendo = leitor.nextInt();

			int divisor = leitor.nextInt();

			int resultado = dividendo / divisor;

			System.out.println(resultado);

		} catch (Exception e) {
			throw new Excecao(e);
		} finally {
			leitor.close();
		}
		
		
}
	

}
