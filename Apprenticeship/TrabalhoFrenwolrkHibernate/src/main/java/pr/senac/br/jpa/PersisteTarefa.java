package pr.senac.br.jpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import pr.senac.br.modelo.Tarefa;

/**
 * Classe que controla as Tarefas: permite cadastrar, alterar, excluir.
 * Faz o acesso ao banco de dados. 
 */

public class PersisteTarefa {

	private EntityManager manager;

	
	public PersisteTarefa() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
		manager = factory.createEntityManager();
	}

	
	public ArrayList<Tarefa> listarTodos() {
		return null;
	}

	
	public boolean cadastrarTarefa(Tarefa tarefa) {
		try {
			manager.getTransaction().begin();
			manager.persist(tarefa);
			manager.getTransaction().commit();
			return true;
		} catch(PersistenceException e) {
			System.out.println("Erro na inclusão da TAREFA" + tarefa.toString());
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	public Tarefa buscarTarefaCodigo(Long codigo) {		
		Tarefa encontra = manager.find(Tarefa.class, codigo);
		return encontra;
	}
	
	
	public boolean excluirTarefa(Long codigo) {	
		Tarefa tarefa = manager.find(Tarefa.class, codigo);
		try {
			manager.getTransaction().begin();
			manager.remove(tarefa);
			manager.getTransaction().commit();
			return true;
		} catch(PersistenceException e) {
			System.out.println("Erro ao excluir tarefa");
			System.out.println(e.getMessage());
			return false;
		}
		
	}
	

	public boolean concluirTarefa(Long codigo) {	
		LocalDate dataConclusao = LocalDate.now();
		Tarefa tarefa = manager.find(Tarefa.class, codigo);
		
		if(tarefa.isFinalizado() == false) {
			tarefa.setFinalizado(true);
			tarefa.setDataConclusao(dataConclusao);
			manager.getTransaction().begin();
			manager.merge(tarefa);
			manager.getTransaction().commit();
			return true;
		}else {
			return false;
		}
	}
	

}