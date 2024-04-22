package br.com.fiap.model;

public class Endereco {

	 /* "cep": "01001-000",
	  "logradouro": "Praça da Sé",
	  "complemento": "lado ímpar",
	  "bairro": "Sé",
	  "localidade": "São Paulo",
	  "uf": "SP"
		  */
		   
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	// Construtor vazio
	public Endereco() {
		super();
	}
	
	//Construtor cheio
	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}
	
	//Getters e Setters

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	//to string
	@Override
	public String toString() {
		return "Endereco [cep=" + cep +
				", logradouro=" + logradouro + 
				", complemento=" + complemento + 
				", bairro=" + bairro + 
				", localidade=" + localidade +
				", uf=" + uf + "]";
	}
	
	
}
