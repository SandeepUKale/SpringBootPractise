package com.mission.desginPatterns.creational.builder;

public class LargeEggNonVegPizza extends NonVegPizza {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 160;
	}

	@Override
	public String toString() {
		return "LargeEggNonVegPizza [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
