package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ideyatech.payroll.dao.CutOffDao;
import org.ideyatech.payroll.dao.UserCutOffDao;
import org.ideyatech.payroll.dao.UserDao;
import org.ideyatech.payroll.entity.CutOff;
import org.ideyatech.payroll.entity.User;
import org.ideyatech.payroll.entity.UserCutOff;
import org.ideyatech.payroll.util.PersistenceUtil;

@WebServlet("/usercutoff")
public class UserCutOffController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public UserCutOffController() {
        super();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserCutOffDao usercutoffdao = new UserCutOffDao();
		UserDao userdao = new UserDao();
		CutOffDao cutoffdao = new CutOffDao();
		List<UserCutOff> usercutoff= usercutoffdao.findAllUserCutOff(Integer.parseInt(request.getParameter("id")));
		List<User> user= userdao.findAll();
		CutOff cutoff= cutoffdao.findById(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("usercutoff",usercutoff);
		request.setAttribute("user",user);
		request.setAttribute("cutoff",cutoff);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/addCutoff.jsp");
		dispatcher.forward(request,response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

