package searchingArray;

import java.util.Scanner;

public class BinarySearchInfinte {

	public static String PalindromeCreator(String str) {
		StringBuilder input = new StringBuilder();
		input.append(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = input.charAt(i);
			input.deleteCharAt(i);
			if (check(input.toString()))
				return ch + "";
			input.insert(i, ch);
		}
		for (int i = 0; i < str.length(); i++) {
			char chi = input.charAt(i);
			char chj;
			input.deleteCharAt(i);
			for (int j = i+1; j < input.length()-1; j++) {
				chj = input.charAt(j);
				input.deleteCharAt(j);
				if (check(input.toString()))
					return chi +""+ chj+"";
				input.insert(j, chj);
			}
			input.insert(i, chi);
		}
		return "not possible";
	}

	public static boolean check(String str) {
		StringBuilder input = new StringBuilder();
		if (str.length() % 2 == 0) {
			input.append(str.substring(str.length() / 2, str.length()));
			input.reverse();
			return str.substring(0, str.length() / 2).equalsIgnoreCase(input.toString()) ? true : false;
		}
		input.append(str.substring(str.length() / 2 + 1, str.length()));
		input.reverse();
		if (str.substring(0, str.length() / 2).equalsIgnoreCase(input.toString()))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(PalindromeCreator(sc.nextLine()));
	}
}
