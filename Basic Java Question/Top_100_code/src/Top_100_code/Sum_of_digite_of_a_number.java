package Top_100_code;

import java.util.Scanner;

public class Sum_of_digite_of_a_number {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum =0;
		for(int i=0; i<=n; i++) {
			sum = sum + i;
		//System.out.print(sum);	
		}
		
System.out.println(sum);
	}

}
