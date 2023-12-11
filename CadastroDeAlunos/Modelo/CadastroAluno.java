package pr.senac.br.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import pr.senac.br.modelo.Aluno;
import pr.senac.br.modelo.Disciplina;


public class CadastroAluno {

	public static void main(String[] args) {
		
		ArrayList<Disciplina> diciplinas = new ArrayList<>();
		Aluno alunos = new Aluno();
		
		alunos.setCpf("111");
		alunos.setNome("Marcos");
		alunos.setEmail("m@gmail.com");
		alunos.setSexo("m");
		diciplinas.add(new Disciplina("Banco de dados", 40, 75, 80, 80, 70));
		diciplinas.add(new Disciplina("Algoritimos", 60, 60, 70, 80, 60));
		diciplinas.add(new Disciplina("Programação", 60, 70, 80, 60, 50));
		alunos.setDiciplinas(diciplinas);
		
		
		ArrayList<Disciplina> diciplinas2 = new ArrayList<>();
		Aluno alunos2 = new Aluno();
		
		alunos2.setCpf("222");
		alunos2.setNome("Maria");
		alunos2.setEmail("ma@gmail.com");
		alunos2.setSexo("f");
		diciplinas2.add(new Disciplina("Algoritimos", 60, 70, 70, 80, 80));
		diciplinas2.add(new Disciplina("Programação", 60, 70, 75, 65, 60));
		alunos2.setDiciplinas(diciplinas2);
		
		ArrayList<Disciplina> diciplinas3 = new ArrayList<>();
		Aluno alunos3 = new Aluno();
		
		alunos3.setCpf("333");
		alunos3.setNome("Joao");
		alunos3.setEmail("j@gmail.com");
		alunos3.setSexo("f");
		diciplinas3.add(new Disciplina("Algoritimos", 60, 20, 30, 30, 20));
		alunos3.setDiciplinas(diciplinas3);
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("prova");
		EntityManager manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.persist(alunos);
			manager.persist(alunos2);
			manager.persist(alunos3);
			manager.getTransaction().commit();
		}catch(PersistenceException e){
			System.out.println("Erro na inclisão do aluno");
			System.out.println(e.getMessage());
		}
		
		
		
		//  EXCLUIR O JOAO
		int matricula = 3;
		Aluno aluno = manager.find(Aluno.class, matricula);
		try {
			manager.getTransaction().begin();
			manager.remove(aluno);
			manager.getTransaction().commit();
		} catch(PersistenceException e) {
			System.out.println("Erro ao excluir aluno");
			System.out.println(e.getMessage());
		}
		
		
		// Atualizar email maria
		int matriculaAtualiza = 2;
		Aluno alunodelete = manager.find(Aluno.class, matriculaAtualiza);
		
		aluno.setEmail("maria@gmail.com");
		manager.getTransaction().begin();
		manager.merge(alunodelete);
		manager.getTransaction().commit();
		
		
		// Quantidades de alunos cadastrados
		Query consulta = manager.createQuery("select count(a) from Aluno a");
		Long contador = (Long)consulta.getSingleResult();
		System.out.println("Quantidade: "+ contador);
		
				
		
		System.out.println("\n ------------------------------------ \n");
		
		// Listar todos os alunos
		Query consulta2 = manager.createQuery("select a from Aluno a");
		List <Aluno> alunosListar = consulta2.getResultList();
		for(Aluno alun : alunosListar) {
			System.out.println("Aluno: "+alun.toString());
		}
		
		
		System.out.println("\n ------------------------------------ \n");
		
		// Listando todos sexo feminino
		Query consulta3 = manager.createQuery("select a from Aluno a where a.sexo = :sexo");
		consulta3.setParameter("sexo", "f");
		List <Aluno> alunosListarfeminino = consulta3.getResultList();
		for(Aluno alun : alunosListarfeminino) {
			System.out.println("Aluno: "+alun.toString());
		}
		
		
		System.out.println("\n ------------------------------------ \n");
		
		// Listando todos sexo Masculino
		Query consulta4 = manager.createQuery("select a from Aluno a where a.sexo = :sexo");
		consulta4.setParameter("sexo", "m");
		List <Aluno> alunosListarMasculino = consulta4.getResultList();
		for(Aluno alun : alunosListarMasculino) {
			System.out.println("Aluno: "+alun.toString());
		}
		
		
		
		

	}

}
