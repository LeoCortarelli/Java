package Problema3;

import java.util.ArrayList;

public interface BuscaLivroInterface {
	
	public ArrayList<Livro>buscaPorAutor(String autor);
	public ArrayList<Livro>buscaPorTitulo(String titulo);
	public Livro buscaPorIsbm(int isbn);
	
}
