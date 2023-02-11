package funForCoding;

import java.util.Scanner;

public class Order_TotalMETHOD_SUMMINGwTAX {
//input three total amounts of grocies after add tax amount to last oder number..
	//public static void main(String[] args) {
		static double orderTotal(double product1, double product2, double product3, double taxRate) {
			// Write your code in here 
	double subTotal = product1 + product2 + product3;
	double taxAmount = subTotal * taxRate;
	return subTotal + taxAmount;
			
			
			
		}

	    // Do not change the code below this line19
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			double product1, product2, product3, taxRate;
			product1 = in.nextDouble();
			product2 = in.nextDouble();
			product3 = in.nextDouble();
			taxRate = in.nextDouble();
			System.out.println("Your order total is: $" + String.format("%,.2f", orderTotal(product1, product2, product3, taxRate)));
		}
	
	
}
