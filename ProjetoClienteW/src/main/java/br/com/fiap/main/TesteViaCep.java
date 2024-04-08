package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.viacepService;

public class TesteViaCep {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// Instanciar objetos
		viacepService via = new viacepService();
		
		String cep = JOptionPane.showInputDialog("Informe o cep para consulta");
		
		Endereco endereco = via.getEndereco(cep);
		
		System.out.println(endereco);
	}
}

