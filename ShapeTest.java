public class ShapeTest {
	public static void main(String[] args)
	{
		Shape1 shape=new Circle1(10);
		
		shape.draw();
		System.out.println("Area="+shape.getArea());
		
		shape= new Rectangle1(10,10);
		shape.draw(); 
		System.out.println("Area="+shape.getArea());
	}

}
