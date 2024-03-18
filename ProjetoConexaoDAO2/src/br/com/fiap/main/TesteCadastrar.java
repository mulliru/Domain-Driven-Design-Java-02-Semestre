package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDao;


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
		// instanciar objetos
		Produto objProduto = new Produto();
		
		ProdutoDao dao = new ProdutoDao();
		
		objProduto.setCodigo(inteiro("Codigo"));
		objProduto.setTipo(texto("Tipo"));
		objProduto.setMarca(texto("Marca"));
		objProduto.setValor(real("Valor"));
		
		System.out.println(dao.inserir(objProduto));

	}

}
