package Top_100_code;

public class User {
     String Name;
    int age;
    
    User(String Name,int age){
    	this.Name = Name;
    	this.age = age;			
    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [Name=" + Name + ", age=" + age + "]";
	}
    
}
