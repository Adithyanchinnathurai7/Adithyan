package chap6to10;

public class ClassthisDemo {

	public static void main(String[] args) {
		Ball b = new Ball();
		Bat o = new Bat();
		
		System.out.println(b.met(o).i);
	}

}

class Bat 
	{
		int i=8;
	}

class Ball {
	Bat aaa;

	public Bat met(Bat b) {
		this.aaa = b;
		return this;
	}
}