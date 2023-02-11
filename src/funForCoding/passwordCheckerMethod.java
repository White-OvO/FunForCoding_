package funForCoding;

import java.util.Scanner;

public class passwordCheckerMethod {

	static boolean passwordChecker(String password) {
	//	System.out.println("Enter Password");	
		if (password.length() >= 8 && 
			    (password.contains("!") ||
			     password.contains("$") ||
			     password.contains("%") || 
			     password.contains("&"))) {
			         return true;
			     }
			return false;
		}
		
		// Do not change the code below this line
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String password =  ("ffs");         //NOtWorking  CHEKC WITH MENTOR in.nextLine();           //Type password here to see if it meets the requirments
	        boolean meetsRequirement = passwordChecker(password);
			if (meetsRequirement) {
			    System.out.println(password + " meets the requirements.");
			} else {
			    System.out.println(password + " does not meet the requirements.");
			}
	}

}
