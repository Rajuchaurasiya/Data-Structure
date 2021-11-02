package ArrayQuestion;

import java.util.Scanner;

public class MatriAddition {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner (System.in);
       
		System.out.println("Enter Dimesion");
		int rows = sc.nextInt();
		int colm = sc.nextInt();
		System.out.println("Enter arry a");
		int a [][] =new int[rows][colm];
		int b [][] =new int[rows][colm];
		for(int i =0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
		 
				a [i][j] = sc.nextInt();
			}
		}
		System.out.println("enter arry b");
		for(int i =0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
				b [i][j] = sc.nextInt();
			}
			}
		int c[][]= new int[rows][colm];
		for(int i =0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
				c[i][j] = a[i][j]+b[i][j];   // only change sin (+,-,*,/)working good
			}
		}
			System.out.println("result array is c");
			for(int i =0; i<rows; i++) {
				for(int j=0; j<colm; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
		}
	}

}
