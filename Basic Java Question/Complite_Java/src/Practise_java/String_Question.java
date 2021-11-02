package Practise_java;
import java.util.*;
public class String_Question {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		//int size = 89;
		int arr[] = {12,34,23,45,64,89};
		int key = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== key) {
				
				System.out.println("found");
				break;
							}
		}
	}

}
