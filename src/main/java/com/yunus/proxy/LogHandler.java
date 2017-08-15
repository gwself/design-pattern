package com.yunus.proxy;

import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
	
	private Object target;
	
	public LogHandler(Object target){
		this.target = target;
	}

	public void invoke(Object obj, Method m) {
		// TODO Auto-generated method stub
		try {
			System.out.println("日志打印开始");
			m.invoke(target);
			System.out.println("日志打印结束");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
