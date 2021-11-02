package ArrayQuestion;

import java .util.Scanner;

public class ReverseArry {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
      
       int n = 5;
       int a[]= new int [5];
       for(int i=0; i<5; i++) {
    	   a[i] = sc.nextInt();
    	  
       }
    	   for(int i=n-1; i>=0; i--) {
    	         System.out.print(a[i] + "  ");
       }
       
	}
}
