package fullinheritance;

public class newinhn {
	public static void main(String[] args) {
		Hall1 hall=new BirthDayHall();
		
		hall=new MarriageHall();
		
		PaintBrush hh=new PaintBrush() ;
		hh.doPaint(new BluePaint() );
		
		GoodDog  gg= new GoodDog();
		gg.play(new Stone1());
		
		BadDog ff= new BadDog(); 
	}
}
abstract class Hall1{
	
}
class BirthDayHall extends Hall1{
	
}
class MarriageHall extends Hall1{
	
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red color");
		}
		else if(i==2) {
			System.out.println("blue color");
		}
	}
}
class PaintBrush{
	public void doPaint(Paintt p) {
		System.out.println(p);
	}
}
abstract class Paintt{}
class BluePaint extends Paintt
{
	
}
class GreenPaint extends Paintt
{
	
}
class BadDog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("running......");
		}
		else if(item.equals("stone")) {
			System.out.println("biting....");
		}
		else if(item.equals("biscuit")) {
			System.out.println("enjoying...");
		}
	}
}
class GoodDog{
	public void play(Item item) {
		item.display();
	}
}
abstract class Item{
	public abstract void display();
}
class Stone1 extends Item{
	@Override
	public void display() {
		System.out.println("biting...............");
	}
}
class Stick2 extends Item{
	@Override
	public void display() {
		System.out.println("running....");
	}
}
class Biscuit2 extends Item{
	@Override
	public void display() {
		System.out.println("enjoying....");
	}

	}

