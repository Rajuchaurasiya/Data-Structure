package Ifelse;

import java.util.Scanner;

public class asdw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y) {
			if(x>z) {
				System.out.println(x);
			}
			else {
				System.out.println(z);
			}
		}  else {
			if(y>z) {
			System.out.println(y);
			}
	     else {
			System.out.println(z);
	     }
		}
	}

}
