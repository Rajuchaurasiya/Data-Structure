package collagepreactage;
import java .util.Scanner;

public class LengthAndBreath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length");
        int L = sc.nextInt();
        System.out.println("Enter your Breath");
        int B = sc.nextInt();
        if(L==B) {
        	System.out.println("Square");
        }
        else {
        	System.out.println("Rectangle");
        }
	}

}
