package vin;

public class VaribTry {
	
	
		public static void main(String[] args)
		{
			House1.saram="welcome";
			System.out.println(House1.saram);
			
			/*House veedu1=new House();
			
			veedu1.saram="2 ton saram bought...";
			veedu1.toilet="western toilet...";
			System.out.println("Veedu1 saram...:"+House.saram);
			System.out.println("Veedu1 toilet..:"+veedu1.toilet);
			
			veedu1.toilet("gzdgzdf");*/
			
			House1 veedu2=new House1();
			veedu2.toilet="indian toilet...";
			System.out.println("Veedu2 saram...:"+House1.saram);
			System.out.println("Veedu2 toilet..:"+veedu2.toilet);
			veedu2.toilet("steel tap....");
			
			System.out.println("v1..:"+veedu2.toilet);
			System.out.println("v2..:"+veedu2.toilet);
			
			House.saram="3 ton saram....";
			
			System.out.println("v2...:"+House1.saram);
		}
	}
		class House1
		{
			static String saram;
			
			String toilet;
			 void toilet(String tap)
			{
				String taps=tap;
				System.out.println(taps);
				//System.out.println(""+House.saram);
			}
		}


