package Exercicio2;

import java.sql.*;

public class Conexao {
	private Connection connection;
	private Statement statement;
	private ResultSet resultset;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/loja_carro";
		String usuario = "root";
		String senha = "";
		
		try {
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System. out .println("Erro na conexão com o Banco de Dados");
			System.out .println(e.getMessage());
		}
	}
	
	public ResultSet executarConsulta(String consulta) {
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery(consulta);
		} catch (Exception e) {
			System.out.println("Erro ao executar a consulta \n " + consulta);
			System.out.println(e.getMessage());
		}
		return resultset;
	}
	
	public void executarAtualizacao(String atualiza) {
		try {
			statement = connection.createStatement();
			statement.execute(atualiza);
		} catch (Exception e) {
			System.out.println("Erro na execução da atualização \n "+ atualiza);
		}
	}
}
