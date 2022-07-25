package vin;

public class MethOver2 
{

	public static void main(String[] args) 
	{
		Dog dy=new Dog();
		dy.play(new Biscuit());
		dy.play(new Stone());
		dy.play(new Stick());
	}

}
class Dog{
	public void play(Biscuit b) {
		System.out.println("nai valattum........");
	}
	public void play(Stick s) {
		System.out.println("nai odip pogum....");
	}
	
	public void play(Stone s) {
		System.out.println("nai kadikkum.....");
	}
}
class Biscuit{}
class Stick{}
class Stone{}