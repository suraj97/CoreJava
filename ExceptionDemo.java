
public class ExceptionDemo {
public static void main(String[] args)
{
	String language[]= {"c","c++","Java","perl","python"};
	try {
		for(int c=1;c<=5;c++)
		{
			System.out.println(language[c]);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
