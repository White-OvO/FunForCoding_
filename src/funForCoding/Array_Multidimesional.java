package funForCoding;

import java.util.Scanner;

public class Array_Multidimesional {
	private static final String Arrays = null;
	
	//static int[] createArray(int a,int b , int c, int d, int e) {   //aaray
	//static String repeatWord(String userWord, int nunTimes) { //A method with tan integer and a string attatched togther
	//public class CodingQuestion {
//public static void main (String[] args) {
		static void multidimensional(int a, int b) {
		    // Check for error -- invalid parameters
			if (a <= 2 || b <= 2) {
			    System.out.println("Both numbers need to be greater than 2.");
			} else {
			    // If both parameters are > 2
			    // Declare a multidimensional array something like this:
			    //          int[][] arr = new int[param1][param2];
			    
			    int[][] arr = new int[a][b];
			
			    // Create two loops to populate your new multidimensional array
			    // Note:  you will need a new index in each for-loop. 
			    //          one index will be used for the first for-loop's index (0 to param1 - 1)
			    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
			    for ( int i = 0; i < a; i++ ) {
			        for ( int j = 0; j < b; j++ ) {
			            arr[i][j] = j;
			        }
			    }
			
			    // After you have populated your multidimensional array, 
			    //      Print out the value of arr[firstPosition][lastPosition]
			    
			    System.out.println(arr[0][arr[0].length - 1]);
			}
		}
		
	    // Do not change the code below this line
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int input1, input2;
			input1 = in.nextInt();
			input2 = in.nextInt();
			multidimensional(input1, input2);
		}
	
}
	
	
	
	

		
		

	

