package adiproject;

public class ComplxCls2
{

	public static void main(String[] args) 
	{
		
	Vcik vk=new Vcik();
	vk.ticket=150;
	
	Ton don=new Ton();
	don.movie(vk);
	
	System.out.println("value ...:"+vk.ticket);
	}

}



class Vcik{
	int ticket;
}

class Ton{
	public Vcik movie(Vcik vikram) {
		
		vikram.ticket=vikram.ticket+30;
		
		return vikram;
	}
	
}
