package Rajuifelse4;

import java.util.Scanner;

public class MangoTag {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Qm = sc.nextInt();
		int Ip = sc.nextInt();
		if(Qm<5) {
			Ip=Ip+50;
		}
		else if (Qm<80) {
			Ip=Ip+100 ;
		}
		else {
			Ip=Ip+100;
		}
		System.out.println(Ip);
	}

}
