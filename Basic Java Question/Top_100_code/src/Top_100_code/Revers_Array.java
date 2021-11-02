package Top_100_code;

import java.util.Scanner;

public class Revers_Array {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
      int n = 5;
      int arr[] = new int[5];
      for(int i=0; i<5; i++) {
    	  arr[i] = sc.nextInt();
      }
      for(int i=n-1; i>=0; --i) {
    	  System.out.print(arr[i]);
      }
     
	}

}
