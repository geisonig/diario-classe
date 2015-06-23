package br.com.diario.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "alunoturma")
@PrimaryKeyJoinColumn(name = "codigo_aluno", referencedColumnName = "codigo")
@SequenceGenerator(name = "alunoturma_codigo", sequenceName = "alunoturma_codigo")
public class Estudante extends Pessoa {

	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator = "alunoturma_codigo", strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	private Long estudanteId;

	@ManyToOne
	@JoinColumn(name = "codigo_turma", referencedColumnName = "codigo")
	private Turma turma;

	@OneToMany(mappedBy = "estudante", fetch = FetchType.EAGER)
	private List<Frequencia> frequencia;

	public Long getEstudanteId() {
		return estudanteId;
	}

	public void setEstudanteId(Long estudanteId) {
		this.estudanteId = estudanteId;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<Frequencia> getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(List<Frequencia> frequencia) {
		this.frequencia = frequencia;
	}

}