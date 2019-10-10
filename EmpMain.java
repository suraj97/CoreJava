
 class EmpMain {
	 int var;
	 String city;
	 EmpMain()
	{
		System.out.println("Default Constructor");
		var=989;
		city="blr";	
	}
	
	EmpMain(int a) 
	{
		System.out.println("Parameterized Constructor"+a);
	}
	void display(int b,int c)
	{
		System.out.println(b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpMain e1=new EmpMain();
		EmpMain e2=new EmpMain(10);
		EmpMain e3=new EmpMain();
		
		e3.display(100,200);
	}
}
