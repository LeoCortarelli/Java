package AulaPraticaFacate;

public class HD {
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public String ler(int posicao , int size) {
		System.out.println("Ler dados do HD");
		return "Informação lida pelo HD";
	}
	
	public void escrever(int posicao, String info) {
		System.out.println("Escrever dados no HD");
	}

	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public HD(int capacidade) {
		super();
		this.capacidade = capacidade;
	}
	
	
	
}
