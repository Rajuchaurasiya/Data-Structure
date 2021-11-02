package Ds_presticws;
 
import java .util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
    
    int arr[] = {3,4,5,6,7,8,9};
    int key = sc.nextInt();
    int n = arr.length;
  
    
     int start =0;
     int end  = n-1;
     
     while (start<=end) {
    	 int mid = (end+start)/2;
    	 
    	 if(arr[mid]<key) {
    		 start = mid+1;
    	 }
    	 else if (arr[mid]==key) {
    		 System.out.println("found at"+ mid);
    		 break;
    	 }
    	 else {
    		 end = mid-1;
    	 }
     }
     
     if(start>end) {
    	 System.out.println("Not found");
     }
	}

}
