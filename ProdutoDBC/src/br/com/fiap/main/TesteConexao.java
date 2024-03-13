package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Teste de conexao
		Connection cn = new ConexaoFactory().conexao();

		System.err.println("Conexao com o banco!");
		
		cn.close();
	}

}
