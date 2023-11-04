package pr.senac.br.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int numero;
	
	private double saldo;
	
	
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
}
