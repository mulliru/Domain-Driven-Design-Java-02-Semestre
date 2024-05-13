package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class AlunoBo {

	// inserir
	public void inserirBo(Aluno aluno) throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();

		// Regra de negocios, if, else, try & catch

		alunoDAO.inserir(aluno);

	}

	// atualizar
	public void atualizarBo(Aluno aluno) throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();

		// Regra de negocios, if, else, try & catch

		alunoDAO.atualizar(aluno);

	}

	// deletar
	public void deletarBo(int rm) throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();

		// Regra de negocios, if, else, try & catch

		alunoDAO.deletar(rm);
	}

	public ArrayList<Aluno> selecionarBo() throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();

		// Regra de negocios, if, else, try & catch

		return (ArrayList<Aluno>) alunoDAO.selecionar();

	}

}