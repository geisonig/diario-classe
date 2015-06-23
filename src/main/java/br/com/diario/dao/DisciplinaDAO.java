package br.com.diario.dao;

import javax.ejb.Stateless;

import br.com.diario.model.Disciplina;

@Stateless
public class DisciplinaDAO extends AbstractDAO<Disciplina> {
	
	public DisciplinaDAO() {
		super(Disciplina.class);
	}

}
