package newtypes;

public class GenaricDemo
{

	public static void main(String[] args) 
	{
		GoodPaintBrush gno=new GoodPaintBrush();
		Water water=new Water();
		Air air=new Air();
		//gno.setObj(water);
		//gno.setObj(air);
		
		//water=(Water)gno.getObj();
		//air=(Air)gno.getObj();
	//	air.dusting();
		//water.sprinkle();
		//System.out.println(gno.getObj());
	}

}
class Water
{
	public void sprinkle()
	{
		System.out.println("Springle.....");
	}
}
class Air
{
	public void dusting()
	{
		System.out.println("Dusting.....");
	}
}
class GoodPaintBrush<T>
{
	private T objt;
	
	public T getObj()
	{
		return this.objt;
	}
	public void setObj(T objt)
	{
		 this.objt=objt;
	}
}
