package com.yunus.observe;
/**
 * 具体目标对象
 * @author yunus
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {

	// 获取天气信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}

}
