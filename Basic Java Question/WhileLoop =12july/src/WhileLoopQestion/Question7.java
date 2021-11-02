package WhileLoopQestion;

import java .util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ram;
		do {
			System.out.println("language menu");
			System.out.println(" 1 . java ");
			System.out.println(" 2 . python ");
			System.out.println(" 3 . c# ");
			System.out.println("Enter your perferred language (1-3);");
			ram = sc.nextInt();
		}while(ram  < 1 || ram > 3);
		sc.close();
		switch(ram) {
		case 1 :
		System.out.println("perferred language - java");
		break;
		case 2 :
		System.out.println("preferred language - python");
		break;
		case 3 :
		System.out.println("preferred language - c#");
		break;
		}
		

	}

}
