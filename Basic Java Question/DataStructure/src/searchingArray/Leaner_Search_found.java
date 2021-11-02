package searchingArray;

import java.util.*;

class Leaner_Search_found {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i =0;
		int arr[] = {23,56,43,32,65 };
		int key = sc.nextInt();
		for(i=0; i<5; i++) {
			if(arr[i]==key) {
				System.out.println("Found");
				break;
			}
		}
		if(i==5)
		System.out.println("not found");
	}
}
