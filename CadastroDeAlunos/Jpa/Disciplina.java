package pr.senac.br.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(length = 60, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int cargaHoraria;
	
	@Column(nullable = false)
	private double nota1;
	
	@Column(nullable = false)
	private double nota2;
	
	@Column(nullable = false)
	private double nota3;
	
	@Column(nullable = false)
	private double nota4;
	
	
	
	
	public boolean aprovado() {
		double media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}


	

	public Disciplina(String nome, int cargaHoraria, double nota1, double nota2, double nota3, double nota4) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}


	


	public int getCodigo() {
		return codigo;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getCargaHoraria() {
		return cargaHoraria;
	}




	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}




	public double getNota1() {
		return nota1;
	}




	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}




	public double getNota2() {
		return nota2;
	}




	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}




	public double getNota3() {
		return nota3;
	}




	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}




	public double getNota4() {
		return nota4;
	}




	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}




	public Disciplina() {
		super();
	}




	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", aprovado()=" + aprovado() + "]";
	}




	




	
	
	
	
	
}
