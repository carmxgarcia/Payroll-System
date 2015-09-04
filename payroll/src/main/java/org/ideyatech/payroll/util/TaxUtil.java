package org.ideyatech.payroll.util;

public class TaxUtil {
	
	public static double getTaxAmount(double taxableIncome, int dependencies){
		if(dependencies == 0){
			if(1 <= taxableIncome && 2082.99 >= taxableIncome){
				return 0.0;
			}else if(2083 <= taxableIncome && 2499.99 >= taxableIncome){
				if(taxableIncome > 2083){
					return ((taxableIncome - 2083)*0.05) + 0.0;
				}else{
					return 0.0;
				}
			}else if(2500 <= taxableIncome && 3332.99 >= taxableIncome){
				if(taxableIncome > 2500){
					return ((taxableIncome - 2500)*0.1) + 20.83;
				}else{
					return 20.83;
				}
			}else if(3333 <= taxableIncome && 4999.99 >= taxableIncome){
				if(taxableIncome > 3333){
					return ((taxableIncome - 3333)*0.15) + 104.17;
				}else{
					return 104.17;
				}
			}else if(5000 <= taxableIncome && 7916.99 >= taxableIncome){
				if(taxableIncome > 5000){
					return ((taxableIncome - 5000)*0.2) + 354.17;
				}else{
					return 354.17;
				}
			}else if(7917 <= taxableIncome && 12499.99 >= taxableIncome){
				if(taxableIncome > 7917){
					return ((taxableIncome - 7917)*0.25) + 937.50;
				}else{
					return 937.50;
				}
			}else if(12500 <= taxableIncome && 22916.99 >= taxableIncome){
				if(taxableIncome > 12500){
					return ((taxableIncome - 12500)*0.30) + 2083.33;
				}else{
					return 2083.33;
				}
			}else if(22917 <= taxableIncome){
				if(taxableIncome > 22917){
					return ((taxableIncome - 22917)*0.32) + 5208.33;
				}else{
					return 5208.33;
				}
			}
		}else if(dependencies == 1){
			if(1 <= taxableIncome && 3124.99 >= taxableIncome){
				return 0.0;
			}else if(3125 <= taxableIncome && 3541.99 >= taxableIncome){
				if(taxableIncome > 3125){
					return ((taxableIncome - 3125)*0.05) + 0.0;
				}else{
					return 0.0;
				}
			}else if(3542 <= taxableIncome && 4374.99 >= taxableIncome){
				if(taxableIncome > 3542){
					return ((taxableIncome - 3542)*0.1) + 20.83;
				}else{
					return 20.83;
				}
			}else if(4375 <= taxableIncome && 6041.99 >= taxableIncome){
				if(taxableIncome > 4375){
					return ((taxableIncome - 4375)*0.15) + 104.17;
				}else{
					return 104.17;
				}
			}else if(6042 <= taxableIncome && 8957.99 >= taxableIncome){
				if(taxableIncome > 6042){
					return ((taxableIncome - 6042)*0.2) + 354.17;
				}else{
					return 354.17;
				}
			}else if(8958 <= taxableIncome && 13541.99 >= taxableIncome){
				if(taxableIncome > 8958){
					return ((taxableIncome - 8958)*0.25) + 937.50;
				}else{
					return 937.50;
				}
			}else if(13542 <= taxableIncome && 23957.99 >= taxableIncome){
				if(taxableIncome > 13542){
					return ((taxableIncome - 13542)*0.30) + 2083.33;
				}else{
					return 2083.33;
				}
			}else if(23958 <= taxableIncome){
				if(taxableIncome > 23958){
					return ((taxableIncome - 23958)*0.32) + 5208.33;
				}else{
					return 5208.33;
				}
			}
		}else if(dependencies == 2){
			if(1 <= taxableIncome && 4166.99 >= taxableIncome){
				return 0.0;
			}else if(4167 <= taxableIncome && 4582.99 >= taxableIncome){
				if(taxableIncome > 4167){
					return ((taxableIncome - 4167)*0.05) + 0.0;
				}else{
					return 0.0;
				}
			}else if(4583 <= taxableIncome && 5416.99 >= taxableIncome){
				if(taxableIncome > 4583){
					return ((taxableIncome - 4583)*0.1) + 20.83;
				}else{
					return 20.83;
				}
			}else if(5417 <= taxableIncome && 7082.99 >= taxableIncome){
				if(taxableIncome > 5417){
					return ((taxableIncome - 5417)*0.15) + 104.17;
				}else{
					return 104.17;
				}
			}else if(7083 <= taxableIncome && 9999.99 >= taxableIncome){
				if(taxableIncome > 7083){
					return ((taxableIncome - 7083)*0.2) + 354.17;
				}else{
					return 354.17;
				}
			}else if(10000 <= taxableIncome && 14582.99 >= taxableIncome){
				if(taxableIncome > 10000){
					return ((taxableIncome - 10000)*0.25) + 937.50;
				}else{
					return 937.50;
				}
			}else if(14583 <= taxableIncome && 24999.99 >= taxableIncome){
				if(taxableIncome > 14583){
					return ((taxableIncome - 14583)*0.30) + 2083.33;
				}else{
					return 2083.33;
				}
			}else if(25000 <= taxableIncome){
				if(taxableIncome > 25000){
					return ((taxableIncome - 25000)*0.32) + 5208.33;
				}else{
					return 5208.33;
				}
			}
		}else if(dependencies == 3){
			if(1 <= taxableIncome && 5207.99 >= taxableIncome){
				return 0.0;
			}else if(5208 <= taxableIncome && 5624.99 >= taxableIncome){
				if(taxableIncome > 5208){
					return ((taxableIncome - 5208)*0.05) + 0.0;
				}else{
					return 0.0;
				}
			}else if(5625 <= taxableIncome && 6457.99 >= taxableIncome){
				if(taxableIncome > 5625){
					return ((taxableIncome - 5625)*0.1) + 20.83;
				}else{
					return 20.83;
				}
			}else if(6458 <= taxableIncome && 8124.99 >= taxableIncome){
				if(taxableIncome > 6458){
					return ((taxableIncome - 6458)*0.15) + 104.17;
				}else{
					return 104.17;
				}
			}else if(8124 <= taxableIncome && 11041.99 >= taxableIncome){
				if(taxableIncome > 8124){
					return ((taxableIncome - 8124)*0.2) + 354.17;
				}else{
					return 354.17;
				}
			}else if(11042 <= taxableIncome && 15624.99 >= taxableIncome){
				if(taxableIncome > 11042){
					return ((taxableIncome - 11042)*0.25) + 937.50;
				}else{
					return 937.50;
				}
			}else if(15625 <= taxableIncome && 26041.99 >= taxableIncome){
				if(taxableIncome > 15625){
					return ((taxableIncome - 15625)*0.30) + 2083.33;
				}else{
					return 2083.33;
				}
			}else if(26042 <= taxableIncome){
				if(taxableIncome > 26042){
					return ((taxableIncome - 26042)*0.32) + 5208.33;
				}else{
					return 5208.33;
				}
			}
		}else if(dependencies <= 4){
			if(1 <= taxableIncome && 6249.99 >= taxableIncome){
				return 0.0;
			}else if(6250 <= taxableIncome && 6666.99 >= taxableIncome){
				if(taxableIncome > 6250){
					return ((taxableIncome - 6250)*0.05) + 0.0;
				}else{
					return 0.0;
				}
			}else if(6667 <= taxableIncome && 7499.99 >= taxableIncome){
				if(taxableIncome > 6667){
					return ((taxableIncome - 6667)*0.1) + 20.83;
				}else{
					return 20.83;
				}
			}else if(7500 <= taxableIncome && 9166.99 >= taxableIncome){
				if(taxableIncome > 7500){
					return ((taxableIncome - 7500)*0.15) + 104.17;
				}else{
					return 104.17;
				}
			}else if(9167 <= taxableIncome && 12082.99 >= taxableIncome){
				if(taxableIncome > 9167){
					return ((taxableIncome - 9167)*0.2) + 354.17;
				}else{
					return 354.17;
				}
			}else if(12083 <= taxableIncome && 16666.99 >= taxableIncome){
				if(taxableIncome > 12083){
					return ((taxableIncome - 12083)*0.25) + 937.50;
				}else{
					return 937.50;
				}
			}else if(16667 <= taxableIncome && 27082.99 >= taxableIncome){
				if(taxableIncome > 16667){
					return ((taxableIncome - 16667)*0.30) + 2083.33;
				}else{
					return 2083.33;
				}
			}else if(27083 <= taxableIncome){
				if(taxableIncome > 27083){
					return ((taxableIncome - 27083)*0.32) + 5208.33;
				}else{
					return 5208.33;
				}
			}
		}
		return 0.0;
	}
	
}
