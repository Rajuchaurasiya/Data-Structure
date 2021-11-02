package Sorting;

public class ArrayLearning {
	public static void main(String[] arg) {
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) arr[i] = i + 1;
		 

		int i = 4, j = 6, x = 9, z = 2;
		System.out.println(arr[++j+z--+j+++--j]- ++z- --z);

	}
}
