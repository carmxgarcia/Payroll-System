package org.ideyatech.payroll.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ideyatech.payroll.dao.CutOffDao;
import org.ideyatech.payroll.dao.UserCutOffDao;
import org.ideyatech.payroll.entity.CutOff;
import org.ideyatech.payroll.entity.UserCutOff;
import org.ideyatech.payroll.util.AbsencesUtil;
import org.ideyatech.payroll.util.OvertimeUtil;
import org.ideyatech.payroll.util.TardinessUtil;
import org.ideyatech.payroll.util.TaxUtil;

@WebServlet("/updatecutoff")
public class UpdateCutOffController extends HttpServlet {
   
	private static final long serialVersionUID = 6940077307333555537L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCutOffController() {
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
		
		UserCutOffDao usercutoffdao = new UserCutOffDao();
		CutOffDao cutOffDao = new CutOffDao();
		CutOff cutOff = cutOffDao.findById(Integer.parseInt(request.getParameter("id")));
		List<UserCutOff> usercutoff = usercutoffdao.findAllUserCutOff(Integer.parseInt(request.getParameter("id")));
		
		
		for(UserCutOff uc: usercutoff){
			uc.setBasicsalary(Double.parseDouble(request.getParameter("inputBasicSalary"+String.valueOf(uc.getId())+"")));
			uc.setNontaxable(Double.parseDouble(request.getParameter("inputNonTaxable"+String.valueOf(uc.getId())+"")));
			uc.setOthertaxable(Double.parseDouble(request.getParameter("inputOtherTaxable"+String.valueOf(uc.getId())+"")));
			uc.setAbsence(Integer.parseInt(request.getParameter("inputAbsence"+String.valueOf(uc.getId())+"")));
			uc.setOvertime(Float.parseFloat(request.getParameter("inputOvertime"+String.valueOf(uc.getId())+"")));
			uc.setTardiness(Float.parseFloat(request.getParameter("inputTardiness"+String.valueOf(uc.getId())+"")));
			uc.setNumberofdependents(Integer.parseInt(request.getParameter("inputNumberOfDependents"+String.valueOf(uc.getId())+"")));
			uc.setSickleave(Integer.parseInt(request.getParameter("inputSickLeaves"+String.valueOf(uc.getId())+"")));
			uc.setVacationleave(Integer.parseInt(request.getParameter("inputVacationLeaves"+String.valueOf(uc.getId())+"")));
			
			Double totalTaxable = uc.getBasicsalary() + uc.getOthertaxable() + OvertimeUtil.getOvertimeAmount(uc.getOvertime(), uc.getBasicsalary(),cutOff.getWorkingdays()) - TardinessUtil.getTardinessAmount(uc.getTardiness(), uc.getBasicsalary(), cutOff.getWorkingdays()) - AbsencesUtil.getAbsencesAmount(uc.getAbsence(), uc.getBasicsalary(), cutOff.getWorkingdays()) - uc.getPagIbig() - uc.getPhilhealth() - uc.getSss();
			uc.setTotalsalary((totalTaxable - (TaxUtil.getTaxAmount(totalTaxable, (int)uc.getNumberofdependents()))) + uc.getNontaxable());
			
			usercutoffdao.update(uc);
		}
		
		response.sendRedirect("/usercutoff?id="+Integer.parseInt(request.getParameter("id")));
		
		return;
	}

}

