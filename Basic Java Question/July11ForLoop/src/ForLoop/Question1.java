package ForLoop;

public class Question1 {

	public static void main(String[] args) {
		int sum = 0,i=5;
		for (; (i <= 10 && i >= 2); i++) {
			sum = sum + i;
			sum = sum + i;
			sum = sum + i;
			sum = sum + i;
			sum = sum + i;
			sum = sum + i;
		}
		System.out.println("i="+i+", sum="+sum);

	}

}
