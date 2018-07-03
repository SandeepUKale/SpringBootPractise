package com.mission.desginPatterns.creational.builder;

public class MediumPepsi extends Pepsi {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Medium";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String toString() {
		return "MediumPepsi [getSize()=" + getSize() + ", getPrice()=" + getPrice() + "]";
	}

}
