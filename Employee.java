import java.util.Scanner;
class Employee {
	int emp_Id;
	String emp_Name,dept;
	float basic,hra,tax,totalSal;
	Scanner s;
	public void input(int r,String n,String dept,float bas)
	{
		s=new Scanner(System.in);
		System.out.println("Enter Employee Id,Name,Department & Basic Salary");
		emp_Id=s.nextInt();
		emp_Name=s.next();
		dept=s.next();
		basic=s.nextFloat();
	}
	public float calculateSal()
	{
		hra=basic*.10f;
		tax=basic*.5f;
		totalSal=(basic+hra)-tax;
		return totalSal;
	}
	public void display()
	{
		System.out.println("The Employee Details:");
		System.out.println("Employee Id:"+emp_Id);
		System.out.println("Employee Name:"+emp_Name);
		System.out.println("Department:"+dept);
	}
	}

