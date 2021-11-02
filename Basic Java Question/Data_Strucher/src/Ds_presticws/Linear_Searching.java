package Ds_presticws;

import java.util.Scanner;

public class Linear_Searching {

	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

		int arr[] = { 21, 45, 23, 23, 43, 234, 53 };
		int key = sc.nextInt();
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("found");
				break;

			}
		}
		if (i == arr.length) {
			System.out.println("Not found");
		}
	}

}
