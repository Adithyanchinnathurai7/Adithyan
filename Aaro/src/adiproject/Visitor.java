package adiproject;

public class Visitor {
	public static void main(String[] args) {

		ItemElement1[] items = new ItemElement1[] { new Fruit1(10, 2, "Banana"), new Fruit1(5, 5, "Apple"),
				new Book1(20, "1234"), new Book1(100, "5678") };

		int total = calculatePrice(items);
		System.out.println("tatol Cost:" + total);

	}

	private static int calculatePrice(ItemElement1[] items) {
		ShoppingCarVisitor1 visitor = new ShoppingCartVisitorIml1();
		int sum = 0;
		for (ItemElement1 item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;

	}

}

interface ShoppingCarVisitor1 {
	int visit(Book1 book);

	int visit(Fruit1 fruit);

}

interface ItemElement1 {
	public int accept(ShoppingCarVisitor1 visitor);
}

class ShoppingCartVisitorIml1 implements ShoppingCarVisitor1 {
	@Override
	public int visit(Book1 book) {
		int cost = 0;
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
			
		}
		System.out.println("Book ISBN::" + book.getIsbnNumber() + "cost=" + cost);

		return cost;
	}

	@Override
	public int visit(Fruit1 fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWight();
		System.out.println(fruit.getName() + "cost:" + cost);

		return cost;
	}
}

class Fruit1 implements ItemElement1 {
	private int pricePerkg;
	private int weight;
	private String name;

	public Fruit1(int priceKg, int wt, String nm) {
		this.pricePerkg = priceKg;
		this.weight = wt;
		this.name = nm;
	}

	public int getPricePerKg() {
		return pricePerkg;
	}

	public int getWight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCarVisitor1 visitor) {

		return visitor.visit(this);
	}

}

class Book1 implements ItemElement1 {
	private int price;
	private String isbnNumber;

	public Book1(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCarVisitor1 visitor) {

		return visitor.visit(this);
	}
}





class d{
	public fg get(fg g) {
		return g;
	}
}
class fg{
	
}