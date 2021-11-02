package Rajuifelse;
import java.util.Scanner;
public class LargestthenSmalest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();
		//int y = sc.nextInt();
	/*	if(x>y) {
		
			System.out.println(x);
			System.out.println(y);
		}
		else {
			System.out.println(y);
			System.out.println(x);
		}*/
		
		
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
			
			
		}
		for(int i=0; i<N; i++) {
			System.out.print(arr[N]);
		}
	}

}
