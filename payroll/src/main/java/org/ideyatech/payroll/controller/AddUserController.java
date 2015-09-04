package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ideyatech.payroll.dao.UserDao;
import org.ideyatech.payroll.entity.User;

@WebServlet("/add")
public class AddUserController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserController() {
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
		User user = new User();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date date = null;
		try {
			date = (Date) format.parse(request.getParameter("inputBirthDay"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user.setFirstName(request.getParameter("inputFirstName"));
		user.setLastName(request.getParameter("inputLastName"));
		user.setMiddleName(request.getParameter("inputMiddleName"));
		user.setSex(request.getParameter("inputGender"));
		user.setDateOfBirth(date);
		user.setAge(Integer.parseInt(request.getParameter("inputAge")));
		user.setBasicSalary(Double.parseDouble(request.getParameter("inputBasicSalary")));
		user.setMaritalStatus(request.getParameter("inputMarital"));
		user.setNumberOfDependents(Integer.parseInt(request.getParameter("inputDependents")));
		user.setOtherTaxable(Double.parseDouble(request.getParameter("inputTaxable")));
		user.setNonTaxable(Double.parseDouble(request.getParameter("inputNonTaxable")));
		user.setVacationleave(10);
		user.setSickleave(10);
		
		userDao.add(user);
		
		response.sendRedirect("/user");
		
		return;
	}

}

