package TRAB;


public class Principal {

	public static void main(String[] args) {
		Livro objLivro1 = new Livro(001,1000,"Joana","DrogaLivro",600);
		Midia objMidia1 = new Midia(002,1000,"Biro");

		
		System.out.println(objLivro1.calculaImposto());
		System.out.println(objMidia1.calculaImposto());
	}

}
