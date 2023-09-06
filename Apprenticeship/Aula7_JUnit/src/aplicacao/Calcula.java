package aplicacao;

public class Calcula {
	
	public double soma(double n1, double n2) {
		return n1 + n2;
	}
	
	public double subtrai(double n1, double n2) {
		return n1 - n2;
	}
	
	public double multiplica(double n1, double n2) {
		return n1 * n2;
	}
	
	public String par_impar(int num) {
		if(num < 0) {
			return null;
		}else if(num % 2 == 0) {
			return "PAR";
		}else {
			return "IMPAR";
		}
	}
	
	public boolean maior(int n1, int n2) {
		if(n1 >= n2) {
			return true;
		}else {
			return false;
		}
	}
}
