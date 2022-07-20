package adiproject;

public class Visitor2 {

	public static void main(String[] args) {
			Child ini=new Child();
			Dog mani=new Dog();
			Item item=new Stick();
			
			ini.playWithDog(mani, item);
	}

}

abstract class DogExceptions extends Exception {
	public abstract void visit();

}

class DogBiteException extends DogExceptions {
	String msg;

	public DogBiteException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {

		return this.msg;
	}

	@Override
	public void visit() {
		new  Handler().handle(this);
	}

}
class DogBarkException extends DogExceptions
{
	String msg;
	public DogBarkException(String msg) {
		
		 this.msg=msg;
	}
	@Override
	public String toString() {
		
		return this.msg;
	}
	@Override
	public void visit() {
		
		new Handler().handle(this);
	}
}

class Handler
{
	public void handle(DogBiteException dbe) {
		System.out.println("handle bite exception...taking to hospital");
		
	}
	public void handle(DogBarkException dre) {
		System.out.println("handle barking exception... being silet...");
	}
}

abstract class Item
{
	public abstract void execute()throws DogExceptions;
}

class Stick extends Item
{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBiteException("you beat I bite...");
		
	}
}
class Stone extends Item
{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBarkException("you hit I bark");
		
	}
}
class Dog
{
	public void play(Item item) throws DogExceptions {
		item.execute();
		}
}

class Child
{
	public void playWithDog(Dog tiger,Item item) {
		
		try 
		{
			tiger.play(item);
		}
		catch(DogExceptions de)
		{
			System.out.println(de);
			de.visit();
		}
		
	}
}









