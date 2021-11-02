package ArrayQuestion;

import java.util.Scanner;

public class New_Question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  
		int sum =0;
		int arr[] = {23,43,12,36,73,90};
		for(int i=0; i<6; i++) {
			 sum =sum+arr[i];
		}
		
			System.out.print(sum);
		
	}

}
