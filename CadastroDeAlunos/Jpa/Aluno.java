package pr.senac.br.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Aluno {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int matricula;
	
	@Column(nullable= false, length = 11, unique = true)
	private String cpf;
	
	@Column(length = 60, nullable = false)
	private String nome;
	
	@Column(length = 40, nullable = false)
	private String email;
	
	@Column(length = 1, nullable = false)
	private String sexo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="diciplina")
	private List <Disciplina> diciplinas;

	
	
	



	public Aluno(String cpf, String nome, String email, String sexo, List<Disciplina> diciplinas) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.diciplinas = diciplinas;
	}


	
	

	public Aluno() {
		super();
	}





	public String getSexo() {
		return sexo;
	}





	public void setSexo(String sexo) {
		this.sexo = sexo;
	}





	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public List<Disciplina> getDiciplinas() {
		return diciplinas;
	}



	public void setDiciplinas(List<Disciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}



	public int getMatricula() {
		return matricula;
	}





	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", sexo="
				+ sexo + ", diciplinas=" + diciplinas + "]";
	}





	





	





	
	
	
	
	
}
