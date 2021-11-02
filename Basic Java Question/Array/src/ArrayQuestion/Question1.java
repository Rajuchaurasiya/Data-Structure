package ArrayQuestion;

public class Question1 {

	public static void main(String[] args) {
		/*int[] numarr = new int[10];
		for(int i = 0; i < numarr. length; i++) {
			System.out.println("value at index" +i+ "is" + numarr[i]);
		}*/
         int[]numArr = new int [5];
         numArr [3] = 7;
         numArr [0] = 9;
         for(int i =0; i<numArr.length;i++) {
        	 System.out.println("value of index" +i+ "is" + numArr[i]);
         }
	}

}
