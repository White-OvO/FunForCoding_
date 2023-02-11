package funForCoding;



public class D2_ArraysInJava {
	private static final String Arrays = null;
	
	//static int[] createArray(int a,int b , int c, int d, int e) {   //aaray
	//static String repeatWord(String userWord, int nunTimes) { //A method with tan integer and a string attatched togther
	public static void main(String[] args) {
		int [][] lotteryCard = {{1, 3, 2},{4,5,6}, {12,54,65}
};  // 3 rows 3 colums so we declare the variable
	int [][] lotteryCard2 = new int [3][3];

	
	//tips
lotteryCard2[0][0] = 1;
lotteryCard2[0][1] = 3;
lotteryCard2[0][2] = 2;
lotteryCard2[1][1] = 4;
lotteryCard2[1][0] = 4;
lotteryCard2[1][1] = 5;
lotteryCard2[1][2] = 6;
lotteryCard2[2][0] = 12;
lotteryCard2[2][1] = 54;
lotteryCard2[2][2] = 65;


//changing the multidiminsional array order chnages the output
System.out.println(lotteryCard[0][2]);



 //For specific values horizontial
System.out.println("------------------");
for(int i = 0; i< 3; i++) {
	System.out.println(lotteryCard[i][i]);
}


// THis line will print all the variables
System.out.println("-------------");
for(int i= 0; i < 3; i++) {
	for(int j = 0; j < 3; j++) {
	System.out.println(lotteryCard[i][j]);
	
	}
}
}
}