package com.mission.desginPatterns.creational.builder;

public class XLChickenNonVegPizza extends VegPizza {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Extra Large";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 190;
	}

	@Override
	public String toString() {
		return "XLChickenNonVegPizza [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
