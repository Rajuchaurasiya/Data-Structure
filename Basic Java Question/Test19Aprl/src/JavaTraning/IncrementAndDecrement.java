package JavaTraning;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x=6;
		//x++;
		System.out.println(++x);
		System.out.println(x);
       int a=11, b=22,c;
       c = a+b + a++ + b++ + ++a + ++b;
       System.out.println(c);
	}

}
