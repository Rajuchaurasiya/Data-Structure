package Top_100_code;

import java.util.Scanner;

public class Array_element_Max_Min {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max =0;
		int arr[] = new int[6];
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
			
		}
		max = arr[0];
     for(int i=0; i<6; i++) {
    	 
    //	 only change sing  max>arr[i]
    	 
    	 if(max<arr[i]) {
    		 max= arr[i];
    	 }
     }
     System.out.println(max);
	}

}
