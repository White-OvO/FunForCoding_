package funForCoding;

import java.util.Scanner;

public class Print_Last_Aarray {
	//static int[] createArray(int a,int b , int c, int d, int e) {   //aaray
	//static String repeatWord(String userWord, int nunTimes) { //A method with tan integer and a string attatched togther
		
	
	
	
	
	
	
	
	//prints last number in the array typed.
	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
		
		int[] arrayInt = {num1, num2, num3, num4, num5, num6};
		
		return arrayInt[arrayInt.length - 1];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6; 
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		num5 = in.nextInt();
		num6 = in.nextInt();
		
		int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
		System.out.println("The last number of the array is " + returnedInt + ".");
	}
}
		