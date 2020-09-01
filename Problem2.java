package lab1;

import java.util.Date;

public class Problem2 {

	public static void main(String[] args) {
		Date d1 = new Date(10, 9, 2000);
		Date d2 = new Date(3,17,2000);
		
		if(d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is the future");
		}else if(d1.compareTo(d2) == 1) {
			System.out.println(d2 + " is the future");
		}else {
			System.out.println("unknown");
		}
		

	}
}