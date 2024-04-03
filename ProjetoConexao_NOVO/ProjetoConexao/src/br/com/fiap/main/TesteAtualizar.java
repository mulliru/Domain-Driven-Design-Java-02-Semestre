package br.com.fiap.main;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteAtualizar {

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
			
			// Instanciar objetos
			Produto objprProduto = new Produto ();
			
			ProdutoDAO dao = new ProdutoDAO();
			
			objprProduto.setCodigo(inteiro("Código"));
			objprProduto.setTipo(texto("Tipo"));
			objprProduto.setMarca(texto("Marca"));
			objprProduto.setValor(real("Valor"));
			
			System.err.println(dao.deletar(objprProduto));
			


	}

}
