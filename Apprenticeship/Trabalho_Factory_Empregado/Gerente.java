package Trabalho_Factory_Empregado;

public class Gerente extends Empregado{
	private double salario;

	public Gerente(String nome, String email, int anoContratacao) {
		super(nome,email,anoContratacao);
	}

	public Gerente() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + ", tempoCasa()=" + tempoCasa() + ", getAnoContratacao()="
				+ getAnoContratacao() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + "]";
	}

	public double ganha() {
		return this.salario;
	}
	
}
