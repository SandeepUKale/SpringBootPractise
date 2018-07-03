package com.mission.desginPatterns.creational.builder;

public class SmallCoke extends ColdDrink {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Small";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String toString() {
		return "SmallCoke [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
