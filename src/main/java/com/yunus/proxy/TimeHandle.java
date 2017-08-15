package com.yunus.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class TimeHandle implements InvocationHandler {

	private Object obj;

	public TimeHandle(Object obj){
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		method.invoke(obj);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶时间为："+(endTime-startTime));
		return null;
	}
}
