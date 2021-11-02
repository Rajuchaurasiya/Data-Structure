package allQustion;

import java.util.Scanner;

public class ClassAndObject {

	public static void main(String[] args) {
		
		//Question =>1 Find the table 2 to 20?
		
//		for (int i = 1; i<=20; i++) {
//			int number = i;
//			for(int j=1; j<=10; j++) {
//				System.out.print(number * j+" ");
//				
//			}
//		System.out.println();
	//	}

		//Question =>2 Find the largest no.
		/*Scanner sc = new Scanner(System.in);
		int arr[] = {2,5,3,56,3,6,8,};
		
		int max = 0;
		for(int num : arr) {
			if(num>max) 
				max = num;
		}
			System.out.println(max);
		
		//System.out.println(Math.min(34, 123));
		System.out.println(Math.max(34,56));*/
		
		/*Scanner sc = new Scanner (System.in);
		int a[] = new int[10];
		for (int i=0; i<10; i++) {
			a[i] = sc.nextInt();
			
		}
		for (int i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}*/
		
		Scanner sc = new Scanner (System.in);
		int a[][] = new int[2][2];
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				
			//System.out.print(a[i][j]+" " );
				System.out.print(a[j][i]+" ");
				}
			System.out.println();
			}
	}

}
