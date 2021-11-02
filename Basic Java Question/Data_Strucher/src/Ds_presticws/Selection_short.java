package Ds_presticws;

public class Selection_short {

	public static void main(String[] args) {
		
		int arr[] = {3,4,2,-1,7,9,54,0};
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			
			int minInd = i;
			
			for(int j=i; j<n; j++) {
				if(arr[j]<arr[minInd]) {
					minInd = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minInd];
			arr[minInd] = temp;
		}
		for(int i=0; i<n-1; i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
