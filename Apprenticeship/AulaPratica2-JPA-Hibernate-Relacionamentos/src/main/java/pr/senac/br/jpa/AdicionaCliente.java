package pr.senac.br.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import pr.senac.br.modelo.Cliente;
import pr.senac.br.modelo.Conta;

public class AdicionaCliente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		double saldo;
		
		String cpf;
		int anoNascimento;
		String nome;
		String email;
		int opcao;
		
		System.out.println("1 - Adicionar um cliente ");
		System.out.println("2 - Sair ");
	
		opcao = teclado.nextInt();
		

			while(opcao == 1) {
				
				System.out.println("Digite o saldo da conta:");
				saldo = teclado.nextDouble();
				
				System.out.println("\n ------------------- \n");
				
				teclado.nextLine();
				
				System.out.println("Digite o CPF:");
				cpf = teclado.nextLine();
				
				System.out.println("\n ------------------- \n");
				
				System.out.println("Digite o ANO DE NASCIMENTO:");
				anoNascimento = teclado.nextInt();
				
				teclado.nextLine();
				
				System.out.println("\n ------------------- \n");
				
				System.out.println("Digite o NOME:");
				nome = teclado.nextLine();
				
				System.out.println("\n ------------------- \n");
				
				System.out.println("Digite o EMAIL:");
				email = teclado.nextLine();
				
				Conta conta = new Conta(saldo);
				Cliente cliente = new Cliente(cpf,anoNascimento,nome,email,conta);
				
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_pratica2");
				EntityManager manager = factory.createEntityManager();
				
				try {
					manager.getTransaction().begin();
					manager.persist(conta);
					manager.persist(cliente);
					manager.getTransaction().commit();
				}catch(PersistenceException e){
					System.out.println("Erro na inclisão do Cliente" + cliente.toString());
					System.out.println(e.getMessage());
				}
				
				manager.close();
				
				System.out.println("1 - Adicionar um cliente ");
				System.out.println("2 - Sair ");
				
				opcao = teclado.nextInt();
				
			}
			
			teclado.nextLine();
			
			System.out.println("\n ------------------- \n");
			
			
			
			
			String buscaCPF;
			
			System.out.println("Digite o CPF para busca do cliente");
			buscaCPF = teclado.nextLine();
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_pratica2");
			EntityManager manager = factory.createEntityManager();
			Cliente encontra = manager.find(Cliente.class, buscaCPF);
			if(encontra != null) {
				System.out.println("\n -------------------------- \n");
				System.out.println(encontra.toString());
				manager.close();
			}else {
				System.out.println("Cliente não encontrado");
			}
			
			
		}


}
