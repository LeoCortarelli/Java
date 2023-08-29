package Trabalho_Factory_Empregado;

public class PorHora extends Empregado{
	private double valorHoras;
	private double quantHoras;
	
	
	public PorHora(String nome, String email, int anoContratacao) {
		super(nome,email,anoContratacao);
	}


	public double getValorHoras() {
		return valorHoras;
	}


	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}


	public double getQuantHoras() {
		return quantHoras;
	}


	public void setQuantHoras(double quantHoras) {
		this.quantHoras = quantHoras;
	}


	


	@Override
	public String toString() {
		return "PorHora [valorHoras=" + valorHoras + ", quantHoras=" + quantHoras + ", tempoCasa()=" + tempoCasa()
				+ ", getAnoContratacao()=" + getAnoContratacao() + ", getNome()=" + getNome() + ", getEmail()="
				+ getEmail() + "]";
	}


	public double ganha() {
		double salarioFinal = this.valorHoras * this.quantHoras;
		return salarioFinal;
	}
	
}
