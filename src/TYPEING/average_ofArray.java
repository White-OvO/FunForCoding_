package TYPEING;

import java.util.Scanner;

public class average_ofArray {

	public static void main(String args[]) {
		
	int a[]=new int[5]; int sum = 0; double avg;
	//Scanner r=new Scanner(System.in);
	int [] a1 = new int [5];
	a1[0] = 31;
	a1[1] = 29;
	a1[2] = 53;
	a1[3] = 54;
	a1[4] = 60;

	
	//System.out.println("Enter array Elemets");	
	for(int i =0;i<5;i++)
	{
	//	a1[i]=r.nextInt();
	
		//System.out.println(a[i]+" ");
	}
	for(int i = 0;i<5;i++)
	{
System.out.println(a1[i] + " ");
}
for(int i=0;i<5;i++)
{
sum=a1[i]+sum;
}
 avg= sum/5;
 System.out.println(sum + " " +avg);
	}
}