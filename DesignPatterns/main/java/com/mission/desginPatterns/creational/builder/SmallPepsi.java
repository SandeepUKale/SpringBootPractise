package com.mission.desginPatterns.creational.builder;

public class SmallPepsi extends Pepsi {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Small";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 21;
	}

	@Override
	public String toString() {
		return "SmallPepsi [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
