package fast_calss_java;
import java . util.Scanner;

public class One_Vedio_in_Java {

	public static void main(String[] args) {
		// System.out.println("Hello world");

//		int $age = 321;
//		int age2 = 543;
//		float averageMark = 19.34f;
//		String name = "Raju";
//		boolean isValied = true;
//		long bigMumber= 23456787654321l;
//		
//		System.out.println(bigMumber);		

		// operater 4 type ky verable con do work in java;

		// ++,--,&,/,-,+

		/*
		 * int x = 99; int r = 8;
		 * 
		 * // double c = (double)x/ (double)r; type costing int c = x%r;
		 * //System.out.println(c);
		 * 
		 * System.out.println(c);
		 */

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter your name");

		// int age = sc.nextInt();
		// System.out.println(age);

		// float ag = sc.nextFloat();
		// System.out.println(2*ag);

		// String name = sc.nextLine();
		// System.out.println(name);

		// < > <= >= == !=

//		char grad = 'B';
//		
//		if(grad == 'A') {
//			System.out.println("your grdae is very good");
//		}else if (grad == 'B') {
//			System.out.println("keep improving");
//		}else if (grad == 'c') {
//		System.out.println("very good keep learing");
//			
//		}else {
//			System.out.println("good");
//		}
//	{	int age =13;
//		
//		if(!(age>18)) {
//			System.out.println("you can vote");
//		}els	}
		Scanner sc  = new Scanner (System.in);
		int x = sc.nextInt();
		int raju = 0;
	
		while(x !=0) {
			int pick_last =  x%10;
			raju =raju + pick_last;
			raju = raju%10;
			
		}
			
		System.out.println(raju);
		
	
	}
}
