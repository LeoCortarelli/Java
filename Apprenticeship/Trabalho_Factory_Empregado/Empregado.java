package Trabalho_Factory_Empregado;

import java.time.LocalDate;

public abstract class Empregado {
	private String nome;
	private String email;
	private int anoContratacao;
	
	public int tempoCasa() {
		LocalDate data_local = LocalDate.now();
		int anoAtual = data_local.getYear();
		
		int result = anoAtual - this.anoContratacao;
		return result;
	}
	
	public Empregado(String nome, String email, int anoContratacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.anoContratacao = anoContratacao;
	}

	public Empregado() {
		
	}
		
	public int getAnoContratacao() {
		return anoContratacao;
	}

	public void setAnoContratacao(int anoContratacao) {
		this.anoContratacao = anoContratacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + "]";
	}
	
	public abstract double ganha();
}
