package collagepreactage;
import java.util.Scanner;
public class vediono11 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your maths marks:");
  int maths = sc.nextInt();
  System.out.println("Enter your english marks:");
  int english = sc.nextInt();
  System.out.println("Enter your phy marks:");
  int phy = sc.nextInt();
  System.out.println("Enter your hinde marks:");
  int hinde = sc.nextInt();
  System.out.println("Enter your computer marks:");
  int computer = sc.nextInt();
  float percentage = ((maths + english + phy + hinde + computer)/500.0f)*100;
  // System.out.println("percentage :");
    System.out.println(percentage);

	}

}
