package QarticesQuestion;

public class Break1to10odnodispaly {

	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 == 0)
				continue;
			System.out.println(i);

		} while (++i < 100);

	}

}
