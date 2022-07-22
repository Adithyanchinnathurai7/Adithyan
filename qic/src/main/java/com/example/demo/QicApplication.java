package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class QicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(QicApplication.class, args);
		
		ShoeShop shop=ctx.getBean("myshop",ShoeShop.class);
		System.out.println(shop.sellShoe());
	}

}
abstract class Shoe
{}

class LeatherShoe extends Shoe
{
	
}
class SportsShoe extends Shoe
{
	
}


abstract class Factory
{
	public abstract Shoe makeShoe();
	
}
@Component("bsf")
class BataShoeFactory extends Factory
{
	public BataShoeFactory() {
		System.out.println(" BataShoeFactory bject created...");
	}
	@Override
	public Shoe makeShoe() {
		
		return new LeatherShoe();
	}
}
@Component("lsf")
class LakhaniShoeFactory extends Factory
{
	public LakhaniShoeFactory() {
		System.out.println(" LakhaniShoeFactory bject created...");
	}
	@Override
	public Shoe makeShoe() {
		
		return new SportsShoe();
	}
}


abstract class ShoeShop
{
	@Autowired
	@Qualifier("lsf")
	private Factory factory;
	
	public void setFactory(Factory factory) {
		this.factory=factory;		
	}

	public Factory getFactory() {
		return factory;
	}
	public abstract Shoe sellShoe();
}
@Component("myshop") //object create anotation metta data container
class TrensShop extends ShoeShop
{
	
	public TrensShop() {
		System.out.println("TrensShop Object created...");
	}
	 @Override
	public Shoe sellShoe() {
		
		return getFactory().makeShoe();
	}
}

	





