package br.com.diario.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class AbstractDAO<T> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private Class<T> clazz;
	
	public AbstractDAO(Class<T> type) {
		this.clazz = type;
	}
	
	@Transactional
	public void save(T t) {
		this.entityManager.persist(t);
	}
	
	@Transactional
	public void update(T t) {
		this.entityManager.merge(t);
	}
	
	
	@Transactional
	public void delete(T t) {
		this.entityManager.remove(t);
	}
	
	public T get(Long id) {
		return(T) this.entityManager.find(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return this.entityManager.createQuery(getSelectClause()).getResultList();
	}

	private String getSelectClause() {
		return "select t from " + clazz.getSimpleName();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
