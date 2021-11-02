package WhileLoopQestion;

public class Question5 {

	public static void main(String[] args) {
		/*int i = 1;
		while (true) {
			i++;
			if (i > 20)
				break;

		}
		System.out.println(+i);*/

		boolean flag = true;
		int i = 1;
		while(flag) {
			i++;
			if(i>20) {
				flag = false;
			}
		}
			
		System.out.println(i);
		
	}

}
