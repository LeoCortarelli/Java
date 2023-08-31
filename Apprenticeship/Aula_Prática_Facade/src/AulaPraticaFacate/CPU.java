package AulaPraticaFacate;

public class CPU {
	private double clock;
	private int status;
	
	public void inicia() {
		System.out.println("Inicialização inicial da CPU");
		this.status = 1;
	}
	
	public void execute() {
		System.out.println("Executa algo no processador");
		this.status = 2;
	}
	
	public void carrega() {
		if(this.status != 2) {
			this.status = 2;
		}
		System.out.println("Carrega registrador");
	}
	
	public void libera() {
		System.out.println("Libera registrador");
		this.status = 3;
	}
	
	
	public void desliga() {
		System.out.println("desliga registrador");
		this.status = 4;
	}

	public CPU(double clock, int status) {
		this.clock = clock;
		this.status = status;
	}
	

}
