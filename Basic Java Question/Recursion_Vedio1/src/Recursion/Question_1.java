package Recursion;

public class Question_1 {
  public static void printNum(int n ) {
	  
	  if(n==6) { //0
		 return; 
	  }
	  System.out.println(n);
	  printNum(n+1);  // (n-1)
  }
	public static void main(String[] args) {
		
		int n = 1; //5
      printNum(n);
	}

}
