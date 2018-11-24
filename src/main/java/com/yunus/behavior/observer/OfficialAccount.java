package com.yunus.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class OfficialAccount implements Subject {
	
	private String oaName;
	private List<Observer> followers;

	public OfficialAccount(String oaName) {
		this.oaName = oaName;
		followers = new ArrayList<Observer>();
	}
	
	public void register(Observer o) {
		followers.add(o);
		System.out.println(o + " has started following " + oaName);
	}

	public void unregister(Observer o) {
		followers.remove(o);
		System.out.println(o + " has stopped following " + oaName);
	}

	public void notifyAllObservers(String article) {
		for(Observer follower : followers) {
			follower.update(oaName, article);
		}
		System.out.println();
	}
	
	public void pushArticle(String article) {
		System.out.println("\n" + oaName + " has pushed :: " + article);
		notifyAllObservers(article);
	}

}
