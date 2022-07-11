

	
		class  Detials
		{	
			
			
			String name;
			int Age;
			String bank;
			String salary;
			
			Detials(String name,int Age,String bank,String salary)
			{
				this.Age = Age;
				this.bank = bank;
				this.name = name;
				this.salary = salary;
				
			}
		}
			
			
		public class Normaltest 
		{	
			
			  public static void main(String[] args) 
			  {
				 
				  Detials given = new Detials("Ajith",27,"IOB", "");
				 System.out.print(given.name + "\n " + given.Age + " \n " + given.bank + "\n " + given.salary);
				
			
			  }
		}


	


