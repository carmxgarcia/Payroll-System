package org.ideyatech.payroll.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.ideyatech.payroll.entity.User;
import org.ideyatech.payroll.util.PersistenceUtil;

public class UserDao {
	
	EntityManager em = PersistenceUtil.getEntityManager();

	public void persist(User entity) {
		em.persist(entity);
	}

	public void update(User entity) {
		em.persist(entity);
	}

	public User findById(int id) {
		User user = (User) em.find(User.class, id);
		return user; 
	}

	public void delete(int id) {
		User user = (User) em.find(User.class, id);
		if (user != null) {
			em.remove(user); 
		}
	}

	public List<User> findAll() {
		Query query = em.createQuery("select u from User u");
		List<User> users = query.getResultList();
		return users;
	}
	
}
