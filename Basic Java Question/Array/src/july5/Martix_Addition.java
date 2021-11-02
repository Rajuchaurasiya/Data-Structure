package july5;

import java.util.*;

public class Martix_Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x[][] = new int[3][3];
		int y[][] = new int[3][3];
		int z[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				y[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				z[i][j] = x[i][j] + y[i][j]; // ( + ,-,/,*)
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
	}

}
