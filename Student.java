import java.util.Scanner;
public class Student {
	int Student_Id;
	String Student_Name;
	float Student_marks;
	float total,m1,m2,m3;
	Scanner s3;
	public void input(int SId, String Sname, float marks1, float marks2, float marks3)
	{
		 s3=new Scanner(System.in);
		System.out.println("Enter the student details");
		Student_Id= s3.nextInt();
		Student_Name=s3.next();
		m1=s3.nextFloat();
		m2=s3.nextFloat();
		m3=s3.nextFloat();
	}
	 public float calculateMarks()
	{
		if(total>=70 && total<100)
		{
			System.out.println("Distinction");
		}
		else if (total>=60 && total<70)
		{
			System.out.println("First Class");
		}
		else if (total>=50 && total<60)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}
		
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
		}
	}

