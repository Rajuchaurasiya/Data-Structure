package objectOrentedProgrming;

public class Obj_and_Class {

	public static void main(String[] args) {
		
		person p1 = new person();
		p1.name = "Raju";
		p1.age = 23;
		
		System.out.println(p1.name+" "+p1.age);

	}

}

 class person{
	 String name;
	 int age;
 }