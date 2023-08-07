package ExemploSingleton1;

public class Singleton {
	
//	Crie uma classe chamada de Singleton conforme os passos abaixo
//	a. Adicione um atributo privado estático na classe para o armazenamento da instância singleton.
	private static Singleton instancia;
	
//	b. Crie um construtor privado
	private Singleton() {
		
	}
	
//	c. Crie o método get() publico estático.
//	i. Se o atributo da classe for null, instancie o objeto
//	ii. Senão, retorne o objeto
	public static Singleton getInstancia() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
	
	
}
