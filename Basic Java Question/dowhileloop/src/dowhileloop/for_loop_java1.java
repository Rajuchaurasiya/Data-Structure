package dowhileloop;

//import java.util.Scanner;

public class for_loop_java1 {

	public static void main(String[] args) {

	/*	int x = 13;
		if (x % 2 == 0) {
			System.out.println("Evean number");
		} else {
			System.out.println("Odd number");
		}*/
      /*  Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x>y) {
        	System.out.println(x);
        }else {
        	System.out.println(y);
        }*/
      /*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
      if(x>y) {
    	  if(x>z) {
    		  System.out.println(x);
    	  }else {
    		  System.out.println(z);
    	  }
      }else {
    	  if(y>z) {
    		  System.out.println(y);
    		  
    	  }else {
    		  System.out.println(z);
    	  } 
      }*/
		
		/*Scanner sc = new Scanner (System.in);
		String A = sc.next();
		String R = new StringBuilder(A).reverse().toString();
		if(A.equals(R)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}*/
		
		//for(int i=1; i<=100; i++) {
		//System.out.print(i+" ");
	/*	for(int i=100; i>=1; --i) {
			System.out.print(i+" ");
		}*/
		
	/*	int num = 7;
		for(int i =0; i<=10; i++) {
			System.out.println(num + " x " + i + " = "+ i * 7);
		}*/
		
	/*	for(int i=0; i<=20; i = i+2) {
			System.out.println(i);
		}*/
		
		/*Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		//int = sum + sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			sum = sum +i;
		}
		System.out.println(sum);*/
		
		int arr[] = {23,45,67,87,345,7879};
		int max = 0;
		for( int num : arr) {
			if(num>max)
				max= num;
			
		}
		System.out.println(max);
	}
}
