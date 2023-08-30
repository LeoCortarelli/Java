package Problema3;

public class Livro {
	private String autor;
	private String titulo;
	private int isbn;
	
	public Livro(String autor, String titulo, int isbn) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	public Livro() {
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", isbn=" + isbn + "]";
	}
	
	
	
}
