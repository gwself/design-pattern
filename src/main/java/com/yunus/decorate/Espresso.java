package com.yunus.decorate;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
