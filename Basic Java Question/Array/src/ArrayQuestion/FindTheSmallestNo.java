package ArrayQuestion;

import java.util.Scanner;

public class FindTheSmallestNo {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in); 
       int min = 0   ;
        
        int arr [] = new int[5];
        for(int i=0; i<5; i++) {
        	
         arr[i] = sc.nextInt();	
        }
        min = arr[0];
        for(int i=0; i<5; i++) {
        	//if(min>arr[i]) {find the min number;	
        	 if(min>arr[i]){  //find the max number;	
        		min = arr[i];
        	}
        }
        System.out.println(min);
        
       // Both Question Small and Largest Number; Only change singh Greater or Less?
	}

}
