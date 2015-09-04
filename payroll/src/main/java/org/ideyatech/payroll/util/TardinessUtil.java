package org.ideyatech.payroll.util;

public class TardinessUtil {
	public static double getTardinessAmount(float tardiness, double salary, int workingDays){
		return (((salary/2)/workingDays)/8)*tardiness;
	}
}
