package com.mission.desginPatterns.creational.abstractFactory;

public class SBI implements Bank {
	private String name;

	public SBI() {
		this.name = "SBI";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "SBI [name=" + name + "]";
	}

}
