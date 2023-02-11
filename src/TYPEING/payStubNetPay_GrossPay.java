package TYPEING;

import java.util.Scanner;

public class payStubNetPay_GrossPay {

	public static void main(String[] args) {
	
double hourlyRate, hoursWorked;
double taxRate = .8;
hoursWorked = 40;
hourlyRate =   17;

double grossPay = hoursWorked * hourlyRate;
double netPay = grossPay - (grossPay * taxRate );


// add your code above this line 

System.out.println("Gross Pay: " + grossPay); //DO NOT CHANGE THIS CODE
System.out.println("Net Pay: " + netPay); //DO NOT CHANGE THIS CODE
Double answer = (double) ((15/7) * 2);
System.out.println(answer);
int answer2 = ((10 * 3) / 5) % 6;
System.out.println(answer2);
	}
	}


