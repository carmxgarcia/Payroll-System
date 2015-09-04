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

@WebServlet("/allpayslip")
public class PayslipAllController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public PayslipAllController() {
        super();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CutOffDao cutoffdao = new CutOffDao();
		UserCutOffDao usercutoffdao = new UserCutOffDao();
		
		List<CutOff> cutoffs = cutoffdao.findAll();
		List<UserCutOff> usercutoffs = usercutoffdao.findAllUserPayslip(Integer.parseInt(request.getParameter("id")));
		/*UserCutOff usercutoff = usercutoffdao.findById*/
		
		request.setAttribute("cutoffs",cutoffs);
		request.setAttribute("usercutoffs",usercutoffs);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/cutoffdates.jsp");
		dispatcher.forward(request,response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

