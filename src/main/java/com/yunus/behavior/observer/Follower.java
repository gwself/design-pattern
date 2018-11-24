package com.yunus.behavior.observer;

public class Follower implements Observer {
	
	private String followerName;
	
	public Follower(String followerName) {
		this.followerName = followerName;
	}

	public void update(String oaName, String article) {
		System.out.println(followerName + " has received " 
	              + oaName + "'s article :: " + article );
	}
	
	@Override
	public String toString() {
		return followerName;
	}

}
