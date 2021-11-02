package BignerInjava;

public class ForLoop {

	public static void main(String[] args) {
		 
		/*for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
		System.out.print(" * ");
			}
			System.out.println();
		}*/
		
		int arr[] = {12,23,4456};
		for(int i :arr) {
			System.out.println(i);
		}
	}

}
