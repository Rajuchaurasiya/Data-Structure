package collagepreactage;

import java.util.Scanner;

public class PassAndFall {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x>=30) {
    	System.out.println("pass");
    }
    else {
    	System.out.println("Fall");
    }
	}

}
