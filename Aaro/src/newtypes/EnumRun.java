package newtypes;

public class EnumRun 
{

	public static void main(String[] args)
	{
//		System.out.println(Fruites.MANGO.details);
//		met(Fruites.MANGO);
//	
	
		for(Fruites f:Fruites.values()) 
		{
			System.out.println(f.details);
		}
//		Fruites f=Fruites.MANGO;
//		switch(f) {
//		case APPLE:
//		{
//			System.out.println("this is apppppppppppppppppppppppppppppppppp");
//			break;
//		}
//		
//		case MANGO:
//		{
//		
//			System.out.println("this is maannnngggggggggggggggggggggggggggg");
//			break;
//		}
//		case BANANA:
//		{
//			System.out.println("this is maannnngggggggggggggggggggggggggggg");
//		}	break;
//		
//		default:
//		{
//			System.out.println("all your sins are forgiven....");
//		}
//		
//		
//		}
	}
	
	
	public static void met(Fruites fruit)
	{
		System.out.println(fruit.details);
	}
}
