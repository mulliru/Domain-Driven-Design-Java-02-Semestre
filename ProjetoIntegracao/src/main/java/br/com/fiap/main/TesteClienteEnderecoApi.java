package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteClienteEnderecoApi {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		// Instanciar objetos
		ViaCepService viacep = new ViaCepService();

		Cliente cliente = new Cliente();

		String cep = JOptionPane.showInputDialog("Informe o cep do cliente para realizarmos a busca!");
		
		Endereco endereco = null;
		
		endereco = viacep.getEndereco(cep);
		
		cliente.setEndereco(endereco);
		
		System.out.println(cliente);
	}

}
