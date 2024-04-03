package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteViaCep {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		//Instanciar objetos
		ViaCepService viacep = new ViaCepService();
		
		String cep = JOptionPane.showInputDialog("Informe o CEP para pesquisa");
		
		Endereco endereco = viacep.getEndereco(cep);
		
		System.out.println(endereco);
	}

}
