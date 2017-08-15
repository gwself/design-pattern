package com.yunus.decorate;
/**
 * 咖啡基类
 * @author yunus
 *
 */

public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();

}
