package funForCoding;

import java.util.Random;
import java.util.Scanner;

public class rebmuN_ehT_sseuG {

	public static void main(String[] args) {
		 //Guessing game random number is eleceted so there can be a win or lose screen.
		 Scanner keyboard = new Scanner (System.in);

		 System.out.print("Enter an int from 1 to 10: ");
		

		 int inputNumber = keyboard.nextInt();

		 int randomNumber = new Random().nextInt(10) + 1;

		 if (inputNumber == randomNumber) {
		 		System.out.println("********");
		 		System.out.println("*You win.*");
		 		System.out.println("*******");
		 }else {
		 		System.out.println("You lose.");
		 		System.out.print("The random number was ");
		 		System.out.println(randomNumber + ".");
		 System.out.println("Thank you for playing");
		 	
		 }
		 	}
}
