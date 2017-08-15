package com.yunus.proxy;

import java.util.Random;

/**
 * 被代理类
 * @author yunus
 *
 */
public class Car implements Moveable {

	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("汽车开始行走");
	}

}
