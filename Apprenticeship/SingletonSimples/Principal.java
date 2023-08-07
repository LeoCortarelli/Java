package ExemploSingleton1;

public class Principal {

	public static void main(String[] args) {
		
//		2) Crie uma classe que contenha o método main(). No main() instancie um objeto denominado sing_01, da classe
//		Singleton, utilizando o construtor. O que aconteceu ? Por que a mensagema abaixo
		
//		Singleton sing_01 = new Singleton();
		
		// R: voce não consegue porque ele e um metodo private e so pode ser acessado na mesma classe.
		
		
		
//		2.1) Crie dois objetos da classe Singleton (sing_01 e sing_02), via método estático getInstancia(), conforme
//		abaixo:
		
		Singleton sing_01 = Singleton.getInstancia();
		Singleton sing_02 = Singleton.getInstancia();
		
		if(sing_01 == sing_02) {
			System.out.println("Esses dois objetos SÃO IGUAIS");
		}else {
			System.out.println("Esses dois objetos NÃO IGUAIS");
		}
//		Qual é o resultado da execução desse programa. Por que ?
		// Eles serão iguais porque todo objeto criado ESTA APONTANDO PARA O MESMO OBJETO (ele vai RETURN sempre para o mesmo objeto)
		
	}

}
