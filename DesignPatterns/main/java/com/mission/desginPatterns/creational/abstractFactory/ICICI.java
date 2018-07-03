package com.mission.desginPatterns.creational.abstractFactory;

public class ICICI implements Bank {
	private String name;

	public ICICI() {
		this.name = "ICICI";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "ICICI [name=" + name + "]";
	}

}
