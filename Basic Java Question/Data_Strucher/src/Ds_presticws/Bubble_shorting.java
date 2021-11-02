package Ds_presticws;

public class Bubble_shorting {

	public static void main(String[] args) {
		
		int arr[] = {2,1,5,3,67,4,97,11,-1};
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j+1] < arr[j]) {
					
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Shoted array");
		for(int i=0; i<n-1; i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
