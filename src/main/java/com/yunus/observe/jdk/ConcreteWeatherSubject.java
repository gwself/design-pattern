package com.yunus.observe.jdk;

import java.util.Observable;

//天气目标的具体实现类
public class ConcreteWeatherSubject extends Observable {

	// 天气内容
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//通知所有订阅者
		this.setChanged();// 通知前必须有
		this.notifyObservers(content);// 主动通知 这是推模型
		//this.notifyObservers();// 这是拉模式
	}

}

