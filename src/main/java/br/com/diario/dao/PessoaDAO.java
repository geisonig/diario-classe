package br.com.diario.dao;

import javax.ejb.Stateless;

import br.com.diario.model.Pessoa;

@Stateless
public class PessoaDAO extends AbstractDAO<Pessoa> {
	
	public PessoaDAO() {
		super(Pessoa.class);
	}
}
