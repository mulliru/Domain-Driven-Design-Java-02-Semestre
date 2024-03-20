package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastrar {

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
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Instanciar objetos
		Produto objProduto = new Produto();
		
		ProdutoDAO dao = new ProdutoDAO ();
		
		objProduto.setCodigo(inteiro("Codigo"));
		objProduto.setTipo(texto("Tipo"));
		objProduto.setMarca(texto("Marca"));
		objProduto.setValor(real("valor"));
		

		System.out.println(dao.inserir(objProduto));
	}

}
