package com.mission.desginPatterns.creational.abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory abstractFactory = FactoryCreator.getFactory("bank");
		Bank bank = abstractFactory.getBank("sbi");

		System.out.println(bank);
		abstractFactory = FactoryCreator.getFactory("loan");
		Loan loan = abstractFactory.getLoan("HOME");
		System.out.println(loan);
	}

}
