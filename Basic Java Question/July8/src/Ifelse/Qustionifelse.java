package Ifelse;

import java.util.Scanner;

public class Qustionifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		if(score>=30) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fall");
		}	
	}

}
