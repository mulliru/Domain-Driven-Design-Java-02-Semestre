package br.com.fiap.services;


import br.com.fiap.model.Endereco;

public class ViaCepService {

	//metodo
	public Endereco getEndereco(String cep) {
		
		Endereco endereco = null;
		
		//Request
		HttpGet request = new HttpGet ("https://viacep.com.br/ws/"+ cep +"/json/");
		
		//Client
		//closea
		
		
		return endereco;
	}
	
}
