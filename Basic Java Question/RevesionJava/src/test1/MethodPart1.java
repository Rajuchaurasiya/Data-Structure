package test1;

import java.util.Scanner;

public class MethodPart1 {
  // static void myMethod(String fname, int age) {
	   //System.out.println(fname+ "  is  " + age);
   //}
	public static void main(String[] args) {
		//myMethod("Raju", 23);
	//	myMethod("Rajesh",21);
		//myMethod("Akash",15);
		Scanner sc = new Scanner (System.in);
		/*System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Positive");
			
			
		}else if(num < 0) {
		System.out.println("Neagetive");
			
		}else {
			//System.out.println("Zero");
			}*/
		
		int num  = sc.nextInt();
		
		if(num % 2==0) {
			System.out.println("Even numer");
		}else {
			
			System.out.println("odd number");
		}
		
		
		
		
		
		
	}
	

}
