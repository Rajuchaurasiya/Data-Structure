package Top_100_code;

public class Find_the_reverse_number {

	public static void main(String[] args) {

		int num = 876543;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println(rev);

	}
}