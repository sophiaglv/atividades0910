package encapsulamento0910;

public class ItemTema {
	private long id;
	private String nome;
	private String descricao;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void exibirInformacoes() {
		System.out.println("ID: " + id + ", Nome: " + nome + ", Descrição: " + descricao);
	}
}
