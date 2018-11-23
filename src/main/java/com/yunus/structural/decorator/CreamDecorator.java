package com.yunus.structural.decorator;

// Concrete Decorator
public class CreamDecorator extends Decorator {

	protected CreamDecorator(BakeryComponent baseComponent) {
		super(baseComponent);
		this.name = "Cream";
		this.price = 1.0;
	}

}
