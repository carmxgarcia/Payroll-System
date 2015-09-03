package org.ideyatech.payroll.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.ideyatech.payroll.entity.CutOff;
import org.ideyatech.payroll.util.PersistenceUtil;

public class CutOffDao {
	
	EntityManager em = PersistenceUtil.getEntityManager();

	public void add(CutOff entity) {
		
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void update(CutOff entity) {
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	public CutOff findById(int id) {
		em.getTransaction().begin();
		CutOff cutOff = (CutOff) em.find(CutOff.class, id);
		em.getTransaction().commit();
		return cutOff; 
	}

	public void delete(int id) {
		em.getTransaction().begin();
		CutOff cutOff = (CutOff) em.find(CutOff.class, id);
		if (cutOff != null) {
			em.remove(cutOff); 
		}
		em.getTransaction().commit();
	}

	public List<CutOff> findAll() {
		em.getTransaction().begin();
		Query query = em.createQuery("select u from CutOff u");
		List<CutOff> cutOffs = query.getResultList();
		em.getTransaction().commit();
		return cutOffs;
	}
	
}
