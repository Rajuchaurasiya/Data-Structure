package objectAndClass;

public class Mainclass {

	public static void main(String[] args) {
		person P1= new person();
        P1.age = 22;
        P1.name = "Raju";
        person p2 = new person();
        p2.age = 23;
        p2.name = "Rajesh";
        
       // System.out.println(P1.age+" "+P1.name);
        //System.out.println(p2.age+""+p2.name);
        //Method
      //  p2.eat();
        
	}
}
class person{
	String name;
	int  age;
    
	void walk() {
		System.out.println(name+"is waking");
		
	}
	void eat(){
		System.out.println(name+"is eating");
		
		
	}
	void walk(int steps) {
		System.out.println(name+"walks + steps");
	}
	}

