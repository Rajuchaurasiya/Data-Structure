package List;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		 
	 ArrayList	<String> cars = new ArrayList<String>();
	 
	 cars.add("volv");
	 cars.add("Mazda");
	 cars.add("Ford");
	 cars.add("Mazrd");
	 cars.add("BMW");
	 cars.add("Aodi");
	 //System.out.println(cars.get(3));
	// System.out.println(cars);
	 //cars.set(3, "RAJU");
	// cars.remove(4);
	// cars.clear();
	// System.out.println(cars.size());
	 for(int i=0; i<cars.size(); i++ )
	 System.out.println(cars.get(i)); 
	}

}
