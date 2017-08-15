package com.yunus.decorate;

/**
 * 摩卡是装饰着 让它扩展至comdimentDecorator
 * @author yunus
 *
 */

public class Mocha extends ComdimentDecorator{

	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
