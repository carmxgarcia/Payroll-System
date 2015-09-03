package org.ideyatech.payroll.util;

public class PhilhealthUtil {
	
	public static double getPhilhealthAmount(double salary){
		if(8999.99 >= salary){
			return 100.00;
		}else if(9000.00 <= salary && 9999.99 >= salary){
			return 112.50;
		}else if(10000.00 <= salary && 10999.99 >= salary){
			return 125.00;
		}else if(11000.00 <= salary && 10999.99 >= salary){
			return 137.50;
		}else if(12000.00 <= salary && 10999.99 >= salary){
			return 150.00;
		}else if(13000.00 <= salary && 10999.99 >= salary){
			return 162.50;
		}else if(14000.00 <= salary && 10999.99 >= salary){
			return 175.00;
		}else if(15000.00 <= salary && 10999.99 >= salary){
			return 187.50;
		}else if(16000.00 <= salary && 10999.99 >= salary){
			return 200.00;
		}else if(17000.00 <= salary && 10999.99 >= salary){
			return 212.50;
		}else if(18000.00 <= salary && 10999.99 >= salary){
			return 225.00;
		}else if(19000.00 <= salary && 10999.99 >= salary){
			return 237.50;
		}else if(20000.00 <= salary && 10999.99 >= salary){
			return 250.00;
		}else if(21000.00 <= salary && 10999.99 >= salary){
			return 262.50;
		}else if(22000.00 <= salary && 10999.99 >= salary){
			return 275.00;
		}else if(23000.00 <= salary && 10999.99 >= salary){
			return 287.50;
		}else if(24000.00 <= salary && 10999.99 >= salary){
			return 300.00;
		}else if(25000.00 <= salary && 10999.99 >= salary){
			return 312.50;
		}else if(26000.00 <= salary && 10999.99 >= salary){
			return 325.00;
		}else if(27000.00 <= salary && 10999.99 >= salary){
			return 337.50;
		}else if(28000.00 <= salary && 10999.99 >= salary){
			return 350.00;
		}else if(29000.00 <= salary && 10999.99 >= salary){
			return 362.50;
		}else if(30000.00 <= salary && 10999.99 >= salary){
			return 375.00;
		}else if(31000.00 <= salary && 10999.99 >= salary){
			return 387.50;
		}else if(32000.00 <= salary && 10999.99 >= salary){
			return 400.00;
		}else if(33000.00 <= salary && 10999.99 >= salary){
			return 412.50;
		}else if(34000.00 <= salary && 10999.99 >= salary){
			return 425.00;
		}else if(35000.00 >= salary){
			return 437.50;
		}
		
		return 0.0;
	}
}
