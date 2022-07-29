package keywordsexe;

public class Finalkey 
{

	public static void main(String[] args) 
	{
		Fine f=new Fine();
		//f.d=20;//normal variable
		//f.x=50;
		f.d=30;
	}

}
/*
final class Fine //final class don't inherit
{
	final int x=100; // final variable don't change
	int d=20;// normal variable
}
class subFine extends Fine
{
	
}*/








 class Fine //normal class  inherit
{
int d=20;// normal variable


}
class subFine extends Fine
{
	
}
