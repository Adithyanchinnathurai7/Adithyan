package chap6to10;

public class Adapter2 {
	public static void main(String[] args) {

		ShakthiPlug1 indianPlug1 = new ShakthiPlug1();
		AmericanPlug1 americanPlug1 = new LenovoPlug1();

		ShakthiSocket1 indianSocket1 = new ShakthiSocket1();
		IndianAdapter1 adapter1 = new IndianAdapter1(americanPlug1);
		indianSocket1.roundPinHole(adapter1);
	}
}

abstract class IndianPlug1 {
	public abstract void roundPin();
}

abstract class IndianSocket1 {
	public abstract void roundPinHole(IndianPlug1 ip);
}

abstract class AmericanPlug1 {
	public abstract void slabPin();
}

abstract class AmericanSocket1 {
	public abstract void slabPinHole(AmericanPlug1 ap);
}

class ShakthiPlug1 extends IndianPlug1 {
	@Override
	public void roundPin() {
		System.out.println("shakthi plug working....");
	}
}

class ShakthiSocket1 extends IndianSocket1 {
	@Override
	public void roundPinHole(IndianPlug1 ip) {
		ip.roundPin();
	}
}

class IndianAdapter1 extends IndianPlug1 {
	AmericanPlug1 app;

	public IndianAdapter1() {
		// TODO Auto-generated constructor stub
	}

	public IndianAdapter1(AmericanPlug1 ap) {
		this.app = app;
	}

	@Override
	public void roundPin() {
		app.slabPin();
	}
}

class LenovoPlug1 extends AmericanPlug1 {

	@Override
	public void slabPin() {
		System.out.println("american slab pin plug working....");
	}
}