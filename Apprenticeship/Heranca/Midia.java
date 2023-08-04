package TRAB;

public class Midia extends Produto{
	private String artista;

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Midia(int codigo, double preco, String artista) {
		super(codigo, preco);
		this.artista = artista;
	}

	public double calculaImposto() {
		double valor  = this.getPreco() * 0.05;
		return valor;
	}
}
