 package Ds_presticws;

public class Bubble_Short {

	public static void main(String[] args) {
		
		int arr[] = {4,-1,3};
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
       System.out.println("shorted Array");
       for(int item : arr) {
    	   System.out.print(item +" ");
       }
	}

}
