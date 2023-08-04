package TRAB;

public abstract class Produto {
	private int codigo;
	private double preco;
	
	public Produto(int codigo, double preco) {
		super();
		this.codigo = codigo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract double calculaImposto();
	
}
