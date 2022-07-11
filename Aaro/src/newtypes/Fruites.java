package newtypes;

public enum Fruites
{
	BANANA("I AM GREEN...."),MANGO("i am yellow"),APPLE("I AM RED");
	String details;
	private Fruites() 
	{
		
	}
	private Fruites(String details) 
	{
		this.details=details;
	}
}

