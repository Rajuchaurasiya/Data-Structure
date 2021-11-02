package allQustion;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr1[] = sc.nextLine().split(" ");
		String arr2[] = sc.nextLine().split(" ");
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i=0;i<arr2.length;i++) {
			int temp = Integer.parseInt(arr2[2]);
			if(map.containsKey(temp))map.put(temp,map.get(temp));
			else map.put(temp,1);
		}
		for(int i=0;i<arr1.length;i++) {
			int temp = Integer.parseInt(arr1[i]);
			for(int key:map.keySet()) {
				if(temp<=key) {
					System.out.print(key+",");
				}
			}
		}
		/*
		6 1 2 4 7 9 6 0 1 2 1 1 4
		*/
				
	}

}
