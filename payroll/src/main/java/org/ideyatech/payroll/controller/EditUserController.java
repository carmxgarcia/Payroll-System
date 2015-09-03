package org.ideyatech.payroll.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ideyatech.payroll.dao.UserDao;
import org.ideyatech.payroll.entity.User;

@WebServlet("/edit")
public class EditUserController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserController() {
        super();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select u from User u");
		List<User> users = query.getResultList();
		for(User user: users){
			System.out.println(user.getFirstName());
		}*/
		
		/*
		System.out.println("Books = " + users);*/
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao userDao = new UserDao();
		User user = userDao.findById(Integer.parseInt(request.getParameter("userId")));
		
		user.setFirstName(request.getParameter("inputFirstName"));
		user.setLastName(request.getParameter("inputLastName"));
		user.setMiddleName(request.getParameter("inputMiddleName"));
		user.setAge(Integer.parseInt(request.getParameter("inputAge")));
		user.setBasicSalary(Double.parseDouble(request.getParameter("inputBasicSalary")));
		user.setNumberOfDependents(Integer.parseInt(request.getParameter("inputDependents")));
		user.setOtherTaxable(Double.parseDouble(request.getParameter("inputTaxable")));
		user.setNonTaxable(Double.parseDouble(request.getParameter("inputNonTaxable")));
		
		userDao.update(user);
		
		response.sendRedirect("/user");
		
		return;
	}

}

