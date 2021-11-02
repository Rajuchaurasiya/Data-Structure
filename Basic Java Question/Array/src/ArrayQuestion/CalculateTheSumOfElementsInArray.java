package ArrayQuestion;

//import java.util.Scanner;

public class CalculateTheSumOfElementsInArray {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		
		int arr[] =  {10, 6 ,7,8,4,2};
		
		int sum = 0;
		for(int i=0; i<6; i++) {
			
			sum =  sum + arr[i];
		}
        System.out.println(sum);
		
		
		
		
	}

}
