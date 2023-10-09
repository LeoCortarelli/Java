package Exercicio1;

public class Agenda {

	public static void main(String[] args) {
		
		BancoDeDados bd = new BancoDeDados();
		
		bd.conectar();
		
		bd.estaConectado();
		
		if(bd.estaConectado() == true) {
			System.out.println("Banco de dados conectado");
		}else {
			System.out.println("Banco de dados não conectado");
		}

		
		//bd.inserirContato("Senac", "0800 643 6 346");
		
		bd.listarContato();
		
		bd.apagarContato("6");
		
		bd.atualizarContato("2", "Senac cENTRO", "3314-5850");
		
	}
}
