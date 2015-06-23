package br.com.diario.dao;

import javax.ejb.Stateless;

import br.com.diario.model.Turma;

@Stateless
public class TurmaDAO extends AbstractDAO<Turma> {

	public TurmaDAO() {
		super(Turma.class);
	}

}