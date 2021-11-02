package Top_100_code;

import java .util.Scanner; 

public class Even_or_Odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even num");
		}
		else {
			System.out.println("odd num");
		}
	}

}
