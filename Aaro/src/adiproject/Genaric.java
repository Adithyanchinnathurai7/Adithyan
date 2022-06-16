package adiproject;

public class Genaric
{

	public static void main(String[] args) 
	{
		Example<Integer> ex=new Example<>(5);
		
		System.out.println("Integer value..." + ex.getData());
		
		Example <String> exp=new Example<>("Adi");
		System.out.println("String value...!"+exp.getData());
	}

}
class Example<F>
{
	private F data;
	public Example(F data)
	{
		this.data=data;
	}
	public F getData()
	{
		return this.data;
	}
}
