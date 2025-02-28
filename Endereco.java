package encapsulamento0910;

public class Endereco {
	private long id;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	
	public Endereco(long id, String logradouro, int numero, String complemento, String bairro, String cidade, String cep, String uf) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public void exibirInformacoes() {
		System.out.println("ID: " + id + ", Logradouro: " + logradouro + ", Numero: " + numero + ", Complemento: " + complemento + ", Bairro: " + bairro + ", Cidade: " + cidade + ", CEP: " + cep + ", UF: " + uf);
	}
}
