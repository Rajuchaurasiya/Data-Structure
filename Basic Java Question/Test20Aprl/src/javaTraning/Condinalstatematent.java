package javaTraning;

import java.util.Scanner;

public class Condinalstatematent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		if (input<100) {
			input=input * 50;
	
			}
		else {
			input=input / 10;
		}
		
		System.out.println(input);
		
		
	}

}

