package com.yunus.proxy;


public class CarTime implements Moveable {

	private Moveable b;

	public CarTime(Moveable b) {
		this.b = b;
	}

	public void move() {
		long startTime = System.currentTimeMillis();
		b.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶时间为："+(endTime-startTime));
	}

}
