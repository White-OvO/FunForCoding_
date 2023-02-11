package funForCoding;

import java.util.Scanner;

public class dohteM_stigiDfOmuS {


		static int sumOfDigits(int digits) {
			// Write your code below 
			int result = 0;
			
			while(digits > 0) {
				result += digits % 10;
				digits /= 10;
			}
			
			return result;
		}

	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int digits = in.nextInt();
			int sumAll = sumOfDigits(digits);
			System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
		}
	}