package sixtoelevean;
import java.util.*;
public class Questionno8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your attendence");
		int x = sc.nextInt();
		if ((x<=85)&(x<=75)) {
			System.out.println("allowed to sit in exam");
		}
		else {
			System.out.println("Not allowed to sit in exam");
		}
	}

}
