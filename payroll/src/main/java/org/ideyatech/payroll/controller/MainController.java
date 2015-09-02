package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ideyatech.payroll.entity.User;
import org.ideyatech.payroll.util.PersistenceUtil;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class MainController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select u from User u");
		List<User> users = query.getResultList();
		for(User user: users){
			System.out.println(user.getFirstName());
		}
		
		/*
		System.out.println("Books = " + users);*/
		return;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

