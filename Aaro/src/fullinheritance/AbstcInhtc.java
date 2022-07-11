package fullinheritance;

public class AbstcInhtc 
{

	public static void main(String[] args)
	{
		Pizza dominos=new Veg(new Veg(new Chicken(new Cheese())));
		System.out.println("Total cost="+dominos.cost());
		

		dominos=new Chicken();
		System.out.println("Chicken cost="+dominos.cost());
	}

}
abstract class Pizza
{
	 public abstract int   cost();                       
}
abstract class Flour  extends Pizza  
{
	
}
 class Veg extends Pizza
 {
	 Pizza py;
	 public Veg()
	 {
		 
		
	 }
	 public Veg(Pizza py)
	 {
		 this.py=py;
	 }
	public int cost()
	 {
		 if(py==null)
		 {
			 return 10;
		 }
		 else
			 return 10+py.cost();
	 }
 }
 class Chicken extends Pizza
 {
	 Pizza py;
	 public Chicken()
	 {
		 
		
	 }
	 public Chicken(Pizza py)
	 {
		 this.py=py;
	 }
	public int cost()
	 {
		 if(py==null)
		 {
			 return 30;
		 }
		 else
			 return 30+py.cost();
	 }
 }
 class Cheese extends Pizza
 {
	 Pizza py;
	 public Cheese()
	 {
		 
		
	 }
	 public Cheese(Pizza py)
	 {
		 this.py=py;
	 }
	public int cost()
	 {
		 if(py==null)
		 {
			 return 20;
		 }
		 else
			 return 20+py.cost();
	 }
 }
