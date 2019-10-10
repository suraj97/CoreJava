import java.util.Scanner;

public class Student1 {
	int Student_Id;
	String Student_Name;
	float total;
	int m1,m2,m3;
	Scanner s3;
	public void input()
	{
		 s3=new Scanner(System.in);
		System.out.println("Enter the student details");
		Student_Id= s3.nextInt();
		Student_Name=s3.next();
		m1=s3.nextInt();
		m2=s3.nextInt();
		m3=s3.nextInt();
	}
	 public float calculateMarks()
	{
		
		total=(m1+m2+m3)/3;
		return total;
		
	}
		public void display()
		{
			System.out.println("The Student Details:");
			System.out.println("Student Id:"+Student_Id);
			System.out.println("Student Name:"+Student_Name);
			System.out.println("Marks1:"+m1);
			System.out.println("Marks2:"+m2);
			System.out.println("Marks3:"+m3);
			System.out.println("Total0:"+total);

			if(total>=70.0 && total<100.0)
			{
				System.out.println("Distinction");
			}
			else if (total>=60.0 && total<70.0)
			{
				System.out.println("First Class");
			}
			else if (total>=50.0 && total<60.0)
			{
				System.out.println("Second Class");
			}
			else
			{
				System.out.println("Fail");
			}
		}
}
