package july5;

import java.util.Scanner;

public class maxAndMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =0;
		int a[] = new int[5];
		for(int i=0; i<5; i++) {
		a[i] = sc.nextInt();
		}
		x = a[0];
		for(int i=0; i<5; i++) {
			if(x>a[i]) {
				x = a[i];
			}
		}
		System.out.println(x);
	}

}
