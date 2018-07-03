package com.mission.desginPatterns.creational.builder;

public class XLOnionVegPizza extends VegPizza {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Extra Large";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 175;
	}

	@Override
	public String toString() {
		return "XLOnionVegPizza [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
