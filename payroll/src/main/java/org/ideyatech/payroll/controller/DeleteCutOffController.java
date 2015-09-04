package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ideyatech.payroll.dao.CutOffDao;
import org.ideyatech.payroll.dao.UserCutOffDao;
import org.ideyatech.payroll.dao.UserDao;
import org.ideyatech.payroll.entity.User;
import org.ideyatech.payroll.entity.UserCutOff;

@WebServlet("/deletecutoff")
public class DeleteCutOffController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCutOffController() {
        super();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CutOffDao cutoffDao = new CutOffDao();
		
		UserCutOffDao usercutoffDao = new UserCutOffDao();
		List<UserCutOff> usercutoff = usercutoffDao.findAllUserCutOff(Integer.parseInt(request.getParameter("id")));
		
		for(UserCutOff uc: usercutoff){
			usercutoffDao.delete(uc.getId());
		}
		
		cutoffDao.delete(Integer.parseInt(request.getParameter("id")));
		
		
		
		response.sendRedirect("/cutoff");
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		return;
	}

}

