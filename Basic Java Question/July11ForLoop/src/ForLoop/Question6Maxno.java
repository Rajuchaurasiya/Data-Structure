package ForLoop;

public class Question6Maxno {

	public static void main(String[] args) {
		int arr[] = {6, 7, 34, -23, 45, 48, 9, 4, 10, 21 ,98 ,67,100001};
        int max = 0;
        for(int number:arr) {
        	if(number > max) 
        		
        	max = number;
        }
        System.out.println(+max);
	}

}
