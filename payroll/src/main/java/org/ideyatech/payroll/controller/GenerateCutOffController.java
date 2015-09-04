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
		
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		Date start_date = null,end_date=null;
		try {
			start_date = format.parse(request.getParameter("inputStartDate"));
			end_date = format2.parse(request.getParameter("inputEndDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(request.getParameter("inputEndDate"));
		System.out.println(end_date);
		
		cutoff.setStart_date(start_date);
		cutoff.setEnd_date(end_date);
		cutoff.setWorkingdays(Integer.parseInt(request.getParameter("inputWorkingDays")));
		cutoffdao.add(cutoff);
		
		for(User u: users){
			UserCutOff usercutoff = new UserCutOff();
			usercutoff.setCutOff(cutoff);
			usercutoff.setUser(u);
			usercutoff.setSss(SSSUtil.getSSSAmount(u.getBasicSalary())/2);
			usercutoff.setPhilhealth(PhilhealthUtil.getPhilhealthAmount(u.getBasicSalary())/2);
			usercutoff.setPagIbig(PagibigUtil.getPagibigAmount(u.getBasicSalary())/2);
			usercutoff.setAbsence(0);
			usercutoff.setTardiness(0);
			usercutoff.setOvertime(0);
			
			usercutoff.setNumberofdependents(u.getNumberOfDependents());
			usercutoff.setBasicsalary(u.getBasicSalary()/2);
			usercutoff.setNontaxable(u.getNonTaxable()/2);
			usercutoff.setOthertaxable(u.getOtherTaxable()/2);
			usercutoff.setSickleave(0);
			usercutoff.setVacationleave(0);
			
			Double totalTaxable = usercutoff.getBasicsalary() + usercutoff.getOthertaxable() - usercutoff.getPagIbig() - usercutoff.getPhilhealth() - usercutoff.getSss();
			usercutoff.setTotalsalary((totalTaxable - (TaxUtil.getTaxAmount(totalTaxable, (int)usercutoff.getNumberofdependents()))) + usercutoff.getNontaxable());
			usercutoffdao.add(usercutoff);
		}
		
		response.sendRedirect("/cutoff");
		
		return;
	}

}

