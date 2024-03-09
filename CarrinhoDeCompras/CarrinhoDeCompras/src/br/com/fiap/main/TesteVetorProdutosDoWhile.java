package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorProdutosDoWhile {
	
	// String 
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int 
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	// double 
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		// Preparar posições
		Produto[] vetorProduto = new Produto[3];  // [0] [1] [2] 
		
		// Controle de posições
		int indice = 0;
		
		// Entrada
		do {
			
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setCodigo(inteiro("Digite o codigo do produto"));
			vetorProduto[indice].setTipo(texto("Digite o tipo de produto"));
			vetorProduto[indice].setMarca(texto("Digite a marca do produto"));
			vetorProduto[indice].setPreco(real("Digite o Preço"));
			
			indice ++;			
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais produto no carrinho?",
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		
		// Saídas 
		for (int contador = 0; contador < indice; contador ++ ) {
			
			System.out.println("\n\nCodigo: " + vetorProduto[contador].getCodigo() + 
							   "\nTipo: " + vetorProduto[contador].getTipo() + 
							   "\nMarca: " + vetorProduto[contador].getMarca() + 
							   "\nPreço: " + vetorProduto[contador].getPreco()					
					);
			
		}
		
		
		

	}

}
