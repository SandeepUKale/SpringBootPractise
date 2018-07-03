package com.mission.desginPatterns.creational.builder;

public abstract class Pizza implements Item {

	@Override
	public abstract String getSize();

	@Override
	public abstract int getPrice();

}
