package april22;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int result=0;
	//Q=>1 three number me se largest
	//result = (a>b)?(a>c? a:c):(b>c?b:c);
	
	
	
			
	// Q=>2 three num me se second largest 
    result = (a>b?(a>c?(b>c?b:c):a):(b>c?(a>c?a:c):b));
    System.out.println(result);
    
	}

}
