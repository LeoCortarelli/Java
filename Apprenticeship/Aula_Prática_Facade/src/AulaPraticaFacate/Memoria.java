package AulaPraticaFacate;

public class Memoria {
	private int tamanho;
	private int ocupada;
	
	public void carregar(int position , String info) {
		System.out.println("carrega dados da memoria");
		this.ocupada = this.ocupada + info.length();
	}
	
	public void libera(int position , String info) {
		System.out.println("libera dados da memoria");
		this.ocupada = this.ocupada + info.length();
	}
	
	public String ler(int position, int tamanho) {
		return "DADOS LIDOS DA MEMORIA";
	}

	public Memoria(int tamanho, int ocupada) {
		super();
		this.tamanho = tamanho;
		this.ocupada = ocupada;
	}

	

	
}
