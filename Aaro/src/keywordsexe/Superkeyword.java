package keywordsexe;

public class Superkeyword
{

	public static void main(String[] args) 
	{
		Mediam med=new Mediam();
		med.topmet();
	}

}
abstract class Toptop 
{
	final public void topmet() 
	{
		System.out.println("topstar methed called..11111");
	}
}
abstract class Topstar extends Toptop
{
	final public void topm() 
	{
		super.topmet();
		System.out.println("topstar methed called..22222");
	}
}
abstract class Top extends Topstar
{
	 public void topmt() 
	{
		 super.topmet();
		System.out.println("topstar methed called..11111");
	}
}
class Mediam extends Top
{
	
}