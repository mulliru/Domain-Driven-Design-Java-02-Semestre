package br.com.fiap.main;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteDeletar {

	
		// String
		static String texto(String j) {
			return JOptionPane.showInputDialog(j);
		}
		
		//int
		static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));
		}
		
		//double
		static double real(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		//INstancair objetos
			Produto objProduto = new Produto();
			ProdutoDAO dao = new ProdutoDAO ();
			
		//Delete
			objProduto.setCodigo(inteiro("Digite o codigo do produto a ser Deletado"));
			objProduto.setTipo(texto("Tipo de Produto a ser deletado"));
			objProduto.setMarca(texto("Digite a marca do produto a ser deletado"));
			objProduto.setValor(real("Digite o valor do produto a ser deletado"));
		
	}
}


