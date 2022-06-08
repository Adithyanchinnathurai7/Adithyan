package adiproject;

public class ComplxCls
{

	public static void main(String[] args) 
	{
		
	Vikram vk=new Vikram();
	vk.ticket=150;
	
	Don don=new Don();
	don.movie(vk);
	
	System.out.println("value ...:"+vk.ticket);
	}

}



class Vikram{
	int ticket;
}

class Don{
	public Vikram movie(Vikram vikram) {
		
		vikram.ticket=vikram.ticket+30;
		
		return vikram;
	}
	
}
