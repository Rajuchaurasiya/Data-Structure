package Top_100_code;

import java.util.Scanner;

public class Find_the_Prime_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int Raju = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				Raju = Raju + 1;

		}
		if (Raju == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime");
		}

	}

}
