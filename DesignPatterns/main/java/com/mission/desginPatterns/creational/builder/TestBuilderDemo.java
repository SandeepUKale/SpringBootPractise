package com.mission.desginPatterns.creational.builder;

public class TestBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderBuilder orderBuilder = new OrderBuilder();
		OrderedItems oItems = orderBuilder.preparePizza();
		oItems.showItems();
		System.out.println("Order Cost: " + oItems.getCost());
	}

}
