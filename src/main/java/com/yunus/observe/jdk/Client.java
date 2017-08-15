package com.yunus.observe.jdk;

public class Client {

	public static void main(String[] args) {
		// 目标类
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		//观察者
		ConcreteObserver girl = new ConcreteObserver();
		girl.setName("女朋友");
		ConcreteObserver boy = new ConcreteObserver();
		boy.setName("男朋友");
		// 注册
		weather.addObserver(girl);
		weather.addObserver(boy);
		//通知
		for (int i = 0; i<100 ;i++) {
			weather.setContent("天气晴朗"+i);
		}
	}
}
