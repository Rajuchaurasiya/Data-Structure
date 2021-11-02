package ArrayQuestion;

import java.util.Scanner;

public class midleTeram {

	public static void main(String[] args) {

//  Question =>1 Some no. of element print in Array?		

		/*
		 * int a[] = new int[5]; a[0] = 10; a[1] = 20; a[2] = 70; a[3] = 40; a[4] = 50;
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */

	/*	int a[] = { 33, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}*/

		

		/*
		 * int arr[][] = {{1,2,3,},{2,3,4,},{2,3,5}}; for(int i=0;i<3;i++) { for(int
		 * j=0; j<3; j++) { System.out.print(arr[i][j]+" "); } System.out.println(); }
		 */
	

//		 Question =>3 Some Question 2-D Array print the three by three matex?

		// Scanner r = new Scanner(System.in);
		/*
		 * int arr[] = new int[3]; for(int i=0; i<3; i--) { arr[i]=sc.nextInt(); }
		 * 
		 * for(int i=0; i<3; i--) { System.out.print(arr [i]); }
		 */
		/*
		 * int arr[]= new int [4]; for(int i=0; i<4; i++) { arr[i] = sc.nextInt(); }
		 * for(int i =0; i<4; i++) { System.out.println(arr[i]); }
		 */

		/*
		 * int arr[][] = new int[3][3]; for (int i = 0; i < 3; i++) { for (int j = 0; j
		 * < 3; j++) { arr[i][j] = sc.nextInt(); } } for (int i = 0; i < 3; i++) { for
		 * (int j = 0; j < 3; j++) {
		 * 
		 * System.out.print(arr[i][j]+ " "); } System.out.println(); }
		 */

		/*
		 * int a[][]= new int[3][3]; for(int i=0; i<3; i++) { //row
		 * 
		 * for(int j=0; j<3; j++) {//columns a [i][j]= r.nextInt();
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for(int i=0; i<3; i++) { //row
		 * 
		 * for(int j=0; j<3; j++) {//colu
		 * 
		 * System.out.print(a[j][i]+" "); } System.out.print("\n"); }
		 */

		// Question => 4*** Three by Three matex print row amd colnum?

		/*
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter hou many rows you want"); int r = sc.nextInt();
		 * System.out.println("Enter hou many cols you want"); int c = sc.nextInt(); int
		 * MatA[][] = new int[r][c]; System.out.println("Enter" + (r * c) + "values:");
		 * for (int i = 0; i < r; i++) {
		 * 
		 * for (int j = 0; j < c; j++) MatA[i][j] = sc.nextInt(); }
		 * System.out.println("Original Matrix is:"); for (int i = 0; i < r; i++) { for
		 * (int j = 0; j < c; j++) { System.out.print(MatA[i][j] + " "); }
		 * System.out.println(); } System.out.println("Transpose Matrix is:"); for (int
		 * i = 0; i < c; i++) { for (int j = 0; j < r; j++) {
		 * System.out.print(MatA[j][i] + " "); } System.out.println(); }
		 */
		// Question =>3 Reversed element print in Arrary? impportant Question

		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println("how many element you want"); int n = sc.nextInt(); int []
		 * x= new int[n]; for (int i = 0; i<n; i++) {
		 * 
		 * System.out.println("Enter array you want"+(i+1)); x[i]= sc.nextInt();
		 * System.out.println(); } System.out.println("Orignal element are"); for(int
		 * i=0; i<n; i++) { System.out.println(x[i]+" "); }
		 * System.out.println("Reversed element are"); for(int i=n-1; i>=0; i--) {
		 * System.out.println(x[i]+" "); }
		 */
		// Qestion =>4 Some no.print and addd?
		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println("Enter hou many element you want?"); int n =sc.nextInt();
		 * double[]arr = new double[n];
		 * System.out.println("Enter "+n+"elemant in array"); double sum = 0; for(int
		 * i=0; i<n; i++) { arr[i]= sc.nextDouble(); sum +=arr[i]; } //
		 * System.out.println("Avarage is "+sum/n);
		 * System.out.println("Avarage is "+sum);
		 */

		// Question => 5 Some no. print agian?

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int arr[] = new int[10]; for (int i = 0; i < 10; i++) { arr[i] =
		 * sc.nextInt(); } for (int i= 0; i < 10; i++) { System.out.print(arr[i] +
		 * " "); }
		 */
	/*	int arr[] = {10,20,30,40,50};
		System.out.println(arr[3]);*/
	/*	int size , i;
		Scanner r = new Scanner (System.in);
		System.out.print("Enter size of array");
		size = r.nextInt();
		int a[] = new int [size];
		for( i=0; i<size; i++) {
			a[i] = r.nextInt();
		}
		System.out.print("printed Array element");
		for( i=0; i<size; i++) {
			
		}
		System.out.print(a[i]+" ");*/
		  /*int arr[]= new int [3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int b:arr) {
			System.out.print(b+" ");
			
		}*/
		/*int a [] = new int [5];
		Scanner r = new Scanner (System.in);
		System.out.print("Enter your element");
         for (int i=0; i<5; i++)
         {
        	 a[i]=r.nextInt(); 
         }
         System.out.print("arr element");
         for (int i=0; i<5; i++) 
         {
        	 System.out.print(a[i]+" ");
         }
         System.out.println("Reslove arr element");
         for (int i=5-1; i>=0; i--)
         {
        	 System.out.print(a[i]+".");*/
	/*	int a[]= new int[3];
		Scanner r = new Scanner(System.in);
		System.out.print("Enter your Element");
		for(int i=0; i<3; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Enter your in arr");
		for(int i=0; i<3; i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println("Array length "+3 );
         */
		
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter value in firt element");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Frist array element");
		for(int i=0; i<5; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("second element array");
		for(int i=0; i<5; i++)
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		
	}

}
