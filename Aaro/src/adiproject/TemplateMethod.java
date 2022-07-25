package adiproject;

public class TemplateMethod {
	public static void main(String[] args) 
	{
		HouseTemplate houseType=new WoodenHouse();
		houseType.buildHouse();
	}
}

abstract class HouseTemplate {
	
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindow();
	}

	public void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

	public void buildWindow() {
		System.out.println("Building Glass Windows");

	}

	public abstract void buildWalls();

	public abstract void buildPillars();

}

//class GlassHouse extends HouseTemplate {
//	@Override
//	public void buildWalls() {
//		System.out.println("Building Glass Wall");
//
//	}
//
//	@Override
//	public void buildPillars() {
//		System.out.println("Building pillars with glass coating");
//
//	}
//}

class WoodenHouse extends HouseTemplate {
	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");

	}

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with wood coating");

	}
}