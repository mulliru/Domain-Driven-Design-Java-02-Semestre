package br.com.fiap.model;

public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    
    // Construtores Vazios
    public Endereco() {
        super();
    }
    
    // Construtores Cheios
    public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
        super();
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }
    
    // Getters e Setters
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

    // Método toString()
    @Override
    public String toString() {
        return "Endereco {" +
               "\n  cep: " + cep +
               ", \n  logradouro: " + logradouro +
               ", \n  complemento: " + complemento +
               ", \n  bairro: " + bairro +
               ", \n  localidade: " + localidade +
               ", \n  uf: " + uf +
               "\n}";
    }
}
