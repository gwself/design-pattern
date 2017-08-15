package com.yunus.observe;
/**
 * 观察者接口 ，定义一个更新的接口给那些目标改变的时候通知对象
 * @author yunus
 *
 */
public interface Observer {

	// 更新接口
	void update(WeatherSubject subject);

}