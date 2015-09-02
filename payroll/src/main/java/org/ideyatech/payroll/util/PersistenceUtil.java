package org.ideyatech.payroll.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
	
	private static EntityManagerFactory em = null;
	
	public static synchronized EntityManager getEntityManager() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory("payroll");
		}
		
		return em.createEntityManager();
	}
}
