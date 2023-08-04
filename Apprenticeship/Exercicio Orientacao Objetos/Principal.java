package Trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		
		int i;
		String cpf;
		int anoNascimento;
		String nome;
		String email;
		
		String rua;
		String bairro;
		int numero;
		
		
		
		for(i = 0; i < 3; i++) {
			System.out.println("Informe o cpf:");
			cpf = teclado.nextLine();
			
			System.out.println("Informe o ano nascimento:");
			anoNascimento = teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.println("Informe o nome:");
			nome = teclado.nextLine();
			
			System.out.println("Informe o email:");
			email = teclado.nextLine();
			
			System.out.println("\n -----------ENDEREÇO----------- \n");
			
			System.out.println("Informe o nome da rua:");
			rua = teclado.nextLine();
			
			System.out.println("Informe o nome do bairro:");
			bairro = teclado.nextLine();
			
			System.out.println("Informe o numero:");
			numero = teclado.nextInt();
			
			teclado.nextLine();
			
			Endereco end = new Endereco(rua, bairro, numero);
			
			listaCliente.add(new Cliente(cpf,anoNascimento,nome,email,end));
			
			System.out.println("\n -----------NOVO CLIENTE----------- \n");
			
		}
		
		for(Cliente cont : listaCliente) {
			System.out.println(cont);
		}
	}

}
