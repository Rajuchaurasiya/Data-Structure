package objectAndClass;

//import objectOrentedProgrming.EmployeeBean;

public class EmployeeTest {

	//public static void main(String[] ) {

//public class EmployeeTest{
	public static void main(String[]args) {
		EmployeeBean employeeBean  = new EmployeeBean();
		employeeBean.setEmpId("E001");
		employeeBean.setLastNane("Chaurasiya");
		employeeBean.setFirstName("Raju");
		employeeBean.setAge(22);
		System.out.println("Added Employee-" + employeeBean);
	}

}

