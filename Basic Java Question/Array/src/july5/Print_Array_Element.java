package july5;

import java .util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Print_Array_Element {

	public static void main(String[] args) {
		
	HashMap<String,String> nameTitle = new HashMap<String,String>();
		
		nameTitle.put ("Raju ", "Chaurasiya");
		nameTitle.put ("pankaj ", "Singh");
		nameTitle.put ("Authosh ", "Sinha");
		nameTitle.put ("Avnash ", "Gupta");
		Set<Integer> set = new HashSet<Integer>();
		set.add(3);set.add(1);set.add(1);set.add(1);set.add(1);set.add(2);set.add(2);
		System.out.println(set);
		for(String i : nameTitle.keySet()) {
			System.out.println(i);
		}
	}
}