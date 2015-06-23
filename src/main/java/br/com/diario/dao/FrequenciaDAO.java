package br.com.diario.dao;

import javax.ejb.Stateless;

import br.com.diario.model.Frequencia;

@Stateless
public class FrequenciaDAO extends AbstractDAO<Frequencia>{
	
	public FrequenciaDAO() {
		super(Frequencia.class);
	}

}
