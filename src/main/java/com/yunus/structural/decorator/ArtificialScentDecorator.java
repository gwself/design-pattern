package com.yunus.structural.decorator;

//Concrete Decorator
public class ArtificialScentDecorator extends Decorator {

	protected ArtificialScentDecorator(BakeryComponent baseComponent) {
		super(baseComponent);
		this.name = "Artificial Scent";
		this.price = 3.0;
	}
	
}
