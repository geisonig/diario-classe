package br.com.diario.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.diario.model.Estudante;

@Stateless
@SuppressWarnings("unchecked")
public class EstudanteDAO extends AbstractDAO<Estudante> {

	public EstudanteDAO() {
		super(Estudante.class);
	}

	@Override
	public List<Estudante> getAll() {
		return getEntityManager().createQuery("select p from Pessoa p where p.type = false").getResultList();
	}

}