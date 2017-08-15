package com.yunus.decorate;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "darkRoast";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}

