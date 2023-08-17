package PessoaComBuilder;

public class Principal {

	public static void main(String[] args) {
		
		PessoaBuilder pessoaBuilder = new PessoaBuilder();
		
		pessoaBuilder.setNome("Leo", "Cortarelli");
		pessoaBuilder.setDatadeNascimento(4, 9, 2003);
		pessoaBuilder.setLagradouro("Rua 123");
		pessoaBuilder.setEndereco("203", "Ap", "Capão Raso", "Curitiba", "Brasil");
		pessoaBuilder.setFone(41, 98413654, "Celular");
		pessoaBuilder.setFone(41, 97412563, "Fixo");

		Pessoa pessoa = pessoaBuilder.get();
		System.out.println(pessoa.toString());
		
	
	}

}
