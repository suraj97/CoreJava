public class TestThrow {
	static void Validate(int age)
	{
		if(age<18)
		throw new ArithmeticException("Not Valid");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String args[])
	{
		Validate(13);
		System.out.println("rest of the code...");
	}

}
