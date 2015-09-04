package org.ideyatech.payroll.util;

public class OvertimeUtil {
	public static double getOvertimeAmount(float overtime, double salary, int workingDays){
		return (((salary/2)/workingDays)/8)*overtime;
	}
}
