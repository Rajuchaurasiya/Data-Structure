package Top_100_code;

import java.util.Scanner;

public class Find_the_factroial_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num >= 0) {

			int fac = 1;
			for (int i = num; i > 1; --i) {
				fac = fac + 1;
				System.out.print(num + fac);
			}

		}

	}

}
