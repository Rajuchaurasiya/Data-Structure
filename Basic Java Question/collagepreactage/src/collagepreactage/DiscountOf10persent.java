package collagepreactage;
import java.util.Scanner;

public class DiscountOf10persent {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner (System.in);
		System.out.println("Enter your Quentity");
		int x = sc.nextInt();
		int y = x*100;
		if(y>100) {
			System.out.println(y*100);
			
		}
		else{
			System.out.println("No Discount");
		} 
		{}

	}

}
