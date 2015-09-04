package org.ideyatech.payroll.util;

public class AbsencesUtil {
	public static double getAbsencesAmount(int absences, double salary, int workingDays){
		return round(((salary/2)/workingDays)*absences,2);
	}

	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	
	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}