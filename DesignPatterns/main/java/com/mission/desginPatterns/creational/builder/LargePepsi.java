package com.mission.desginPatterns.creational.builder;

public class LargePepsi extends Pepsi {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public String toString() {
		return "LargePepsi [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
