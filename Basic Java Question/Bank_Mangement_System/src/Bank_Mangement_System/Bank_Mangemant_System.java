package Bank_Mangement_System;

import java.util.Scanner;

public class Bank_Mangemant_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Create a new Account");
		System.out.println("Please Enter 1 for create account");
		int t = sc.nextInt();
		switch(t) {
		case 1:
			Create_New_Account c = new Create_New_Account();
			
			
			break;
			
		default:
			System.out.println("Thank for your interest");
		}

	}

}
