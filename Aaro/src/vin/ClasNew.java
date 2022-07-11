package vin;

public class ClasNew
{

	public static void main(String[] args) 
	{
		ClassRoom newton=new ClassRoom();
		ClassRoom edison=new ClassRoom();
		System.out.println(newton.jill+" "+newton.janck+" "+newton.jack);
		System.out.println(edison.jill+" "+edison.janck+" "+edison.jack);
	}

}
 class ClassRoom
{
	Projector jill=new Projector();
	static Toilet janck=new Toilet();
	Board jack=new Board();
	
}
class Projector
{
	
}
class Toilet
{
	
}
class Board
{
	
}
