package com.yunus.observe;


public class Client {

	public static void main(String[] args) {
		// 创建目标
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		// 创建观察者
		ConreteObserver girl = new ConreteObserver();
		girl.setObserverName("小明的女朋友");
		girl.setRemindThing("购物");
		ConreteObserver mather = new ConreteObserver();
		mather.setObserverName("小明老妈");
		mather.setRemindThing("跳广场舞");
		// 注册
		subject.attach(girl);
		subject.attach(mather);
		// 发布天气
		subject.setWeatherContent("今天天气好好");

	}
}
