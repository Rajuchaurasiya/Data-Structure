package objectOrentedProgrming;

public class Method {
	
	public static void main(String[] agrs) {
		
	 person p2 = new person();
	 p2.name = "Raju";
	 p2.age = 12;
	 
	 p2.walk();
	 p2.walk(2);
	 
		
	}

}

  class pesion{
	  String name;
	  int age;
	  void walk() { 
		  
		  System.out.println(name+"is waking  " );
	  }
	  void walk(int step) {
		  System.out.println(name+"is waking step");
	  }
	 
  }