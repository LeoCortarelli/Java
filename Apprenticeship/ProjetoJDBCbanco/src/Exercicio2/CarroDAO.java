package Exercicio2;

import java.sql.ResultSet;

public class CarroDAO {
	Conexao conexao = null;
	
	public CarroDAO(){
		this.conexao = new Conexao();
		this.conexao.conectar();
	}
	
	public void incluir(Carro carro) {
		String query = "INSERT INTO carro VALUES ('"+ carro.getPlaca() + "','"+ carro.getModelo()+ "',"+carro.getPotencia()+")";
		this.conexao.executarAtualizacao(query);
	}
	
	public Carro consultarPorPlaca(String placa) {
		Carro carro = null;
		try {
			String query = "SELECT * FROM carro WHERE placa = '" + placa + "'";
			ResultSet resultset = this.conexao.executarConsulta(query);
			if(resultset.next()) {
				carro = new Carro();
				carro.setModelo(resultset.getString("MODELO"));
				carro.setPlaca(resultset.getString("PLACA"));
				carro.setPotencia(resultset.getDouble("POTENCIA"));
			}
		} catch (Exception e) {
			System.out.println("Erro na consulta por placa.");
			System.out.println(e.getMessage());
		}
			return carro;
	}
	
	
	public void alterarPorPlaca(Carro carro) {
		String query = "UPDATE carro SET modelo = '" + carro.getModelo() +
				"', potencia = " + carro.getPotencia() + " WHERE placa = '" +
				carro.getPlaca() + "'";
		this.conexao.executarAtualizacao(query);
	}
	
	public void excluir(Carro carro) {
		String query = "DELETE FROM carro WHERE placa='" + carro.getPlaca()+ "'"; 
		this.conexao.executarAtualizacao(query);
	}
	
}
