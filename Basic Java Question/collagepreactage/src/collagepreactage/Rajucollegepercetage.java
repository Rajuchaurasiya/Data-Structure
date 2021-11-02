package collagepreactage;

import java.util.Scanner;

public class Rajucollegepercetage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your maths marks");
		System.out.println("Enter your English marks");
		System.out.println("Enter your Hindi marks");
		System.out.println("Enter your phy marks");
		System.out.println("Enter your chem marks");
		//System.out.println("Enter your com marks");
		int maths = sc.nextInt();
		int English = sc.nextInt();
		int Hindi = sc.nextInt();
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		//int com = sc.nextInt();
		float percentage = ((maths+English+Hindi+phy+chem)/500.0f)*100;
		System.out.println(percentage);
	}

}
