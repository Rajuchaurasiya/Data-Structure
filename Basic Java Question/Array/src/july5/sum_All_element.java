package july5;

public class sum_All_element {

	public static void main(String[] args) {
		int sum =0;
		int arr[] = {3,4,6,8,9,3,6};
		
		for(int i=0; i<arr.length; i++) {
			sum = sum*arr[i];
		}
       System.out.println(sum);
	}

}
