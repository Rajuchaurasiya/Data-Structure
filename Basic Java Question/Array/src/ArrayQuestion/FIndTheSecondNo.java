package ArrayQuestion;

public class FIndTheSecondNo {

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 3, 4, 8, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}
		System.out.println(sum-2);

	}

}
