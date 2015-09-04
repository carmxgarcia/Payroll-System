package org.ideyatech.payroll.util;

public class AbsencesUtil {
	public static double getAbsencesAmount(int absences, double salary, int workingDays){
		return ((salary/2)/workingDays)*absences;
	}
}
