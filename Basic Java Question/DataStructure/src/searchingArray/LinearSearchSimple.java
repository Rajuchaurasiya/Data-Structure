package searchingArray;

import java.util.Scanner;

public class LinearSearchSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int arr[]= {4,5,6,2,7,8,9,};
		
		int key = sc.nextInt();
		
		for(int i=0; i<arr.length; i++){
				
			if(arr[i] >= key) {
				System.out.println("Found");
				break;
			}
			
		}

	}

}
