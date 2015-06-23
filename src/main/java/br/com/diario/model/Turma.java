package br.com.diario.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "turma")
@SequenceGenerator(name = "turma_codigo", sequenceName = "turma_codigo")
public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "turma_codigo", strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	private Long codigo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_disciplina", referencedColumnName = "codigo")
	private Disciplina disciplina;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_professor", referencedColumnName = "codigo")
	private Pessoa professor;

	@Column(name = "datainicio")
	private Date dataInicial;

	@Column(name = "datafim")
	private Date dataFinal;

	@Column(name = "quantidadeaulas")
	private Integer aulas;

	@OneToMany(mappedBy = "turma", fetch = FetchType.EAGER)
	private List<Estudante> estudantes;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Pessoa getProfessor() {
		return professor;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Integer getAulas() {
		return aulas;
	}

	public void setAulas(Integer aulas) {
		this.aulas = aulas;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}


}
