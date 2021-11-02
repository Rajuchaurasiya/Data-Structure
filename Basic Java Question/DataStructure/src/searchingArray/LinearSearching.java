package searchingArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearSearching {

	public static void main(String[] args) throws Exception {
		
		double arr[] = new double [10];
		//String arr[] = new String[5];
		boolean flag = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Enter 10 Elements for an array");
		for (int i = 0; i<arr.length; i++)
		{
			arr[i]= Double.parseDouble(br.readLine());
			//arr[i] = br.readLine();
		}
		System.out.print("Enter the value of surched:");
	     Double s = Double.parseDouble(br.readLine());
		//String s = br.readLine();
		for(int i=0; i<arr.length; i++)
		{
			//if(arr[i]<= equals(s))
			{
				//if(arr[i].equalsIgnoreCase(s))
	            
			}
				System.out.println("Elmeant found at index =" + i);
				
				flag =true;
				break;
			}
		
		if(flag==false) {
			
			System.out.println("Element not found" );
		}
	}

}
