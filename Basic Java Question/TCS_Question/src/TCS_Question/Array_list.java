package TCS_Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_list {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Raju");
		cars.add("Raj");
		cars.add("Ram");
		cars.add("Ramu");
		cars.add("Rajesh");
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] { -5, -8, -7, -6, -4, -3, -9 }));
//		sortList(list);
		System.out.println("SUM:" + sumofElements(list));
		System.out.println("MAX:" + maxOfElements(list));
		// cars.set(0, "Akash");
		// cars.remove(2);
		cars.clear();
		System.out.println(list);
		// System.out.println(cars.get(5-2));
		// System.out.println(cars.get(0));

	}

	public static ArrayList<Integer> sortList(ArrayList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (list.get(j + 1) < list.get(j)) {
					int temp = list.get(j + 1);
					list.set(j + 1, list.get(j));
					list.set(j, temp);

				}
			}
		}
		return list;
	}

	public static int sumofElements(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		return sum;
	}

	public static int maxOfElements(ArrayList<Integer> list) {
		//int min = Integer.MAX_VALUE;
		int max = -10000;

		// for(int number : list) {
		// if(number > max) {
		// max = number;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
				
			}
		}

		return max;
	}
}
