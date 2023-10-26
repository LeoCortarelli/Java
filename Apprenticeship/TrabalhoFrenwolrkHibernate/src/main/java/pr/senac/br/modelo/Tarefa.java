package pr.senac.br.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarefa {
	@Id
	@GeneratedValue
	private Long id;  // Gera uma tabela 
	
	private String descricao;
	private boolean finalizado;
	private LocalDate dataConclusao;

	
	
	
	

	public Tarefa(Long id, String descricao, boolean finalizado, LocalDate dataConclusao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.finalizado = finalizado;
		this.dataConclusao = dataConclusao;
	}



	public Tarefa() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public boolean isFinalizado() {
		return finalizado;
	}



	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}



	public LocalDate getDataConclusao() {
		return dataConclusao;
	}



	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}



	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", descricao=" + descricao + ", finalizado=" + finalizado + ", dataConclusao="
				+ dataConclusao + "]";
	}



	
	
	
}
