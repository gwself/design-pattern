package com.yunus.observe.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者类
 * @author yunus
 *
 */
public class ConcreteObserver implements Observer {

	private String name;

	public void update(Observable o, Object arg) {
		// 推得方式
		System.out.println(name + "收到了："+arg);
		// 拉的方式
		//System.out.println(name + "收到：主动拉"+((ConcreteWeatherSubject)o).getContent());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
