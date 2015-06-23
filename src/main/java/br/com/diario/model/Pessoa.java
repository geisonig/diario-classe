package br.com.diario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "pessoa_codigo", sequenceName = "pessoa_codigo")
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "pessoa_codigo", strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	private Long codigo;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "ddd", length = 4)
	@Size(max = 4)
	private String ddd;
	
	@Column(name = "telefone", length = 20)
	@Size(max = 20)
	private String telefone;
	
	@Size(max = 255)
	@Column(name = "endereco", length = 255)
	private String endereco;
	
	@NotNull
	@Size(max = 128)
	@Column(name = "email", length = 128)
	private String email;
	
	@NotNull
	@Column(name = "tipo")
	@Type(type = "true_false")
	private boolean tipo;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "senha")
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


}
