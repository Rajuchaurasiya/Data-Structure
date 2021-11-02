package QarticesQuestion;

public class BreakinjavaStarquestion {

	public static void main(String[] args) {
	     outer:
		for(int i=0; i < 6; i++) {
	    for(int j=0; j < 6; j++) {
	    	if(j>i) {
	    		System.out.println();
	    		continue outer;
	    	}
	    	System.out.print("*");
	       }
		}
	}

}
