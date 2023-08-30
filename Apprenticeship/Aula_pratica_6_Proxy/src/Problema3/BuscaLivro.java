package Problema3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BuscaLivro implements BuscaLivroInterface{
	
	public ArrayList<Livro> buscaPorAutor(String autor){
		
		ArrayList<Livro> listaPorAutor = new ArrayList<>();
		System.out.println("INICIANDO O PROCESSO DE BUSCA NO BANCO DE DADOS");
		listaPorAutor.add(new Livro("Clarisse Lispector","A hora da estrela", 569887));
		listaPorAutor.add(new Livro("Clarisse Lispector","Felicidade Clandestina", 362587));
		listaPorAutor.add(new Livro("Clarisse Lispector","Laços de familia", 874123));
		System.out.println("ENCERRANDO O PROCESSO DE BUSCA NO BANCO DE DADOS");
		
		return listaPorAutor;
	}
	
	
	public ArrayList<Livro> buscaPorTitulo(String titulo){
		
		ArrayList<Livro> listaPorTitulo = new ArrayList<>();
		System.out.println("INICIANDO O PROCESSO DE BUSCA NO BANCO DE DADOS");
		listaPorTitulo.add(new Livro("Jorge Amado","Capitães de areia", 98875));
		System.out.println("ENCERRANDO O PROCESSO DE BUSCA NO BANCO DE DADOS");
		
		return listaPorTitulo;
	}
	
	public Livro buscaPorIsbm(int ibsm){
		
		ArrayList<Livro> listaPorTitulo = new ArrayList<>();
		System.out.println("INICIANDO O PROCESSO DE BUSCA NO BANCO DE DADOS");
		Livro livro = new Livro("Carlos Drumont de Andrade","Poemas", 111111);
		System.out.println("ENCERRANDO O PROCESSO DE BUSCA NO BANCO DE DADOS");
		
		return livro;
	}
	
}
