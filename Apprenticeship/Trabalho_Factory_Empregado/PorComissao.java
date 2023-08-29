package Trabalho_Factory_Empregado;

public class PorComissao extends Empregado{
	private double salario;
	private double comissao;
	private int vendas;
	
	public PorComissao(String nome, String email, int anoContratacao) {
		super(nome,email,anoContratacao);
	}
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	
	
	

	@Override
	public String toString() {
		return "PorComissao [salario=" + salario + ", comissao=" + comissao + ", vendas=" + vendas + ", tempoCasa()="
				+ tempoCasa() + ", getAnoContratacao()=" + getAnoContratacao() + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + "]";
	}

	public double ganha(){
		double salarioFinal = (this.salario + this.comissao) * this.vendas;
		return salarioFinal;
	}
}
