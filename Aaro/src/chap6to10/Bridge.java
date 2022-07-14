package chap6to10;

public class Bridge {

	public static void main(String[] args) {
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
		
//		Shape tri = new Triangle(new RedColor());
//		tri.applyColor();

	}
}

class GreenColor implements Color 
{
	public void applyColor() 
	{
		System.out.println("green.");
	}
}

//class RedColor implements Color 
//{
//	public void applyColor() 
//	{
//		System.out.println("red.");
//	}
//}

interface Color 
{
	public void applyColor();
}

abstract class Shape 
{
	// Composition - implementor
	protected Color color;

	// constructor with implementor as input argument
	public Shape(Color c) 
	{
		System.out.println();
		this.color = c;
	}

	public abstract  void applyColor();
}

class Pentagon extends Shape 
{
	public Pentagon(Color c) 
	{
		super(c);
	}

	@Override
	public void applyColor() 
	{
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}

//class Triangle extends Shape 
//{
//	public Triangle(Color c) 
//	{
//		super(c);
//	}
//
//	@Override
//	public void applyColor() 
//	{
//		System.out.print("Triangle filled with color ");
//		color.applyColor();
//	}
//}
