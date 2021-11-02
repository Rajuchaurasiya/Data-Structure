package ArrayQuestion;

import java.util.Scanner;


public class QuestionnoHakerrank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
       /* int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N; i++) {
        	arr[i]= sc.nextInt();
        	
        }
        for(int i = N-1; i >=0; i--) {
        	System.out.println(arr[i]);
        }*/
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			
		}
		for (int i=0; i<n; i++) {
			System.out.print(a[i]);
		}
	}

}
