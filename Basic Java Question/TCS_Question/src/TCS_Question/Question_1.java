package TCS_Question;

public class Question_1 {

	public static void main(String[] args) {
		
		int raju = sum(10);
		System.out.println(raju);
	}
     public static int sum (int k) {
    	 if(k>0) {
    		 return k+sum(k-1);
    	 }else {
    		 return 0 ;
    	 }
     }
}
