package Sorting;
import java.util.*;
public class Quick_Sorting {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//int arr[] = {2,4,5,1,78,23,43,12,89};
      quicksort (arr,0,arr.length-1);
	}
    public static void quicksort(int arr[],int left, int right) {
    	if (left>=right) {
    		return;
    		
    	}
    	int pivot = arr[(left + right)/2];
    	int index = partition (arr,left,right,pivot);
    	quicksort (arr,left,index-1);
    	quicksort (arr,index,right);
    }
    public static int partition(int arr[],int left, int right, int piovt) {
    	while(left<=right) {
    		while(arr[left]<pivot) {
    			left ++;
    		}
    		while(arr[right]>pivot) {
    			right --;
    		}
    		if(left >= right) {
    		  swap (arr,left,right);
    			left++;
    			right--;
    		}
    	}
    	return left;
    }
}
