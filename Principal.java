package encapsulamento0910;

public class Principal {

	public static void main(String[] args) {
		Tema tema = new Tema(15, "Princesinha Sofia", 150, "Roxo");
		Cliente cliente = new Cliente(15, "Alice", "998877456", "45568789210", "45840268h5");
		Endereco endereco = new Endereco(15, "Rua das Estrelas Cadentes", 1234, "Apartamento 42B", "Jardim das Galáxias", "Nova Aurora", "99999-999", "EX");
		ItemTema itemTema = new ItemTema();
		
		itemTema.setId(15);
		itemTema.setNome("Princesinha Sofia");
		itemTema.setDescricao("Bem decorado");
		
		tema.exibirInformacoes();
		
		System.out.println();
		
		cliente.exibirInformacoes();
		
		System.out.println();
		
		endereco.exibirInformacoes();
		
		System.out.println();
		
		itemTema.exibirInformacoes();
	}

}
