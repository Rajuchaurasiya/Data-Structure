package searchingArray;

import java .util.Scanner;

public class BinarySearching {
	
	public static void main(String[] args) {	
         Scanner sc = new Scanner (System.in);
		
         int arr[] = {2,3,4,5,6,7,8,9};
         int key = sc.nextInt();
         int n = arr.length;
         
         int start =0;
         int end = n-1;
         
         while(start<=end) {
        	 int mid = (end+start)/2;
        	 
        	 if(arr[mid] > key) {
        		 start = mid+1;
        		
        	 }else if (arr[mid]==key) {
        		 System.out.println("found ar "+ mid);
        		 break;
        	 }if(start>end) {
        		 System.out.println();
        	 }
         }
         if(start>end) {
    		 System.out.println("Not found");
         }
	}

}
