package com.yunus.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察他的观察者，并提供添加删除观察者
 * @author yunus
 *
 */
public class WeatherSubject {

	// 用来保存注册的观察者
	private List<Observer> observers = new ArrayList<Observer>();

	// 注册
	public void attach(Observer observer){
		observers.add(observer);
	}

	// 移除
	public void detach(Observer observer){
		observers.remove(observer);
	}

	//通知方法
	protected void notifyObservers(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
