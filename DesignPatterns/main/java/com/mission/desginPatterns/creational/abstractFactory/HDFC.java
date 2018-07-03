package com.mission.desginPatterns.creational.abstractFactory;

public class HDFC implements Bank {
	private String name;

	public HDFC() {
		this.name = "HDFC";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "HDFC [name=" + name + "]";
	}

}
