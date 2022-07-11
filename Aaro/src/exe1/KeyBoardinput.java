package exe1;

	import java.util.Scanner;
	public class KeyBoardinput {
		public static void main(String[] args) {
			Scanner keyin=new Scanner(System.in);
			
			System.out.println("Please  enter your name..:");
			
			String name=keyin.next();
			
			System.out.println("Welcome Mr.../Ms...:"+name);
			
			System.out.println("Please enter your age..:");
			
			int age=keyin.nextInt();
			
			System.out.println("Your age is...:"+age);
		}
	}


