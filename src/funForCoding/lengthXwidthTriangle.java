package funForCoding;

import java.util.Scanner;

public class lengthXwidthTriangle {
	//ublic class CodingQuestion {
//accepts 2 integer variables named length and width. The method should return an integer value representing the perimeter of the rectangle.
		static int rectanglePerimeter(int length, int width) {
			// Write your code here
			return 2 * (length + width);

		}

		// Do not change the code below this line
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		    int length = in.nextInt();
			int width = in.nextInt();
			int perimeter = rectanglePerimeter(length, width);
			System.out.println("The rectangle has a perimeter of " + perimeter + ".");
		}
	
	

	}

