package ArrayQuestion;

import java.util.Scanner;

public class Rotation_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	int sum =0;
	int arr[] = {2 , 34, 55, 76, 5};
	for(int i=0; i<5; i++) {
		sum = sum + arr[i];
	}
	System.out.println(sum);
	}
}
