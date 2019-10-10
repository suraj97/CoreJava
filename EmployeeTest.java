
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.input(7690,"Suraj","trainee",22000);
		e1.calculateSal();
		e1.display();		
		
		e2.input(7680,"John","trainee",13000);
		float s1=e2.calculateSal();
		e2.display();
		System.out.println("The total salary displayed from Main:"+s1);
	}
}
