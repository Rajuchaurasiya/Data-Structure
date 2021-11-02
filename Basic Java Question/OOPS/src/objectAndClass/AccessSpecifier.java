package objectAndClass;

public class AccessSpecifier {
	protected String name;
	private String password;
	public String id;

	 String getName() {
		return this.name;
	}
		
	private String getPassword() {
		System.out.println(password);
		return this.password;			
	}
}

