package ArrayQuestion;

import java.util.*;

public class SecondLastnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * int arr[] = new int[10]; for (int i = 0; i < arr.length; i++) { arr[i] =
		 * sc.nextInt(); } for (int i = 0; i < arr.length; i++) {
		 * System.out.print(arr[i]+" "); }
		 */

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//int d = sc.nextInt();

		if (a > b) {
			if(a>c) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}else {
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
		
	}
}
