package allQustion;

public class Star_Question {

	public static void main(String[] args) {

//		int x = 4;
//		int y = 5;
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=5; j++) {
//				System.out.print(" @ ");
//			}
//			System.out.println();
//		}

//		Question =2; rectangle @@@@@@@
//		                       @     @
//		                       @     @
//		                       @@@@@@@

//		int a = 4;
//		int b = 5;
//		
//		for(int i=1; i<=a; i++ ) {
//			for(int j=1; j<=b; j++) {
//				if(i == 1 || j == 1||i == a || j == b) {
//					System.out.print("#");
//					
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}		
//	
//		Question no => 3; #
//		                  ## 
//		                  ###
//		                  ####
//		                  ######
//		
//		int p = 5;
//		//outer loop 
//		for (int i=1; i<=p; i++) {
//			// inner loop
//			for(int j=1; j<=i; j++ ) {
//				System.out.print(" @ ");
//			}
//			System.out.println();
//		}

		// Question no = 4 #####
//		                     ####
//		                     ###
//		                     ##
//		                     #

//		int s = 5;
//		for(int i=s; i>=1; i-- ) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}

		// Question no =>5;
//		                    ######
//		                     #####
//		                      ####
//		                       ###
//		                        ##
////		                         #
//		 int w = 4;
//		 for(int i=1; i<=w; i++) {
//			 for(int j=1; j<=w-i; j++) {
//				 System.out.print("  ");
//			 }
//			 for(int j=1; j<=i; j++ ) {
//				 System.out.print(" # ");
//			 }
//			 System.out.println();
//		 }

		// Question no = 6; 1
//		                 1 2
//		                 1 2 3
//		                 1 2 3 4
//		                 1 2 3 4 5
//		int d = 5;
//		for (int i = 1;  i<=d; i++) {
//			for (int j = 1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
      //Question no =>8
		
//		int g =5 ;
//		for(int i=1; i<=g; i++) {
//			for(int j=1; j<=g-i+1; j++) {
//				System.out.print( j+" " );
//			}
//			System.out.println();
//		}
		
//	Question no =>9;	1
//		                2 3 
//		                4 5 6 
//		                7 8 9 10
//		                11 12 13 14 15
//		                
//		
//		int l = 5;
//		int number = 1;
//		
//		for(int i=1; i<=l; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(number);
//				number++;
//			}
//			System.out.println();
//		}
		 
		
		//Qiestion no =>9
			int f = 5;
			for(int i=1; i<=f; i++) {
				for(int j=1; j<=i; j++ ) {
					int sum = i+j;
					if(sum % 2 ==0 ) {
						System.out.print(" 1 ");
					}else {
						System.out.print(" 0 ");
					}
					
				}
				System.out.println();
			}
	}
}
