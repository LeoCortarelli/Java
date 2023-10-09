package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		Interface inter = new Interface();          // Classe que representa a Interface do sistema  
		CarroDAO carroDAO = new CarroDAO();
		
		Carro carro;
		String placa;
		int opMenu;

		opMenu = inter.menuPrincipal();
			
		while (opMenu != 5) {

			switch (opMenu) {
				case 1: // Cadastrar Carro
					carro = inter.cadastrarCarro();  // Chamo a interface para o cadastro do Carro
					carroDAO.incluir(carro);
					break;

				case 2: // Excluir Carro
					placa = inter.excluirCarro();
					carro = carroDAO.consultarPorPlaca(placa);
					carroDAO.excluir(carro);
					break;
				case 3: // Alterar Carro
					placa = inter.consultarCarro();
					carro = carroDAO.consultarPorPlaca(placa);
					if (carro != null) {
						inter.mostrarCarro(carro);
						carro = inter.alterarCarro(carro);	

						carroDAO.alterarPorPlaca(carro);
					}
					else {
						inter.mensagemErro("Carro não encontrado");
					}
					break;

				case 4: // Consultar Carro
					placa = inter.consultarCarro();
					carro = carroDAO.consultarPorPlaca(placa);
					if (carro != null) {
						inter.mostrarCarro(carro);	
					}
					else {
						inter.mensagemErro("Carro não encontrado");
					}
					break;
			}
			
			opMenu = inter.menuPrincipal();
		}

	}

}
