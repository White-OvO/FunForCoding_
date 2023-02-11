package funForCoding;

import java.util.Scanner;

public class t_a_b_Words {
	//static int[] createArray(int a,int b , int c, int d, int e) {   //aaray
	//static String repeatWord(String userWord, int nunTimes) { //A method with tan integer and a string attatched togther
		//Writes a word  with a tab each lettter.

	static void charArray(String userWord) {
	    // Add your code below this line 
	    
		char[] arr = new char[userWord.length()];
		for ( int i = 0; i < userWord.length(); i++ ) {
		    arr[i] = userWord.charAt(i);
		}
		
		for ( int j = 0; j < arr.length; j++ ) {
		    System.out.println(arr[j]);
		}
		
		// Add your code above this line
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		word = in.nextLine();
		charArray(word);
	}
}
	