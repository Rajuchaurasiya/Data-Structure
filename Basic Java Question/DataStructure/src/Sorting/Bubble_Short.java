package Sorting;

public class Bubble_Short {

	public static void main(String[] args) {

		int arr[] = { 12, 34,  11, 23, 54, 36, 61, 42, 24, };
        
		for (int i=0; i<9; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
				     arr[j] = temp;
				}
			}
		}
		System.out.println("shoted");
		for(int i=0; i<9; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
