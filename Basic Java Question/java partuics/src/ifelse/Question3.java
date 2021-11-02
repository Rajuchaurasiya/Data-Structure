package ifelse;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your quantity");
		int x = sc. nextInt();
		int y = x*100;
		if(y>1000) {
			System.out.println(y*0.9);
		}
		else {
			System.out.println("No discount");
		}
	}

}
