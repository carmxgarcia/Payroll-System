package org.ideyatech.payroll.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.ideyatech.payroll.entity.UserCutOff;
import org.ideyatech.payroll.util.PersistenceUtil;

public class UserCutOffDao {
	
	EntityManager em = PersistenceUtil.getEntityManager();

	public void add(UserCutOff entity) {
		
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void update(UserCutOff entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
	}

	public UserCutOff findById(int id) {
		em.getTransaction().begin();
		UserCutOff usercutoff = (UserCutOff) em.find(UserCutOff.class, id);
		em.getTransaction().commit();
		return usercutoff; 
	}

	public void delete(int id) {
		em.getTransaction().begin();
		UserCutOff usercutoff = (UserCutOff) em.find(UserCutOff.class, id);
		if (usercutoff != null) {
			em.remove(usercutoff); 
		}
		em.getTransaction().commit();
	}

	public List<UserCutOff> findAll() {
		em.getTransaction().begin();
		Query query = em.createQuery("select u from UserCutOff u");
		List<UserCutOff> usercutoff = query.getResultList();
		em.getTransaction().commit();
		return usercutoff;
	}
	
	public List<UserCutOff> findAllUserCutOff(int cutOffID){
		em.getTransaction().begin();
		Query query = em.createQuery("select u from UserCutOff u where u.cutOff.id = " + cutOffID);
		List<UserCutOff> usercutoffs = query.getResultList();
		em.getTransaction().commit();
		return usercutoffs;
	}
	
}
