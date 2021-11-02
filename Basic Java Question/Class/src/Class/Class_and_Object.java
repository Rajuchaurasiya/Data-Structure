package Class;
 class employee  {
 float Salery = 40000;
}
class Programmer extends employee{  
	 int bonus=10000;  

	public static void main(String[] args) {
		Programmer p = new Programmer();
		 System.out.println("Programmer salary is:"+p.Salery);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);
	
	}
}
