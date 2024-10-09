package encapsulamento0910;

public class Tema {
	private long id;
	private String nome;
	private double valorAluguel;
	private String cor;
	
	public Tema(long id, String nome, double valorAluguel, String cor) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.cor = cor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void exibirInformacoes() {
		System.out.println("ID: " + id + ", Nome: " + nome + ", Valor do Aluguel: " + valorAluguel + ", Cor: " + cor);
	}
	
}
