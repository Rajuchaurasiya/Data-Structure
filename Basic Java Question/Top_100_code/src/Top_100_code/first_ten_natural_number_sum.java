package Top_100_code;

public class first_ten_natural_number_sum {

	public static void main(String[] args) {
		
		int i =1;
		int sum = 0;
		while(i<=10) {
			System.out.print(i+" ");
			sum = sum +i;
			i = i+1;
		}
		System.out.println(" sum = "+ sum);
	}

}
