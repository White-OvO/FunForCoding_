package funForCoding;

import java.util.Scanner;

public class ModifyingElements_inAnArray {

	static void changeTwo(int a, int b, int[] arr) {
        // Add your code below this line 
        
		arr[0] = a;
        arr[arr.length - 1] = b;
        
        for ( int x : arr ) {
            System.out.println(x);}
        }
        
        
        
        
        //this code will get two variabels and replace the first and last one wih the given array input

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		b = in.nextInt();
		
		int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
		changeTwo(a, b, arr);
	}







	}
	
	

	
	
	