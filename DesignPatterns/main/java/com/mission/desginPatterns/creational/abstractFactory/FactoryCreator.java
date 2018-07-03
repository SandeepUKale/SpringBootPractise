package com.mission.desginPatterns.creational.abstractFactory;

public class FactoryCreator {
	public static AbstractFactory getFactory(String factoryName) {
		if ("bank".equalsIgnoreCase(factoryName)) {
			return new BankFactory();
		}
		if ("loan".equalsIgnoreCase(factoryName)) {
			return new LoanFactory();
		}
		return null;
	}
}
