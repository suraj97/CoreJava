public class Circle implements Shape1
{
	private double radius;
	
	public Circle(double r)
	{
		this.radius = r;
	}
	public void draw()
	{
		System.out.println("Draawing Circle");
	}
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	
}
