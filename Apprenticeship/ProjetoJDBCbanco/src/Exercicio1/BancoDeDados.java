package Exercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDeDados {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/agenda";
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
	
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void inserirContato(String nome, String telefone) {
		String query;
		
		try {
			query = "INSERT INTO contato(nome, telefone) values ('"+ nome + "','"+ telefone +"');";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro na Inserção");
			System.out.println(e.getMessage());
		}
		
	}
	
	public void listarContato() {
		String query;
		try {
			query = "SELECT * FROM contato ORDER BY nome";
			this.resultset = statement.executeQuery(query);
				while (this.resultset.next()) {
					System.out.println("Codigo: " + this.resultset.getString("id"));
					System.out.println("Nome: " + this.resultset.getString("nome"));
					System.out.println("Fone: " + this.resultset.getString("telefone"));
				}
			} catch (Exception e) {
				System.out.println("Erro no SELECT");
				System.out.println(e.getMessage());
			}
		}

	public void apagarContato(String id) {
		String query;
		try {
			query = "DELETE FROM contato WHERE id =" + id;
			this.statement.executeUpdate(query);
		} catch(Exception e) {
			System.out.println("Erro no Delete");
			System.out.println(e.getMessage());
		}
		
	}
	
	public void atualizarContato(String id, String nome, String telefone) {
		String query;
		try {
			query = "UPDATE contato SET nome = '"+ nome + "', telefone ='"+ telefone + "' WHERE id =" +id+";";
			this. statement .executeUpdate(query);
		} catch (Exception e) {
			System.out .println("Erro na ATUALIZACAO");
			System.out.println(e. getMessage());
		}
	}
	
}




















