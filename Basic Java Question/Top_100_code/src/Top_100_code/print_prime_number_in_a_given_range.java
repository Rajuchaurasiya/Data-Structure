package Top_100_code;

import java.util.Scanner;

public class print_prime_number_in_a_given_range {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your start no.");
        int start = sc.nextInt();
        System.out.println("Enter your end no.");
        int end = sc.nextInt();
         
        int raju;
        for(int i= start; i<=end; i++) {
        	raju =0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) {
        			raju = raju + 1;
        			
        		}
        		if(raju == 2) {
        			System.out.print(i);
        		}
        	}
        }
	}

}
