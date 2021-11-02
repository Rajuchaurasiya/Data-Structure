package Ifelse;

import java.util.Scanner;

public class QuestionlengthBreath {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your length");
		int L = sc.nextInt();
		System.out.println("enter your Breath");
		int B = sc.nextInt();
		if(L==B){
		
        	 System.out.println("Square");
         }
         else {
        	 System.out.println("Rectangle");
         }
         
	}

}
