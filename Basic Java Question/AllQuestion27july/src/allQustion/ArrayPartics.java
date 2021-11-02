package allQustion;

import java .util.Scanner;

public class ArrayPartics {

	public static void main(String[] args) {
		//Creat an array of 5 floats and calculate their sum?
		/* float [] marks = {23.1f, 34.2f, 25.1f, 65.1f, 12.1f,};
		 float sum=0;
		 //for each loop(enhanced for loop)
		 for (float element:marks) {
			 sum =sum +element;
	
		 }
         System.out.println(sum);*/
		//Question =>2;
		/* float [] marks = {23.1f, 34.2f, 25.1f, 65.1f, 12.1f,};
		 float num=23.11f;
		 boolean isInArray = false;
		 //for each loop(enhanced for loop)
		 for (float element:marks) {
			 if(num==element) {
			 isInArray = true;
	          break;
		 }
	}
  if (isInArray) {
	  System.out.println("the vale is present in the Array");
	  }
  else {
	  System.out.println("the is not present in the array");
  }*/
		
		//Question no =>10 (find two no. evean or odd.)?
		
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Element");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Evean number ");
		}else {
			System.out.println("odd number");
		}*/
		
	//	Quesation no =>11 (find the value of two no. Smaller and grater)?
	
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Enter your element");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter your element");
		if(x>y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}*/
		/*int i = 10;
		String z = "Hello";
		if(i>5 && z.equals("Hello")) {
			System.out.println("Inside if");
			
		}else {
			System.out.println("Inside else");
		}
			System.out.println("After if-else statement");
		*/
	/*	int amount = 5000;
		if(amount>5000) {
			amount = amount + (amount*10/100);
			
		}else if (amount >3000&& amount <=5000) {
			//add 15%
			amount = amount + (amount*15/100);
		}else if (amount >1000&& amount <=3000) {
			//add 20%
			amount = amount + (amount*20/100);
			
		}else {
			amount = amount + (amount*25/100);
		} 
		System.out.println ("amount is- " +amount);
		*/
		
		//Question =>10 (find the three no. one no. find grested no. )
		
	/*	Scanner sc = new  Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y) {
			if(x>z) {
				System.out.println(x);
			}else {
				System.out.println(y);
			}	
			}else {
				if(y>z) {
					System.out.println(y);
				}else {
					System.out.println(z);
				
			}
		}*/
		
		// Question =>101 How to find two student "pass" or "Fall"?
		
	/*	Scanner sc = new Scanner (System.in);
		int mark = sc.nextInt();
		if(mark>30) {
			System.out.println("pass");
		}else {
			System.out.println("Fall");	
	}*/
		
		//Question =>102 How to find greading system ?
		
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Enter your mark");
		int x = sc.nextInt();
		if(x<25) {
			System.out.println("F");
		}else if((x>=25)&&(x<45)) {
			
				System.out.println("E");
			}else if((x>=45)&&(x<50)) {
				
				System.out.println("D");
		}else if((x>=50)&&(x<60)) {
			
			System.out.println("c");
			
		}else if((x>=60)&&(x<80)) {
			
			System.out.println("B");
			
		}else if((x>=80)&&(x<100)) {
			
			System.out.println("A");
		}else {
			System.out.println("No Mark");
		}*/
		
		//Question => 104 How to find Leap year?
		Scanner sc = new Scanner (System.in);
		
		int year = sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("LEAP YEAR");
		}else {
			System.out.println("COMMON YEAR");
		}
  }
}
