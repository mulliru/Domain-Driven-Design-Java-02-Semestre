package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteArrayProdutosDoWhile {
	
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
			
			// Lista de Produtos 
			List<Produto> listaProdutos = new ArrayList<Produto>();
			
			// Prepara objProduto
			Produto objProduto;			
			
			
			// Entrada 
			do {
				objProduto = new Produto();
				objProduto.setCodigo(inteiro("Informe o codigo do produto"));
				objProduto.setTipo(texto("Informe o tipo"));
				objProduto.setMarca(texto("Informe a marca"));
				objProduto.setPreco(real("Informe o preço"));
				
				listaProdutos.add(objProduto);			
				
			} while ( JOptionPane.showConfirmDialog(null, "Adionar mais produtos no carrinho?", 
					"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
			
			
			
			 
			// Saidas 
			// O foreach percorre todos os elementos (produtos) da lista para serem exibidos 
			for (Produto p : listaProdutos) {
				System.out.println("\n\nCodigo: " + p.getCodigo() + 
								   "\nTipo: " + p.getTipo() + 
								   "\nMarca: " + p.getMarca() + 
								   "\nPreço: " + p.getPreco());
			}		

		}
	

}
