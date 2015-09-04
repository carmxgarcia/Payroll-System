package org.ideyatech.payroll.util;

public class SSSUtil {
	
	public static double getSSSAmount(double salary){
		if(1000 <= salary && 1249.99 >= salary){
			return 36.30;
		}else if(1250 <= salary && 1749.99 >= salary){
			return 54.50;
		}else if(1750 <= salary && 2249.99 >= salary){
			return 72.70;
		}else if(2250 <= salary && 2749.99 >= salary){
			return 90.80;
		}else if(2750 <= salary && 3249.99 >= salary){
			return 109.00;
		}else if(3250 <= salary && 3749.99 >= salary){
			return 127.20;
		}else if(3750 <= salary && 4249.99 >= salary){
			return 145.30;
		}else if(4250 <= salary && 4749.99 >= salary){
			return 163.50;
		}else if(4750 <= salary && 5249.99 >= salary){
			return 181.70;
		}else if(5250 <= salary && 5749.99 >= salary){
			return 199.80;
		}else if(5750 <= salary && 6249.99 >= salary){
			return 218.00;
		}else if(6250 <= salary && 6749.99 >= salary){
			return 236.20;
		}else if(6750 <= salary && 7249.99 >= salary){
			return 254.30;
		}else if(7250 <= salary && 7749.99 >= salary){
			return 272.50;
		}else if(7750 <= salary && 8249.99 >= salary){
			return 290.70;
		}else if(8250 <= salary && 8749.99 >= salary){
			return 308.80;
		}else if(8750 <= salary && 9249.99 >= salary){
			return 327.00;
		}else if(9250 <= salary && 9749.99 >= salary){
			return 345.20;
		}else if(9750 <= salary && 10249.99 >= salary){
			return 363.30;
		}else if(10250 <= salary && 10749.99 >= salary){
			return 381.50;
		}else if(10750 <= salary && 11249.99 >= salary){
			return 399.70;
		}else if(11250 <= salary && 11749.99 >= salary){
			return 417.80;
		}else if(11750 <= salary && 12249.99 >= salary){
			return 436.00;
		}else if(12250 <= salary && 12749.99 >= salary){
			return 454.20;
		}else if(12750 <= salary && 13249.99 >= salary){
			return 472.30;
		}else if(13250 <= salary && 13749.99 >= salary){
			return 490.50;
		}else if(13750 <= salary && 14249.99 >= salary){
			return 508.70;
		}else if(14250 <= salary && 14749.99 >= salary){
			return 526.80;
		}else if(14750 <= salary && 15249.99 >= salary){
			return 545.00;
		}else if(15250 <= salary && 15749.99 >= salary){
			return 563.20;
		}else if(15750 <= salary){
			return 581.30;
		}
		return 0.0;
	}

}
