package funForCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Word_2_Array {

//Write a letter, console will put them in a array

			static char[] wordToArray(String userWord) {
			    			    char[] charArray = new char[userWord.length()];
				for (int i = 0; i < userWord.length(); i++) {
				    charArray[i] = userWord.charAt(i);
				}
				
				return charArray;
			}


			 //Do not change the code below this line
			 public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				String userWord;;
				userWord = in.nextLine();
				
				System.out.println("Your array is: ");
				System.out.println(Arrays.toString(wordToArray(userWord)));
}
}