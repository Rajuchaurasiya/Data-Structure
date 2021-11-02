package ifelse;

import java .util.Scanner;

public class TernaryOPerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	/*	 int num  = sc.nextInt();
		
		 
		String msg = (num%2==0)?"evan" :"odd";
      System.out.println(msg);*/
		
		//Question =>2 two number largest in teranery operter
				
		/*int x = sc.nextInt();
		int y = sc.nextInt();
		int raju=0;
		
		raju = (x>y)? x : y;
		System.out.println(raju);*/
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int raju = 0;
		
		//raju = (x>y)?(x>z? x:z):(y>z? y:z);
		raju = (x>y?(x>z? (y>z? y:z):x) 
				:(y>z?(x>z? x:z):y));
		System.out.println(raju);
		
	/*	int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int raju = 0;
		raju = (a>b && a>c && a>d)?
				a: ((b>c && b>d)?
				b: (c>d? c:d));	
		
		System.out.println(raju); */
	}

}
