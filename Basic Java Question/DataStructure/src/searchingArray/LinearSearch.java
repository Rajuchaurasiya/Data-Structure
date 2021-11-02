 package searchingArray;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		int arr [] = {5,6,7,4,8,9,12};
		int key = sc.nextInt();
		int i=0;
		for(i=0; i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.print("found");
				break;
			}
			
		}
		if(i==arr.length) {
			System.out.println("Not Found");
		}*/
		
			//import java.util.Scanner;	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int arr [] = {3,4,55,6,7,8};
        int key  =sc.nextInt();
        int i = 0;
        for(i=0; i<arr.length; i++) {
        	if(arr[i] >= key) {
        		//System.out.println("enter the surching the element");
        	System.out.print(arr[i]+"," );
        	//break;
        	}
        }
       // if(i==arr.length) {
        	//System.out.println("not Found");
        	
        
	}

}

