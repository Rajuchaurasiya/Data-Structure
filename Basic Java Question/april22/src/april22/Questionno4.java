package april22;
 import java.util.*;
public class Questionno4 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary");
    System.out.println("Enter your year");
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x>5) {
    	System.out.println(("total salary)+(bonus") + (x*y) +(y*5/100));
    }
     else{
    	System.out.println(("total salary")+(x*y));
    	
    	
    }		
    		
    		


	}

}
