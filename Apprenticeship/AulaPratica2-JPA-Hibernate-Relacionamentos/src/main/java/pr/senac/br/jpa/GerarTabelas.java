package pr.senac.br.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_pratica2");
		
		factory.close();
		
	}
}
