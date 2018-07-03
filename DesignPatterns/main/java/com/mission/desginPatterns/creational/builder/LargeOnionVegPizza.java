package com.mission.desginPatterns.creational.builder;

public class LargeOnionVegPizza extends VegPizza {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 140;
	}

	@Override
	public String toString() {
		return "LargeOnionVegPizza [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
