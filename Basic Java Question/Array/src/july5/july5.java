package july5;

import java.util.Scanner;

public class july5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Question = 1 Revese array?
		 * 
		 * int x =5; int a [] = new int [6]; for (int i=0; i<6; i++) { a[i]=
		 * sc.nextInt(); } for (int i=x-1; i>=6; i--) { System.out.println(a[i]+" "); }
		 */

		// Question = 2 Print element array?

		/*
		 * int a[] = new int [6]; for(int i=0; i<6; i++) { a[i] = sc.nextInt(); }
		 * for(int i=0; i<6; i++) { System.out.print(a[i]); }
		 */

		int arr[] = { 23, 56, 34, 12, 13, 10, 67, 34, 98 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("shoted");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
