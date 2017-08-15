package com.yunus.proxy;

public class CarLog implements Moveable {

	private Moveable b;

	public CarLog(Moveable b) {
		this.b = b;
	}

	public void move() {
		System.out.println("记录汽车日志开始");
		b.move();
		System.out.println("记录汽车日志结束");
	}
}
