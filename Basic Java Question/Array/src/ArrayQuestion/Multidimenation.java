package ArrayQuestion;

public class Multidimenation {

	public static void main(String[] args) {
		int[][] numArr = new int[3][5];
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
				numArr[i][j] = i + j;
			}
		}
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
				System.out.print(" " + numArr[i][j]);
			}
			System.out.println();
		}
	}

}
