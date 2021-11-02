package Sorting;

import java.util.Scanner;

public class{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5, 6, -2, 0, 29 };
		int n = arr.length;
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public static int partition(int a[], int beg, int end) {

		int left, right, temp, loc, flag;
		loc = left = beg;
		right = end;
		flag = 0;
		while (flag != 1) {
			while ((a[loc] <= a[right]) && (loc != right))
				right--;
			if (loc == right)
				flag = 1;
			else if (a[loc] > a[right]) {
				temp = a[loc];
				a[loc] = a[right];
				a[right] = temp;
				loc = right;
			}
			if (flag != 1) {
				while ((a[loc] >= a[left]) && (loc != left))
					left++;
				if (loc == left)
					flag = 1;
				else if (a[loc] < a[left]) {
					temp = a[loc];
					a[loc] = a[left];
					a[left] = temp;
					loc = left;
				}
			}
		}
		return loc;
	}

	static void quickSort(int a[], int beg, int end) {

		int loc;
		if (beg < end) {
			loc = partition(a, beg, end);
			quickSort(a, beg, loc - 1);
			quickSort(a, loc + 1, end);
		}
	}
}
