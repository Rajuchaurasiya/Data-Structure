package Top_100_code;

import java.util.Scanner;

public class Blank_page {

	public static void main(String[] args) {
		User arr[] = new User[3];
		arr[0] = new User("Avinash",25);
		arr[1] = new User("Ashutosh",26);
		arr[2] = new User("Raju",28);
		User Max = null; 
		for(int i=1;i<3;i++) {
			if(arr[i].getAge()>arr[i-1].getAge()) {
				Max = arr[i];
			}
			
		}
		System.out.println(Max.getName());
		
	}
}