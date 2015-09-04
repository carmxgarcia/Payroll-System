package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
import org.ideyatech.payroll.util.PagibigUtil;
import org.ideyatech.payroll.util.PhilhealthUtil;
import org.ideyatech.payroll.util.SSSUtil;
import org.ideyatech.payroll.util.TaxUtil;

@WebServlet("/generate")
public class GenerateCutOffController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateCutOffController() {
        super();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CutOffDao cutoffdao = new CutOffDao();
		UserCutOffDao usercutoffdao = new UserCutOffDao();
		UserDao userdao = new UserDao();
		
		CutOff cutoff = new CutOff();
		List<User> users = userdao.findAll();
		
		
		DateFormat format = new SimpleDateFormat("yyyy-dd-MM", Locale.ENGLISH);
		Date start_date = null,end_date=null;
		try {
			start_date = (Date) format.parse(request.getParameter("inputStartDate"));
			end_date = (Date) format.parse(request.getParameter("inputEndDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cutoff.setStart_date(start_date);
		cutoff.setEnd_date(end_date);
		cutoffdao.add(cutoff);
		
		for(User u: users){
			UserCutOff usercutoff = new UserCutOff();
			usercutoff.setCutOff(cutoff);
			usercutoff.setUser(u);
			usercutoff.setSss(SSSUtil.getSSSAmount(u.getBasicSalary()));
			usercutoff.setPhilhealth(PhilhealthUtil.getPhilhealthAmount(u.getBasicSalary()));
			usercutoff.setPagIbig(PagibigUtil.getPagibigAmount(u.getBasicSalary()));
			usercutoff.setAbsence(0);
			usercutoff.setTardiness(0);
			usercutoff.setOvertime(0);
			
			usercutoff.setNumberofdependents(u.getNumberOfDependents());
			usercutoff.setBasicsalary(u.getBasicSalary());
			usercutoff.setNontaxable(u.getNonTaxable());
			usercutoff.setOthertaxable(u.getOtherTaxable());
			usercutoff.setSickleave(0);
			usercutoff.setVacationleave(0);
			
			Double totalTaxable = usercutoff.getBasicsalary() + usercutoff.getOthertaxable() - usercutoff.getPagIbig() - usercutoff.getPhilhealth() - usercutoff.getSss();
			usercutoff.setTotalsalary((totalTaxable - (TaxUtil.getTaxAmount(totalTaxable, usercutoff.getNumberofdependents()))) + usercutoff.getNontaxable());
			usercutoffdao.add(usercutoff);
		}
		
		response.sendRedirect("/cutoff");
		
		return;
	}

}

