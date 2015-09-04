package org.ideyatech.payroll.util;

public class TaxUtil {
	
	public static double getTaxAmount(double taxableIncome, int dependencies){
		if(dependencies == 0){
			if(1 <= taxableIncome && 961.99 >= taxableIncome){
				return 0.0;
			}else if(962 <= taxableIncome && 1153.99 >= taxableIncome){
				if((taxableIncome - 962) > 0){
					return ((taxableIncome - 962.00)*0.05) + 0.0;
				}else{
					return 0.0;
				}
			}else if(1154 <= taxableIncome && )
		}
		return 0.0;
	}
	
}
