package Rajuifelse4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salry = sc. nextInt();
		int yos =  sc. nextInt();
		if(yos>5) {
			System.out.println("Bonus Salary:"+(salry+(0.05*salry)));
		}
		else {
			System.out.println(salry);
		}		
		

	}

}
