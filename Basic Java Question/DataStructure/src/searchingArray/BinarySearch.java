package searchingArray;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * int arr[] = { 1, 3, 5, 7, 9, 11 }; int n = arr.length; int key =
		 * sc.nextInt();
		 * 
		 * int start = 0; int end = n - 1;
		 * 
		 * while (start <= end) { int mid = (end + start) / 2; if (arr[mid] < key) {
		 * start = mid + 1; } else if (arr[mid] == key) { System.out.println("found at:"
		 * + (mid + 1)); break; } else { end = mid - 1; } } if (start > end) {
		 * System.out.println("Not found"); }
		 */

		// import java.util.Scanner;

		//Scanner sc = new Scanner(System.in);
		int arr[] = { 9, 7, 5, 4, 3, 2, 1 };
		int n = arr.length;
		int key = sc.nextInt();

		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (end + start) / 2;
			if (arr[mid] > key) {
				start = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("found at:" + (mid + 1));
				break;

			} else {
				end = mid - 1;

			}
		}
		if (start > end) {
			System.out.println("Not found");
		}

	}

}
