package TRAB;

public class Livro extends Produto{
	private String autor;
	private String editora;
	private int paginas;
	
	public Livro(int codigo, double preco, String autor, String editora, int paginas) {
		super(codigo, preco);
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public double calculaImposto() {
		double valor  = getPreco() * 0.01;
		return valor;
	}
}
