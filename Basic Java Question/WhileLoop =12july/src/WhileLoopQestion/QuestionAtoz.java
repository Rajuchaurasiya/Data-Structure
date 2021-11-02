package WhileLoopQestion;

public class QuestionAtoz {

	public static void main(String[] args) {
		char ch = 'A';
		int i = 0;

		do {
			System.out.print(ch+",");
			ch = (char) ((int) ch + 1);
			i++;
		} while (i <= 25);

	}

}
