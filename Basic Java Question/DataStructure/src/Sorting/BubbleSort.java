package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5, 6, -2, 0, 29 };
		int n = arr.length;
		// int key = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				 System.out.print("It ("+(i)+"."+(j)+"): ");
				 printArray(arr);
			}
		}
		
		
		}
	

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
