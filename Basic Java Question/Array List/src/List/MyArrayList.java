package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList();
		List<String> vegetable = new ArrayList();
		
		fruits .add ("apple");
		fruits .add ("orange");
		fruits .add ("papaya");
		
		vegetable .add ("Patato");
		vegetable .add ("Tamato");
		vegetable .add ("Carroat");
		
		fruits.addAll(vegetable);
		//System.out.println(vegetable);
		System.out.println(fruits);
		
	}

}
