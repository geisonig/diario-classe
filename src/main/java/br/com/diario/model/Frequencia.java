package br.com.diario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "frequencia")
@SequenceGenerator(name = "frequencia_codigo", sequenceName = "frequencia_codigo")
public class Frequencia implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "frequencia_codigo", strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name = "codigo_aluno", referencedColumnName = "codigo")
	private Estudante estudante;
	
	
	@Column(name = "aula")
	private int aula;
	
	@Column(name = "presenca", length = 1)
	@Size(max = 1)
	private char presenca;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}


	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	public char getPresenca() {
		return presenca;
	}

	public void setPresenca(char presenca) {
		this.presenca = presenca;
	}
}
