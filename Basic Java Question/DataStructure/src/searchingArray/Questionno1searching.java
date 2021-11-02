package searchingArray;

import java.util.Scanner;

public class Questionno1searching {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int arr[] = { 5, 8, 7, 3, 5, 8, 9, 10 };

		int key = n.nextInt();
		int i = 0;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				System.out.print("found");
				break;
			}

		}

		if (i == arr.length) {
			System.out.println("Not found");
		}

	}
}
