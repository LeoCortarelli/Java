package Trabalho;

public class Empregado {
	private double salario;
	private int numFilhos;
	
	
	public Empregado(double salario, int numFilhos) {
		super();
		this.salario = salario;
		this.numFilhos = numFilhos;
	}


	public Empregado() {
		
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getNumFilhos() {
		return numFilhos;
	}

 
	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}
	
 	 
	public double calculaINSS() {
		if(salario <= 1399.12) {
			double result = salario * 0.08;
			return result;
		}else if(salario > 1399.13 && salario <= 2331.88) {
			double result = salario * 0.09;
			return result;
		}else{
			double result = salario * 0.11;
			return result;
		}
	}
	
	public double calculaIR() {
		
		double deducao = this.numFilhos * 189.59;
		double salarioPosDesconto = this.salario - calculaINSS() - deducao;
		
		if(salarioPosDesconto <= 1903.98) {
			return 0;
		}else if(salarioPosDesconto >= 1903.99 && salarioPosDesconto <= 2826.65) {
			double result = salarioPosDesconto * 0.075;
			return result;
		}else if(salarioPosDesconto >= 2826.66	 && salarioPosDesconto <= 3751.05) {
			double result = salarioPosDesconto * 0.15;
			return result;
		}else if(salarioPosDesconto >= 3751.06	 && salarioPosDesconto <= 4664.68) {
			double result = salarioPosDesconto * 0.225;
			return result;
		}else {
			double result = salarioPosDesconto * 0.27; 
			return result;
		}
	}
	
	public double calculaSalarioLiq() {
		return this.salario - calculaINSS() - calculaIR();
	} 
}
