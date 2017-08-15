package com.yunus.template;

/**
 * 抽象基类，为所有子类提供一个算法框架 提升饮料
 *
 * @author yunus
 *
 */
public abstract class RefreshBeverage {

	/**
	 * 制备饮料模板方法 封装了所有子类共同遵循的算法框架
	 */
	public final void prepareBeverageTemplate() {
		// 步骤1.将水煮沸
		boilWater();
		// 炮制饮料
		brew();
		// 将饮料倒入杯中
		pourInCup();
		// 加入调味剂
		addCondiments();
	}

	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("倒入杯中");
	}

	protected abstract void brew();

	private void boilWater() {
		System.out.println("将水煮沸");
	}
}