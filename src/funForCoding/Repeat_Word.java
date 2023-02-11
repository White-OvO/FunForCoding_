package funForCoding;

import java.util.Scanner;


public class Repeat_Word {


static String repeatWord(String userWord, int numTimes) {  //This code will print your text as many times in the numtimes.
	// Write your code in here 
	String newString = "";
	for (int i = 0; i < numTimes; i++) {
	    newString += userWord;
	}
	
	return newString;
}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int numTimes;
	String userWord;
	userWord = in.nextLine();
	numTimes = 5;							// changes how many times you demand it to run
	System.out.println(repeatWord(userWord,numTimes));
	
	System.out.println("HelloWorld");
	}
	
}
