package Trabalho_Factory_Empregado;

public class PrincipalMain {

	public static void main(String[] args) {
		
		int cargo;
		String nome;
		String email;
		int anoContratacao;
		
		cargo = 1;
		nome = "Antonio Maciel";
		email = "antonio@gmail.com";
		anoContratacao = 2005;
		
		Empregado emp1 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratacao);
		System.out.println(emp1.toString());
		
		System.out.println("\n ------------------------------------ \n");
	
		cargo = 2;
		nome = "Cassio Ramos";
		email = "cassioo@gmail.com";
		anoContratacao = 2009;
		
		Empregado emp2 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratacao);
		System.out.println(emp2.toString());
		
		System.out.println("\n ------------------------------------ \n");
		
		cargo = 3;
		nome = "Guilherme Biro";
		email = "biro@gmail.com";
		anoContratacao = 2023;
		
		Empregado emp3 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratacao);
		System.out.println(emp3.toString());
		
		System.out.println("\n ------------------------------------ \n");
	
		cargo = 4;
		nome = "Mathias Rojas";
		email = "rojas@gmail.com";
		anoContratacao = 2023;
		
		Empregado emp4 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratacao);
		System.out.println(emp4.toString());
		

	}

}
