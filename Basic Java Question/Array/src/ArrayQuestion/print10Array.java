package ArrayQuestion;

public class print10Array {

	public static void main(String[] args) {
		
   
    int arr[] = {2,4,7,2,3,5,3,7,9};
    int n = arr.length;
    for(int i=0; i<n-1; i++) {
    	for(int j=0; j<n-1; j++) {
    		if(arr[j]<arr[i]) {
    			
    			int temp = arr[j+1];
    			 arr[j+1] = arr[j];
    			arr[j] = temp;
    		}
    	}
    }
    for(int i=0; i<n-1;i++) {
    	System.out.print(arr[i]+" ");
    }
    
	}
	
}
