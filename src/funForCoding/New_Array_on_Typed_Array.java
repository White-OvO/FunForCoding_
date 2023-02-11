package funForCoding;

import java.util.Scanner;

public class New_Array_on_Typed_Array {
	
		
		static void newArray(String word1, String word2, String word3, String[] arr) {
			// Add your code below this line 
			
			
			String[] newArr = { word1, word2, word3 };
			String[] combinedArr = new String[arr.length + newArr.length];
			int counter = 0;
			
			for ( String str : arr ) {
			    combinedArr[counter] = str;
			    counter++;
			}
			
			for ( String str2 : newArr ) {
			    combinedArr[counter] = str2;
			    counter++;
			}
			
			for ( int i = 0; i < combinedArr.length; i++ ) {
			    System.out.println(combinedArr[i]);
			}
			// Add your code above this line
		}

			
			
			
		
		
		
		
		
		
		
		
		
		
		
			// This code added more aarays to the arrays typed. addes three new variables at the end 
		
//THIS code allows you to type
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
			String word1, word2, word3;
			word1 = in.nextLine();
			word2 = in.nextLine();
			word3 = in.nextLine();
			newArray(word1, word2, word3, arr);
			
		}
	
 		

}
	