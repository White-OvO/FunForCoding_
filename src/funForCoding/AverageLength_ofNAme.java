package funForCoding;

import java.util.Scanner;

public class AverageLength_ofNAme {
// Input amount of names to find the average length of the names.
	//public static void main(String[] args) {
		static int avgNameLength(String[] names) {
			// Write your code below this line
			int sum = 0;
			for (String n : names ) {
			    sum += n.length();
			}
			return sum/ names.length;
			
			
			
			
		}
	    
	    
	    // Do not change the code below this line
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String[] names;
			names = new String[5];
			names[0] = in.nextLine();
			names[1] = in.nextLine();
			names[2] = in.nextLine();
			names[3] = in.nextLine();
			names[4] = in.nextLine();
			
			int avgLength = avgNameLength(names);
			System.out.println("The average name length is " + avgLength + ".");
		}
	
	

}
