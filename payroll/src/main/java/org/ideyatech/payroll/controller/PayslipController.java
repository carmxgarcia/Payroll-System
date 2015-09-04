package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.util.Date;

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
import org.ideyatech.payroll.util.AbsencesUtil;
import org.ideyatech.payroll.util.OvertimeUtil;
import org.ideyatech.payroll.util.TardinessUtil;
import org.ideyatech.payroll.util.TaxUtil;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/payslip")
public class PayslipController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public PayslipController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserCutOffDao userCutOffDao = new UserCutOffDao();
		
		UserCutOff userCutOff = userCutOffDao.findById(Integer.parseInt(request.getParameter("id")));
		
		
		request.setAttribute("userCutOff", userCutOff);
		Double overtime = OvertimeUtil.getOvertimeAmount(userCutOff.getOvertime(), userCutOff.getBasicsalary(), userCutOff.getCutOff().getWorkingdays());
		request.setAttribute("overtime", overtime);
		Double tardiness = TardinessUtil.getTardinessAmount(userCutOff.getTardiness(), userCutOff.getBasicsalary(), userCutOff.getCutOff().getWorkingdays());
		request.setAttribute("tardiness", tardiness);
		Double absense = AbsencesUtil.getAbsencesAmount(userCutOff.getAbsence(), userCutOff.getBasicsalary(), userCutOff.getCutOff().getWorkingdays());
		request.setAttribute("absence", absense);
		
		Double totalTaxable = userCutOff.getBasicsalary() + userCutOff.getOthertaxable() - overtime - tardiness - absense - userCutOff.getPagIbig() - userCutOff.getPhilhealth() - userCutOff.getSss();;
		Double taxWitholding =  TaxUtil.getTaxAmount(totalTaxable, (int)userCutOff.getNumberofdependents());
		
		request.setAttribute("tax", taxWitholding);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("payslip.jsp");
		dispatcher.forward(request, response);
		
		
		return;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

