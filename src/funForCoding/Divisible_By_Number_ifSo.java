package funForCoding;

import java.util.Scanner;

public class Divisible_By_Number_ifSo {
// input number to find our FIXED results
	
	
	
	//If the value is divisible by 3, print "Fizz"
	// the value is divisible by 5 print "Buzz"
	//f the value is divisible by both 3 and 5 print "FizzBuzz" 
	
	static void fizzBuzz(int num1) {
		// Write your code here
		if (num1 % 3 == 0 && num1 % 5 == 0) {
		    System.out.println("FizzBuzz");
		} else if (num1 % 3 == 0) {
		    System.out.println("Fizz");
		} else if (num1 % 5 == 0) {
		    System.out.println("Buzz");
		} else {
		    System.out.println("Hello world!");
		}
	}
    
    //Do not change any thing below this line
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1;
		num1 = in.nextInt();
		fizzBuzz(num1);
	}

	}

