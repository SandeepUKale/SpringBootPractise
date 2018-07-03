package com.mission.desginPatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {
	private List<Item> orderedItems = new ArrayList<Item>();

	public void addItem(Item item) {
		this.orderedItems.add(item);
	}

	public List<Item> getItems() {
		return this.orderedItems;
	}

	public double getCost() {
		double cost = 0.0;
		for (Item item : orderedItems) {
			cost += item.getPrice();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : orderedItems) {
			System.out.println(item);
		}
	}
}
