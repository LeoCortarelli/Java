package Problema3;

import java.util.ArrayList;

public class ProxyBuscaLivro implements BuscaLivroInterface{
	
	BuscaLivro busca = new BuscaLivro();
	
	public ArrayList<Livro> buscaPorAutor(String autor){
		
		ArrayList<Livro> listaPorAutor = new ArrayList<>();
		
		if(autor == "Dan Brown") {
			listaPorAutor.add(new Livro("Dan Brown","Origem", 471003));
			listaPorAutor.add(new Livro("Dan Brown","Codigo Da vinci", 854129));
			listaPorAutor.add(new Livro("Dan Brown","Inferno", 632178));
		}else {
			listaPorAutor = busca.buscaPorAutor(autor);
		}
		return listaPorAutor;	
	}
	
	
	
	public ArrayList<Livro> buscaPorTitulo(String titulo){	
		ArrayList<Livro> listaPorTitulo = new ArrayList<>();
		
		if(titulo == "Dan Brown") {
			listaPorTitulo.add(new Livro("Clarisse Lispector","A hora da estrela", 569887));
			listaPorTitulo.add(new Livro("Clarisse Lispector","Felicidade Clandestina", 362587));
			listaPorTitulo.add(new Livro("Clarisse Lispector","Laços de familia", 874123));
		}else {
			listaPorTitulo = busca.buscaPorAutor(titulo);
		}
		return listaPorTitulo;	
	}
	
	public Livro buscaPorIsbm(int ibsm) {
		
		Livro livro = new Livro();
		
		if(ibsm == 326456) {
			livro = new Livro("Jose de alencar","Guarani", 326456);
		}else {
			livro = busca.buscaPorIsbm(ibsm);
		}
		return livro;
	}
	
	
}
