package org.ideyatech.payroll.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.ideyatech.payroll.entity.User;
import org.ideyatech.payroll.util.PersistenceUtil;

public class UserDao {
	
	EntityManager em = PersistenceUtil.getEntityManager();

	public void add(User entity) {
		
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void update(User entity) {
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	public User findById(int id) {
		em.getTransaction().begin();
		User user = (User) em.find(User.class, id);
		em.getTransaction().commit();
		return user; 
	}

	public void delete(int id) {
		em.getTransaction().begin();
		User user = (User) em.find(User.class, id);
		if (user != null) {
			em.remove(user); 
		}
		em.getTransaction().commit();
	}

	public List<User> findAll() {
		em.getTransaction().begin();
		Query query = em.createQuery("select u from User u");
		List<User> users = query.getResultList();
		em.getTransaction().commit();
		return users;
	}
	
}
