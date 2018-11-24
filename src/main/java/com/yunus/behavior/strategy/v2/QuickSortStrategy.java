package com.yunus.behavior.strategy.v2;

import java.util.List;

// ConcreteStrategy
public class QuickSortStrategy implements SortingStrategy {

	public void sort(List<Integer> list) {
		System.out.println("Sorting List using quick sort");
	}

}
