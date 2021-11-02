package ArrayQuestion;

public class Second_last {

	public static void main(String[] args) {

		int max = 0;

		int arr[] = { 2, 4, 6, 87, 97 };
		for (int i = 0; i < 5; i++) {

		}
		max = arr[0];
		for (int i = 0; i < 5; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(arr[max-1]);

	}

}
