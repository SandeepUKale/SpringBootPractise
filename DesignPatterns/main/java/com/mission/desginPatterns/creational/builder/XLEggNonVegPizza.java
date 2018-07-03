package com.mission.desginPatterns.creational.builder;

public class XLEggNonVegPizza extends VegPizza {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Extra Large";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 195;
	}

	@Override
	public String toString() {
		return "XLEggNonVegPizza [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
