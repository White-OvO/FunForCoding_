package funForCoding;

import java.util.Scanner;

public class Pull_Third_Number_ofArray {

	//public static void main(String[] args) {
		//public class CodingQuestion {

	static int[] createArray(int a, int b, int c, int d, int e) {
				// Add your code here 
				int[] arr = {a, b, c, d, e};
				return arr;
			}

			// Do not change any of the code below this line //  This code will get 5 input array and pull out the third method.
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int a,b,c,d,e; {
				a = in.nextInt();
				b = in.nextInt();
				c = in.nextInt();
				d = in.nextInt();
				e = in.nextInt();
				int[] mainArray = createArray(a, b, c, d, e);
				System.out.println("The third number in your array is: " + mainArray[2]);
			}
		
	}

}