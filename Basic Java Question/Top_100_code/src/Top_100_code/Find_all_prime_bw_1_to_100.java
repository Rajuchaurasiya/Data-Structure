package Top_100_code;

public class Find_all_prime_bw_1_to_100 {

	public static void main(String[] args) {
		 
		
		for(int i=1; i<=100; i++) {
			int n = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) 
				n++;	
				
			}
			if(n==2)
				System.out.print(i+" ");
				
		}

	}

}
