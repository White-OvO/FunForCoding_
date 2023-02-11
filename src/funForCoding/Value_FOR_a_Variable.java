package funForCoding;

public class Value_FOR_a_Variable {
public static void main(String [] args) {
		String ne = MenuExtension(21);
		System.out.println(ne) ;
}// chagne the age will make the output change the solution.
 static String MenuExtension(int age) {
	 if (age < 21) {
		 return "under age";
		 }
	 if (age >= 21) {
		 return "will you add a alcholic drink to your order?" ;
		 }else {
		 return" Invalid ";
		 
	 }
	 }
 }