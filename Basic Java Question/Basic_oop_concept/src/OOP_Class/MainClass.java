package OOP_Class;

public class MainClass {

	public static void main(String[] args) {
		person p1 = new person();
		p1.name = "Raju chaurasiya";
		p1.age = 22;
		
		person p2 = new person();
				
		p2.name = "Akash Chaurasiya";
		p2.age = 14;
		
		//System.out.println(p1.name+" "+ p1.age+" ");
    //    System.out.println(p2.name+" "+ p2.age+" ");
        
     //   p1.eat();
      //  p1.eat();
        p2.walk(2);
	}

}
class person{
	String name;
	int age;
	
	void eat(){
		System.out.println(name + "is eating");
	}
	void walk(){
		System.out.println(name + "is walking");
	}
	void main(int steps) {
		System.out.println(name + "walked " + steps);
	}
}

