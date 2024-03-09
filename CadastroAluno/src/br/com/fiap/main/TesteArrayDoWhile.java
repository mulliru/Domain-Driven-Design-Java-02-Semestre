package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteArrayDoWhile {

	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//Int
	static Integer inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//Double
	static Double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {

		//Preparar a lista
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		//preparar objeto
		Aluno objAluno;
		
		//Entrada
		do {
			objAluno = new Aluno();
			objAluno.setRm(inteiro("Digite seu RM"));
			objAluno.setNome(texto("Informe o nome do aluno"));
			objAluno.setTurma(texto("Informe a turma"));
			objAluno.setNota(real("Informa a nota"));
			
			listaAlunos.add(objAluno);
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais alunos?", "Cadastro de alunos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		
		
	}

}
