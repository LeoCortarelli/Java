package Exercicio2;

import java.util.Scanner;

public class Interface {
	Scanner entrada = new Scanner(System.in);

	public int menuPrincipal() {
		int op;
		Scanner entrada = new Scanner(System.in);

		System.out.println("------------------------------------");
		System.out.println("----------   MENU   ----------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar Carro ");
		System.out.println("2 - Excluir Carro ");
		System.out.println("3 - Alterar Carro ");
		System.out.println("4 - Consultar Carro ");
		System.out.println("5 - SAIR ");

		op = entrada.nextInt();

		while (op > 5 || op <= 0) {
	
			System.out.println("------------------------------------");
			System.out.println("----------   MENU   ----------------");
			System.out.println("------------------------------------");
			System.out.println("1 - Cadastrar Carro ");
			System.out.println("2 - Excluir Carro ");
			System.out.println("3 - Alterar Carro ");
			System.out.println("4 - Consultar Carro ");
			System.out.println("5 - SAIR ");
			op = entrada.nextInt();

		}
		return op;
	}

	/**
	 * Aqui vc cria um novo cliente na tela, para depois tentar cadastrar
	 */
	public Carro cadastrarCarro() {

		String placaCarro;
		String modeloCarro;
		Double potenciaCarro;

		placaCarro = lerPlacaCarro();
		modeloCarro = lerModeloCarro();
		
		potenciaCarro = lerPotenciaCarro();
		while (potenciaCarro <= 0) {
			potenciaCarro = lerPotenciaCarro();
		}
		
		Carro carro = new Carro();
		carro.setPlaca(placaCarro);
		carro.setModelo(modeloCarro);
		carro.setPotencia(potenciaCarro);
		
		return carro;
	}
	
	/**
	 * Aqui vc retorna o numero da placa do carro a ser excluido
	 */
	public String excluirCarro() {

		String placaCarro;

		placaCarro = lerPlacaCarro();

		return placaCarro;
	} 
		
	/**
	 * Aqui vc retorna o numero da placa do carro a ser consultado
	 */
	public String consultarCarro() {

		String placaCarro;

		placaCarro = lerPlacaCarro();

		return placaCarro;
	} 

	
	/**
	 * Aqui vc retorna o carro com as novas informações
	 */
	public Carro alterarCarro(Carro carro) {

		String placaCarro;
		String modeloCarro;
		Double potenciaCarro;

		placaCarro = lerPlacaCarro();
		modeloCarro = lerModeloCarro();
		
		potenciaCarro = lerPotenciaCarro();
		while (potenciaCarro <= 0) {
			potenciaCarro = lerPotenciaCarro();
		}
		
		carro.setPlaca(placaCarro);
		carro.setModelo(modeloCarro);
		carro.setPotencia(potenciaCarro);
		
		return carro;
	} 
	
	public void mostrarCarro(Carro carro) {

		System.out.println("Placa do carro: " + carro.getPlaca());
		System.out.println("Modemor do carro: " + carro.getModelo());
		System.out.println("Potencia do carro: " + carro.getPotencia());
	} 	
	
	public void mensagemErro(String erro) {
		System.out.println("ERRO: " + erro);
	}
	
	public String lerPlacaCarro() {

		String placa;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a Placa do Carro: ");
		placa = ler.nextLine();

		return placa;
	}	
	
	public String lerModeloCarro() {

		String modelo;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o Modelo do Carro: ");
		modelo = ler.nextLine();

		return modelo;
	}		
		
		
	public double lerPotenciaCarro() {

		double potencia;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a Potencia do Carro: ");
		potencia = ler.nextDouble();

		return potencia;
	}
}
